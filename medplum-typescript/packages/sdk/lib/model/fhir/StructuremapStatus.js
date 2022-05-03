"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.StructuremapStatus = void 0;
exports.StructuremapStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.StructuremapStatus.Draft:
                return visitor.draft();
            case exports.StructuremapStatus.Active:
                return visitor.active();
            case exports.StructuremapStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=StructuremapStatus.js.map