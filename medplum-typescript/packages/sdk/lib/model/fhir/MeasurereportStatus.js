"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MeasurereportStatus = void 0;
exports.MeasurereportStatus = {
    Complete: "complete",
    Pending: "pending",
    Error: "error",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.MeasurereportStatus.Complete:
                return visitor.complete();
            case exports.MeasurereportStatus.Pending:
                return visitor.pending();
            case exports.MeasurereportStatus.Error:
                return visitor.error();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=MeasurereportStatus.js.map