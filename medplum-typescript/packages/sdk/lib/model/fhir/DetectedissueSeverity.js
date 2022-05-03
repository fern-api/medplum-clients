"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DetectedissueSeverity = void 0;
exports.DetectedissueSeverity = {
    High: "high",
    Moderate: "moderate",
    Low: "low",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.DetectedissueSeverity.High:
                return visitor.high();
            case exports.DetectedissueSeverity.Moderate:
                return visitor.moderate();
            case exports.DetectedissueSeverity.Low:
                return visitor.low();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=DetectedissueSeverity.js.map