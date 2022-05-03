"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CapabilitystatementKind = void 0;
exports.CapabilitystatementKind = {
    Instance: "instance",
    Capability: "capability",
    Requirements: "requirements",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CapabilitystatementKind.Instance:
                return visitor.instance();
            case exports.CapabilitystatementKind.Capability:
                return visitor.capability();
            case exports.CapabilitystatementKind.Requirements:
                return visitor.requirements();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CapabilitystatementKind.js.map