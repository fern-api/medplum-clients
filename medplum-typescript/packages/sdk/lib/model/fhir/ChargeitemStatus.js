"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ChargeitemStatus = void 0;
exports.ChargeitemStatus = {
    Planned: "planned",
    Billable: "billable",
    Aborted: "aborted",
    Billed: "billed",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ChargeitemStatus.Planned:
                return visitor.planned();
            case exports.ChargeitemStatus.Billable:
                return visitor.billable();
            case exports.ChargeitemStatus.Aborted:
                return visitor.aborted();
            case exports.ChargeitemStatus.Billed:
                return visitor.billed();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ChargeitemStatus.js.map