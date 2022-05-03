"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CoverageeligibilityresponsePurposeItem = void 0;
exports.CoverageeligibilityresponsePurposeItem = {
    Benefits: "benefits",
    Discovery: "discovery",
    Validation: "validation",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CoverageeligibilityresponsePurposeItem.Benefits:
                return visitor.benefits();
            case exports.CoverageeligibilityresponsePurposeItem.Discovery:
                return visitor.discovery();
            case exports.CoverageeligibilityresponsePurposeItem.Validation:
                return visitor.validation();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CoverageeligibilityresponsePurposeItem.js.map