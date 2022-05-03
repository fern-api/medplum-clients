"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SubscriptionStatus = void 0;
exports.SubscriptionStatus = {
    Requested: "requested",
    Active: "active",
    Error: "error",
    Off: "off",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.SubscriptionStatus.Requested:
                return visitor.requested();
            case exports.SubscriptionStatus.Active:
                return visitor.active();
            case exports.SubscriptionStatus.Error:
                return visitor.error();
            case exports.SubscriptionStatus.Off:
                return visitor.off();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SubscriptionStatus.js.map