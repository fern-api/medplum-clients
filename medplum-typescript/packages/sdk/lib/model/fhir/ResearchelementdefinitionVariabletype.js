"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ResearchelementdefinitionVariabletype = void 0;
exports.ResearchelementdefinitionVariabletype = {
    Dichotomous: "dichotomous",
    Continuous: "continuous",
    Descriptive: "descriptive",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ResearchelementdefinitionVariabletype.Dichotomous:
                return visitor.dichotomous();
            case exports.ResearchelementdefinitionVariabletype.Continuous:
                return visitor.continuous();
            case exports.ResearchelementdefinitionVariabletype.Descriptive:
                return visitor.descriptive();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ResearchelementdefinitionVariabletype.js.map