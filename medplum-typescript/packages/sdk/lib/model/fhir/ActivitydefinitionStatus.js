"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ActivitydefinitionStatus = void 0;
exports.ActivitydefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ActivitydefinitionStatus.Draft:
                return visitor.draft();
            case exports.ActivitydefinitionStatus.Active:
                return visitor.active();
            case exports.ActivitydefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ActivitydefinitionStatus.js.map