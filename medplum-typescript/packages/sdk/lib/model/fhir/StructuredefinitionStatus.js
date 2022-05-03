"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.StructuredefinitionStatus = void 0;
exports.StructuredefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.StructuredefinitionStatus.Draft:
                return visitor.draft();
            case exports.StructuredefinitionStatus.Active:
                return visitor.active();
            case exports.StructuredefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=StructuredefinitionStatus.js.map