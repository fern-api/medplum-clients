"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CompartmentdefinitionStatus = void 0;
exports.CompartmentdefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CompartmentdefinitionStatus.Draft:
                return visitor.draft();
            case exports.CompartmentdefinitionStatus.Active:
                return visitor.active();
            case exports.CompartmentdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CompartmentdefinitionStatus.js.map