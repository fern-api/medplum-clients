"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResearchelementdefinitionStatus = void 0;
exports.ResearchelementdefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ResearchelementdefinitionStatus.Draft:
                return visitor.draft();
            case exports.ResearchelementdefinitionStatus.Active:
                return visitor.active();
            case exports.ResearchelementdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ResearchelementdefinitionStatus.js.map