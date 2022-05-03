"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.EndpointStatus = void 0;
exports.EndpointStatus = {
    Active: "active",
    Suspended: "suspended",
    Error: "error",
    Off: "off",
    Test: "test",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.EndpointStatus.Active:
                return visitor.active();
            case exports.EndpointStatus.Suspended:
                return visitor.suspended();
            case exports.EndpointStatus.Error:
                return visitor.error();
            case exports.EndpointStatus.Off:
                return visitor.off();
            case exports.EndpointStatus.Test:
                return visitor.test();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=EndpointStatus.js.map