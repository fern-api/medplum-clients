"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Consent_dataMeaning = void 0;
exports.Consent_dataMeaning = {
    Instance: "instance",
    Related: "related",
    Dependents: "dependents",
    Authoredby: "authoredby",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Consent_dataMeaning.Instance:
                return visitor.instance();
            case exports.Consent_dataMeaning.Related:
                return visitor.related();
            case exports.Consent_dataMeaning.Dependents:
                return visitor.dependents();
            case exports.Consent_dataMeaning.Authoredby:
                return visitor.authoredby();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Consent_dataMeaning.js.map