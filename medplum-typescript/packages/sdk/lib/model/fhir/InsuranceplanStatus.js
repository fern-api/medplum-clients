"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.InsuranceplanStatus = void 0;
exports.InsuranceplanStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.InsuranceplanStatus.Draft:
                return visitor.draft();
            case exports.InsuranceplanStatus.Active:
                return visitor.active();
            case exports.InsuranceplanStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=InsuranceplanStatus.js.map