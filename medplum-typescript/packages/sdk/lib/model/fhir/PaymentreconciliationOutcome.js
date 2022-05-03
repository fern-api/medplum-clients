"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PaymentreconciliationOutcome = void 0;
exports.PaymentreconciliationOutcome = {
    Queued: "queued",
    Complete: "complete",
    Error: "error",
    Partial: "partial",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.PaymentreconciliationOutcome.Queued:
                return visitor.queued();
            case exports.PaymentreconciliationOutcome.Complete:
                return visitor.complete();
            case exports.PaymentreconciliationOutcome.Error:
                return visitor.error();
            case exports.PaymentreconciliationOutcome.Partial:
                return visitor.partial();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=PaymentreconciliationOutcome.js.map