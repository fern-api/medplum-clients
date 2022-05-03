"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Molecularsequence_referenceseqOrientation = void 0;
exports.Molecularsequence_referenceseqOrientation = {
    Sense: "sense",
    Antisense: "antisense",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Molecularsequence_referenceseqOrientation.Sense:
                return visitor.sense();
            case exports.Molecularsequence_referenceseqOrientation.Antisense:
                return visitor.antisense();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Molecularsequence_referenceseqOrientation.js.map