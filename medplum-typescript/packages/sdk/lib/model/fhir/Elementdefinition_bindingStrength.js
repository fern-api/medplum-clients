"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Elementdefinition_bindingStrength = void 0;
exports.Elementdefinition_bindingStrength = {
    Required: "required",
    Extensible: "extensible",
    Preferred: "preferred",
    Example: "example",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Elementdefinition_bindingStrength.Required:
                return visitor.required();
            case exports.Elementdefinition_bindingStrength.Extensible:
                return visitor.extensible();
            case exports.Elementdefinition_bindingStrength.Preferred:
                return visitor.preferred();
            case exports.Elementdefinition_bindingStrength.Example:
                return visitor.example();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Elementdefinition_bindingStrength.js.map