"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Capabilitystatement_supportedmessageMode = void 0;
exports.Capabilitystatement_supportedmessageMode = {
    Sender: "sender",
    Receiver: "receiver",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Capabilitystatement_supportedmessageMode.Sender:
                return visitor.sender();
            case exports.Capabilitystatement_supportedmessageMode.Receiver:
                return visitor.receiver();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Capabilitystatement_supportedmessageMode.js.map