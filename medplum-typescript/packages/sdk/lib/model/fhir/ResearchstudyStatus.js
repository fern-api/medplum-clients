"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResearchstudyStatus = void 0;
exports.ResearchstudyStatus = {
    Active: "active",
    Approved: "approved",
    Completed: "completed",
    Disapproved: "disapproved",
    Withdrawn: "withdrawn",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ResearchstudyStatus.Active:
                return visitor.active();
            case exports.ResearchstudyStatus.Approved:
                return visitor.approved();
            case exports.ResearchstudyStatus.Completed:
                return visitor.completed();
            case exports.ResearchstudyStatus.Disapproved:
                return visitor.disapproved();
            case exports.ResearchstudyStatus.Withdrawn:
                return visitor.withdrawn();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ResearchstudyStatus.js.map