"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EnrollmentresponseOutcome = void 0;
exports.EnrollmentresponseOutcome = {
    Queued: "queued",
    Complete: "complete",
    Error: "error",
    Partial: "partial",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.EnrollmentresponseOutcome.Queued:
                return visitor.queued();
            case exports.EnrollmentresponseOutcome.Complete:
                return visitor.complete();
            case exports.EnrollmentresponseOutcome.Error:
                return visitor.error();
            case exports.EnrollmentresponseOutcome.Partial:
                return visitor.partial();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=EnrollmentresponseOutcome.js.map