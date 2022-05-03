"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Molecularsequence_qualityType = void 0;
exports.Molecularsequence_qualityType = {
    Indel: "indel",
    Snp: "snp",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Molecularsequence_qualityType.Indel:
                return visitor.indel();
            case exports.Molecularsequence_qualityType.Snp:
                return visitor.snp();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Molecularsequence_qualityType.js.map