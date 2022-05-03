"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DevicemetricOperationalstatus = void 0;
exports.DevicemetricOperationalstatus = {
    On: "on",
    Off: "off",
    Standby: "standby",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.DevicemetricOperationalstatus.On:
                return visitor.on();
            case exports.DevicemetricOperationalstatus.Off:
                return visitor.off();
            case exports.DevicemetricOperationalstatus.Standby:
                return visitor.standby();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=DevicemetricOperationalstatus.js.map