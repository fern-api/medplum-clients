"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EffectevidencesynthesisStatus = void 0;
exports.EffectevidencesynthesisStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.EffectevidencesynthesisStatus.Draft:
                return visitor.draft();
            case exports.EffectevidencesynthesisStatus.Active:
                return visitor.active();
            case exports.EffectevidencesynthesisStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=EffectevidencesynthesisStatus.js.map