package edu.stanford.bmir.protege.web.shared.event;

import edu.stanford.bmir.protege.web.shared.project.ProjectId;
import edu.stanford.bmir.protege.web.client.rpc.data.UserId;
import edu.stanford.bmir.protege.web.shared.dispatch.HasProjectAction;
import edu.stanford.bmir.protege.web.shared.events.EventTag;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 20/03/2013
 */
public class GetProjectEventsAction implements HasProjectAction<GetProjectEventsResult> {

    private ProjectId projectId;

    private UserId userId;

    private EventTag sinceTag;

    /**
     * For serialization purposes only.
     */
    private GetProjectEventsAction() {
    }

    public GetProjectEventsAction(EventTag sinceTag, ProjectId projectId, UserId userId) {
        this.sinceTag = sinceTag;
        this.projectId = projectId;
        this.userId = userId;
    }

    public EventTag getSinceTag() {
        return sinceTag;
    }

    @Override
    public ProjectId getProjectId() {
        return projectId;
    }

    public UserId getUserId() {
        return userId;
    }
}