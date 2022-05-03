"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Molecularsequence_referenceseqStrand = void 0;
exports.Molecularsequence_referenceseqStrand = {
    Watson: "watson",
    Crick: "crick",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Molecularsequence_referenceseqStrand.Watson:
                return visitor.watson();
            case exports.Molecularsequence_referenceseqStrand.Crick:
                return visitor.crick();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Molecularsequence_referenceseqStrand.js.map