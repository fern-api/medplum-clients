"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Testreport_participantType = void 0;
exports.Testreport_participantType = {
    Client: "client",
    Server: "server",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Testreport_participantType.Client:
                return visitor.client();
            case exports.Testreport_participantType.Server:
                return visitor.server();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Testreport_participantType.js.map