"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MolecularsequenceType = void 0;
exports.MolecularsequenceType = {
    Aa: "aa",
    Dna: "dna",
    Rna: "rna",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.MolecularsequenceType.Aa:
                return visitor.aa();
            case exports.MolecularsequenceType.Dna:
                return visitor.dna();
            case exports.MolecularsequenceType.Rna:
                return visitor.rna();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=MolecularsequenceType.js.map