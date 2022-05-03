"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Subscription_channelType = void 0;
exports.Subscription_channelType = {
    Websocket: "websocket",
    Email: "email",
    Sms: "sms",
    Message: "message",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Subscription_channelType.Websocket:
                return visitor.websocket();
            case exports.Subscription_channelType.Email:
                return visitor.email();
            case exports.Subscription_channelType.Sms:
                return visitor.sms();
            case exports.Subscription_channelType.Message:
                return visitor.message();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Subscription_channelType.js.map