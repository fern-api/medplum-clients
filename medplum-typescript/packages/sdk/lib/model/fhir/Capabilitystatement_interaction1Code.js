"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Capabilitystatement_interaction1Code = void 0;
exports.Capabilitystatement_interaction1Code = {
    Transaction: "transaction",
    Batch: "batch",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Capabilitystatement_interaction1Code.Transaction:
                return visitor.transaction();
            case exports.Capabilitystatement_interaction1Code.Batch:
                return visitor.batch();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Capabilitystatement_interaction1Code.js.map