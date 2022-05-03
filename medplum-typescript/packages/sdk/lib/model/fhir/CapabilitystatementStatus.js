"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CapabilitystatementStatus = void 0;
exports.CapabilitystatementStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CapabilitystatementStatus.Draft:
                return visitor.draft();
            case exports.CapabilitystatementStatus.Active:
                return visitor.active();
            case exports.CapabilitystatementStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CapabilitystatementStatus.js.map