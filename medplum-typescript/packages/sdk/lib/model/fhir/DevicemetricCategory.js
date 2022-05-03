"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DevicemetricCategory = void 0;
exports.DevicemetricCategory = {
    Measurement: "measurement",
    Setting: "setting",
    Calculation: "calculation",
    Unspecified: "unspecified",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.DevicemetricCategory.Measurement:
                return visitor.measurement();
            case exports.DevicemetricCategory.Setting:
                return visitor.setting();
            case exports.DevicemetricCategory.Calculation:
                return visitor.calculation();
            case exports.DevicemetricCategory.Unspecified:
                return visitor.unspecified();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=DevicemetricCategory.js.map