"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ImplementationguideLicense = void 0;
exports.ImplementationguideLicense = {
    Aal: "AAL",
    Abstyles: "Abstyles",
    Aladdin: "Aladdin",
    Amdplpa: "AMDPLPA",
    Aml: "AML",
    Ampas: "AMPAS",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ImplementationguideLicense.Aal:
                return visitor.aal();
            case exports.ImplementationguideLicense.Abstyles:
                return visitor.abstyles();
            case exports.ImplementationguideLicense.Aladdin:
                return visitor.aladdin();
            case exports.ImplementationguideLicense.Amdplpa:
                return visitor.amdplpa();
            case exports.ImplementationguideLicense.Aml:
                return visitor.aml();
            case exports.ImplementationguideLicense.Ampas:
                return visitor.ampas();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ImplementationguideLicense.js.map