"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EvidenceStatus = void 0;
exports.EvidenceStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.EvidenceStatus.Draft:
                return visitor.draft();
            case exports.EvidenceStatus.Active:
                return visitor.active();
            case exports.EvidenceStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=EvidenceStatus.js.map