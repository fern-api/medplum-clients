"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Structuredefinition_contextType = void 0;
exports.Structuredefinition_contextType = {
    Fhirpath: "fhirpath",
    Element: "element",
    Extension: "extension",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Structuredefinition_contextType.Fhirpath:
                return visitor.fhirpath();
            case exports.Structuredefinition_contextType.Element:
                return visitor.element();
            case exports.Structuredefinition_contextType.Extension:
                return visitor.extension();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Structuredefinition_contextType.js.map