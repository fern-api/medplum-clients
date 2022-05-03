"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TestreportStatus = void 0;
exports.TestreportStatus = {
    Completed: "completed",
    Waiting: "waiting",
    Stopped: "stopped",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.TestreportStatus.Completed:
                return visitor.completed();
            case exports.TestreportStatus.Waiting:
                return visitor.waiting();
            case exports.TestreportStatus.Stopped:
                return visitor.stopped();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=TestreportStatus.js.map