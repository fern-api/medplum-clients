"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RiskevidencesynthesisStatus = void 0;
exports.RiskevidencesynthesisStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.RiskevidencesynthesisStatus.Draft:
                return visitor.draft();
            case exports.RiskevidencesynthesisStatus.Active:
                return visitor.active();
            case exports.RiskevidencesynthesisStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=RiskevidencesynthesisStatus.js.map