"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FlagStatus = void 0;
exports.FlagStatus = {
    Active: "active",
    Inactive: "inactive",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.FlagStatus.Active:
                return visitor.active();
            case exports.FlagStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=FlagStatus.js.map