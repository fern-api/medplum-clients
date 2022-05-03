"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Capabilitystatement_resourceReferencepolicyItem = void 0;
exports.Capabilitystatement_resourceReferencepolicyItem = {
    Literal: "literal",
    Logical: "logical",
    Resolves: "resolves",
    Enforced: "enforced",
    Local: "local",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Capabilitystatement_resourceReferencepolicyItem.Literal:
                return visitor.literal();
            case exports.Capabilitystatement_resourceReferencepolicyItem.Logical:
                return visitor.logical();
            case exports.Capabilitystatement_resourceReferencepolicyItem.Resolves:
                return visitor.resolves();
            case exports.Capabilitystatement_resourceReferencepolicyItem.Enforced:
                return visitor.enforced();
            case exports.Capabilitystatement_resourceReferencepolicyItem.Local:
                return visitor.local();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Capabilitystatement_resourceReferencepolicyItem.js.map