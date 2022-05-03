"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DeviceStatus = void 0;
exports.DeviceStatus = {
    Active: "active",
    Inactive: "inactive",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.DeviceStatus.Active:
                return visitor.active();
            case exports.DeviceStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=DeviceStatus.js.map