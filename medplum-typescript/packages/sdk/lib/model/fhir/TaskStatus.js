"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TaskStatus = void 0;
exports.TaskStatus = {
    Draft: "draft",
    Requested: "requested",
    Received: "received",
    Accepted: "accepted",
    Rejected: "rejected",
    Ready: "ready",
    Cancelled: "cancelled",
    Failed: "failed",
    Completed: "completed",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.TaskStatus.Draft:
                return visitor.draft();
            case exports.TaskStatus.Requested:
                return visitor.requested();
            case exports.TaskStatus.Received:
                return visitor.received();
            case exports.TaskStatus.Accepted:
                return visitor.accepted();
            case exports.TaskStatus.Rejected:
                return visitor.rejected();
            case exports.TaskStatus.Ready:
                return visitor.ready();
            case exports.TaskStatus.Cancelled:
                return visitor.cancelled();
            case exports.TaskStatus.Failed:
                return visitor.failed();
            case exports.TaskStatus.Completed:
                return visitor.completed();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=TaskStatus.js.map