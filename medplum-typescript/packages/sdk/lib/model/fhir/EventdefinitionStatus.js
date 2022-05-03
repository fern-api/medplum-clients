"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EventdefinitionStatus = void 0;
exports.EventdefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.EventdefinitionStatus.Draft:
                return visitor.draft();
            case exports.EventdefinitionStatus.Active:
                return visitor.active();
            case exports.EventdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=EventdefinitionStatus.js.map