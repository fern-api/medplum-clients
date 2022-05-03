"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.LocationStatus = void 0;
exports.LocationStatus = {
    Active: "active",
    Suspended: "suspended",
    Inactive: "inactive",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.LocationStatus.Active:
                return visitor.active();
            case exports.LocationStatus.Suspended:
                return visitor.suspended();
            case exports.LocationStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=LocationStatus.js.map