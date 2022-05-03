"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Devicemetric_calibrationState = void 0;
exports.Devicemetric_calibrationState = {
    Calibrated: "calibrated",
    Unspecified: "unspecified",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Devicemetric_calibrationState.Calibrated:
                return visitor.calibrated();
            case exports.Devicemetric_calibrationState.Unspecified:
                return visitor.unspecified();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Devicemetric_calibrationState.js.map