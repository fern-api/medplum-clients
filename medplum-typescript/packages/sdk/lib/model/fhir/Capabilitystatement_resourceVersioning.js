"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Capabilitystatement_resourceVersioning = void 0;
exports.Capabilitystatement_resourceVersioning = {
    Versioned: "versioned",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Capabilitystatement_resourceVersioning.Versioned:
                return visitor.versioned();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Capabilitystatement_resourceVersioning.js.map