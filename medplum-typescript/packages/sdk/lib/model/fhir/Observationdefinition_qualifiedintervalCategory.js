"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Observationdefinition_qualifiedintervalCategory = void 0;
exports.Observationdefinition_qualifiedintervalCategory = {
    Reference: "reference",
    Critical: "critical",
    Absolute: "absolute",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Observationdefinition_qualifiedintervalCategory.Reference:
                return visitor.reference();
            case exports.Observationdefinition_qualifiedintervalCategory.Critical:
                return visitor.critical();
            case exports.Observationdefinition_qualifiedintervalCategory.Absolute:
                return visitor.absolute();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Observationdefinition_qualifiedintervalCategory.js.map