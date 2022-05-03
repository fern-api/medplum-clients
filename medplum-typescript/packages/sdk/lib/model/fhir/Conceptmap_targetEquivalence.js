"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Conceptmap_targetEquivalence = void 0;
exports.Conceptmap_targetEquivalence = {
    Relatedto: "relatedto",
    Equivalent: "equivalent",
    Equal: "equal",
    Wider: "wider",
    Subsumes: "subsumes",
    Narrower: "narrower",
    Specializes: "specializes",
    Inexact: "inexact",
    Unmatched: "unmatched",
    Disjoint: "disjoint",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Conceptmap_targetEquivalence.Relatedto:
                return visitor.relatedto();
            case exports.Conceptmap_targetEquivalence.Equivalent:
                return visitor.equivalent();
            case exports.Conceptmap_targetEquivalence.Equal:
                return visitor.equal();
            case exports.Conceptmap_targetEquivalence.Wider:
                return visitor.wider();
            case exports.Conceptmap_targetEquivalence.Subsumes:
                return visitor.subsumes();
            case exports.Conceptmap_targetEquivalence.Narrower:
                return visitor.narrower();
            case exports.Conceptmap_targetEquivalence.Specializes:
                return visitor.specializes();
            case exports.Conceptmap_targetEquivalence.Inexact:
                return visitor.inexact();
            case exports.Conceptmap_targetEquivalence.Unmatched:
                return visitor.unmatched();
            case exports.Conceptmap_targetEquivalence.Disjoint:
                return visitor.disjoint();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Conceptmap_targetEquivalence.js.map