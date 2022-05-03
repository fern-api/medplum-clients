"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Provenance_entityRole = void 0;
exports.Provenance_entityRole = {
    Derivation: "derivation",
    Revision: "revision",
    Quotation: "quotation",
    Source: "source",
    Removal: "removal",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Provenance_entityRole.Derivation:
                return visitor.derivation();
            case exports.Provenance_entityRole.Revision:
                return visitor.revision();
            case exports.Provenance_entityRole.Quotation:
                return visitor.quotation();
            case exports.Provenance_entityRole.Source:
                return visitor.source();
            case exports.Provenance_entityRole.Removal:
                return visitor.removal();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Provenance_entityRole.js.map