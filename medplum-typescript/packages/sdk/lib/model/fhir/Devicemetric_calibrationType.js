"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Devicemetric_calibrationType = void 0;
exports.Devicemetric_calibrationType = {
    Unspecified: "unspecified",
    Offset: "offset",
    Gain: "gain",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Devicemetric_calibrationType.Unspecified:
                return visitor.unspecified();
            case exports.Devicemetric_calibrationType.Offset:
                return visitor.offset();
            case exports.Devicemetric_calibrationType.Gain:
                return visitor.gain();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Devicemetric_calibrationType.js.map