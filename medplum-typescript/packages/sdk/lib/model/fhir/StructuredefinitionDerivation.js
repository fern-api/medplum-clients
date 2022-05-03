"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.StructuredefinitionDerivation = void 0;
exports.StructuredefinitionDerivation = {
    Specialization: "specialization",
    Constraint: "constraint",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.StructuredefinitionDerivation.Specialization:
                return visitor.specialization();
            case exports.StructuredefinitionDerivation.Constraint:
                return visitor.constraint();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=StructuredefinitionDerivation.js.map