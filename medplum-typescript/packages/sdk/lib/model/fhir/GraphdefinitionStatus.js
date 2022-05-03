"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GraphdefinitionStatus = void 0;
exports.GraphdefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.GraphdefinitionStatus.Draft:
                return visitor.draft();
            case exports.GraphdefinitionStatus.Active:
                return visitor.active();
            case exports.GraphdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=GraphdefinitionStatus.js.map