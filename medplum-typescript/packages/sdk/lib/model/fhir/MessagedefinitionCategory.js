"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MessagedefinitionCategory = void 0;
exports.MessagedefinitionCategory = {
    Consequence: "consequence",
    Currency: "currency",
    Notification: "notification",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.MessagedefinitionCategory.Consequence:
                return visitor.consequence();
            case exports.MessagedefinitionCategory.Currency:
                return visitor.currency();
            case exports.MessagedefinitionCategory.Notification:
                return visitor.notification();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=MessagedefinitionCategory.js.map