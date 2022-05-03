"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Capabilitystatement_restMode = void 0;
exports.Capabilitystatement_restMode = {
    Client: "client",
    Server: "server",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Capabilitystatement_restMode.Client:
                return visitor.client();
            case exports.Capabilitystatement_restMode.Server:
                return visitor.server();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Capabilitystatement_restMode.js.map