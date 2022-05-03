"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GoalLifecyclestatus = void 0;
exports.GoalLifecyclestatus = {
    Proposed: "proposed",
    Planned: "planned",
    Accepted: "accepted",
    Active: "active",
    Completed: "completed",
    Cancelled: "cancelled",
    Rejected: "rejected",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.GoalLifecyclestatus.Proposed:
                return visitor.proposed();
            case exports.GoalLifecyclestatus.Planned:
                return visitor.planned();
            case exports.GoalLifecyclestatus.Accepted:
                return visitor.accepted();
            case exports.GoalLifecyclestatus.Active:
                return visitor.active();
            case exports.GoalLifecyclestatus.Completed:
                return visitor.completed();
            case exports.GoalLifecyclestatus.Cancelled:
                return visitor.cancelled();
            case exports.GoalLifecyclestatus.Rejected:
                return visitor.rejected();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=GoalLifecyclestatus.js.map