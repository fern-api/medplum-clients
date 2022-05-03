"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Capabilitystatement_resourceConditionaldelete = void 0;
exports.Capabilitystatement_resourceConditionaldelete = {
    Single: "single",
    Multiple: "multiple",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Capabilitystatement_resourceConditionaldelete.Single:
                return visitor.single();
            case exports.Capabilitystatement_resourceConditionaldelete.Multiple:
                return visitor.multiple();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Capabilitystatement_resourceConditionaldelete.js.map