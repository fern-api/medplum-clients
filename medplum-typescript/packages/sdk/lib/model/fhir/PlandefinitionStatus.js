"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PlandefinitionStatus = void 0;
exports.PlandefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.PlandefinitionStatus.Draft:
                return visitor.draft();
            case exports.PlandefinitionStatus.Active:
                return visitor.active();
            case exports.PlandefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=PlandefinitionStatus.js.map