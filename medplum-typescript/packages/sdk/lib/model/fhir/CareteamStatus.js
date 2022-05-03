"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CareteamStatus = void 0;
exports.CareteamStatus = {
    Proposed: "proposed",
    Active: "active",
    Suspended: "suspended",
    Inactive: "inactive",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CareteamStatus.Proposed:
                return visitor.proposed();
            case exports.CareteamStatus.Active:
                return visitor.active();
            case exports.CareteamStatus.Suspended:
                return visitor.suspended();
            case exports.CareteamStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CareteamStatus.js.map