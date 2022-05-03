"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AccountStatus = void 0;
exports.AccountStatus = {
    Active: "active",
    Inactive: "inactive",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.AccountStatus.Active:
                return visitor.active();
            case exports.AccountStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=AccountStatus.js.map