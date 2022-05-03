"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Elementdefinition_typeVersioning = void 0;
exports.Elementdefinition_typeVersioning = {
    Either: "either",
    Independent: "independent",
    Specific: "specific",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Elementdefinition_typeVersioning.Either:
                return visitor.either();
            case exports.Elementdefinition_typeVersioning.Independent:
                return visitor.independent();
            case exports.Elementdefinition_typeVersioning.Specific:
                return visitor.specific();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Elementdefinition_typeVersioning.js.map