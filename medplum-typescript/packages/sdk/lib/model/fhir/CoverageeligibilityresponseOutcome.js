"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CoverageeligibilityresponseOutcome = void 0;
exports.CoverageeligibilityresponseOutcome = {
    Queued: "queued",
    Complete: "complete",
    Error: "error",
    Partial: "partial",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CoverageeligibilityresponseOutcome.Queued:
                return visitor.queued();
            case exports.CoverageeligibilityresponseOutcome.Complete:
                return visitor.complete();
            case exports.CoverageeligibilityresponseOutcome.Error:
                return visitor.error();
            case exports.CoverageeligibilityresponseOutcome.Partial:
                return visitor.partial();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CoverageeligibilityresponseOutcome.js.map