"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResearchdefinitionStatus = void 0;
exports.ResearchdefinitionStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ResearchdefinitionStatus.Draft:
                return visitor.draft();
            case exports.ResearchdefinitionStatus.Active:
                return visitor.active();
            case exports.ResearchdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ResearchdefinitionStatus.js.map