"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Elementdefinition_discriminatorType = void 0;
exports.Elementdefinition_discriminatorType = {
    Value: "value",
    Exists: "exists",
    Pattern: "pattern",
    Type: "type",
    Profile: "profile",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Elementdefinition_discriminatorType.Value:
                return visitor.value();
            case exports.Elementdefinition_discriminatorType.Exists:
                return visitor.exists();
            case exports.Elementdefinition_discriminatorType.Pattern:
                return visitor.pattern();
            case exports.Elementdefinition_discriminatorType.Type:
                return visitor.type();
            case exports.Elementdefinition_discriminatorType.Profile:
                return visitor.profile();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Elementdefinition_discriminatorType.js.map