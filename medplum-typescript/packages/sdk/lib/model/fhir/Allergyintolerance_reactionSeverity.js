"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Allergyintolerance_reactionSeverity = void 0;
exports.Allergyintolerance_reactionSeverity = {
    Mild: "mild",
    Moderate: "moderate",
    Severe: "severe",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Allergyintolerance_reactionSeverity.Mild:
                return visitor.mild();
            case exports.Allergyintolerance_reactionSeverity.Moderate:
                return visitor.moderate();
            case exports.Allergyintolerance_reactionSeverity.Severe:
                return visitor.severe();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Allergyintolerance_reactionSeverity.js.map