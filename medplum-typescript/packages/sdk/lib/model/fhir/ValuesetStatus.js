"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ValuesetStatus = void 0;
exports.ValuesetStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ValuesetStatus.Draft:
                return visitor.draft();
            case exports.ValuesetStatus.Active:
                return visitor.active();
            case exports.ValuesetStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ValuesetStatus.js.map