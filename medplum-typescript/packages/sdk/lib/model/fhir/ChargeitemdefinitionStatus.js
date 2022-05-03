"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ChargeitemdefinitionStatus = void 0;
exports.ChargeitemdefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ChargeitemdefinitionStatus.Draft:
                return visitor.draft();
            case exports.ChargeitemdefinitionStatus.Active:
                return visitor.active();
            case exports.ChargeitemdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ChargeitemdefinitionStatus.js.map