"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Capabilitystatement_interactionCode = void 0;
exports.Capabilitystatement_interactionCode = {
    Read: "read",
    Vread: "vread",
    Update: "update",
    Patch: "patch",
    Delete: "delete",
    Create: "create",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Capabilitystatement_interactionCode.Read:
                return visitor.read();
            case exports.Capabilitystatement_interactionCode.Vread:
                return visitor.vread();
            case exports.Capabilitystatement_interactionCode.Update:
                return visitor.update();
            case exports.Capabilitystatement_interactionCode.Patch:
                return visitor.patch();
            case exports.Capabilitystatement_interactionCode.Delete:
                return visitor.delete();
            case exports.Capabilitystatement_interactionCode.Create:
                return visitor.create();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Capabilitystatement_interactionCode.js.map