"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ListMode = void 0;
exports.ListMode = {
    Working: "working",
    Snapshot: "snapshot",
    Changes: "changes",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ListMode.Working:
                return visitor.working();
            case exports.ListMode.Snapshot:
                return visitor.snapshot();
            case exports.ListMode.Changes:
                return visitor.changes();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ListMode.js.map