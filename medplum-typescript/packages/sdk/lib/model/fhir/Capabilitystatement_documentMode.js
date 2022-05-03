"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Capabilitystatement_documentMode = void 0;
exports.Capabilitystatement_documentMode = {
    Producer: "producer",
    Consumer: "consumer",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Capabilitystatement_documentMode.Producer:
                return visitor.producer();
            case exports.Capabilitystatement_documentMode.Consumer:
                return visitor.consumer();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Capabilitystatement_documentMode.js.map