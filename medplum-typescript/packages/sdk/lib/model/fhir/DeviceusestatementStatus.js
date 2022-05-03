"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DeviceusestatementStatus = void 0;
exports.DeviceusestatementStatus = {
    Active: "active",
    Completed: "completed",
    Intended: "intended",
    Stopped: "stopped",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.DeviceusestatementStatus.Active:
                return visitor.active();
            case exports.DeviceusestatementStatus.Completed:
                return visitor.completed();
            case exports.DeviceusestatementStatus.Intended:
                return visitor.intended();
            case exports.DeviceusestatementStatus.Stopped:
                return visitor.stopped();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=DeviceusestatementStatus.js.map