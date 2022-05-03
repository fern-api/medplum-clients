"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ConceptmapStatus = void 0;
exports.ConceptmapStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ConceptmapStatus.Draft:
                return visitor.draft();
            case exports.ConceptmapStatus.Active:
                return visitor.active();
            case exports.ConceptmapStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ConceptmapStatus.js.map