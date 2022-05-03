"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Device_devicenameType = void 0;
exports.Device_devicenameType = {
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Device_devicenameType.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Device_devicenameType.js.map