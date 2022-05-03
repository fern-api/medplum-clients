"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Operationdefinition_bindingStrength = void 0;
exports.Operationdefinition_bindingStrength = {
    Required: "required",
    Extensible: "extensible",
    Preferred: "preferred",
    Example: "example",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Operationdefinition_bindingStrength.Required:
                return visitor.required();
            case exports.Operationdefinition_bindingStrength.Extensible:
                return visitor.extensible();
            case exports.Operationdefinition_bindingStrength.Preferred:
                return visitor.preferred();
            case exports.Operationdefinition_bindingStrength.Example:
                return visitor.example();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Operationdefinition_bindingStrength.js.map