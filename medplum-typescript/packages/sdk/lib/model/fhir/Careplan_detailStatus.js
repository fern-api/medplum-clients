"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Careplan_detailStatus = void 0;
exports.Careplan_detailStatus = {
    Scheduled: "scheduled",
    Completed: "completed",
    Cancelled: "cancelled",
    Stopped: "stopped",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Careplan_detailStatus.Scheduled:
                return visitor.scheduled();
            case exports.Careplan_detailStatus.Completed:
                return visitor.completed();
            case exports.Careplan_detailStatus.Cancelled:
                return visitor.cancelled();
            case exports.Careplan_detailStatus.Stopped:
                return visitor.stopped();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Careplan_detailStatus.js.map