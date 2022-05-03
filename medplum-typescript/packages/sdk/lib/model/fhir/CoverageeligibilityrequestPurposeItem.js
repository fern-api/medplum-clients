"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CoverageeligibilityrequestPurposeItem = void 0;
exports.CoverageeligibilityrequestPurposeItem = {
    Benefits: "benefits",
    Discovery: "discovery",
    Validation: "validation",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CoverageeligibilityrequestPurposeItem.Benefits:
                return visitor.benefits();
            case exports.CoverageeligibilityrequestPurposeItem.Discovery:
                return visitor.discovery();
            case exports.CoverageeligibilityrequestPurposeItem.Validation:
                return visitor.validation();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CoverageeligibilityrequestPurposeItem.js.map