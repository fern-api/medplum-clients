"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EvidencevariableType = void 0;
exports.EvidencevariableType = {
    Dichotomous: "dichotomous",
    Continuous: "continuous",
    Descriptive: "descriptive",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.EvidencevariableType.Dichotomous:
                return visitor.dichotomous();
            case exports.EvidencevariableType.Continuous:
                return visitor.continuous();
            case exports.EvidencevariableType.Descriptive:
                return visitor.descriptive();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=EvidencevariableType.js.map