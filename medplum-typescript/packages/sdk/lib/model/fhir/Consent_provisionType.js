"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Consent_provisionType = void 0;
exports.Consent_provisionType = {
    Deny: "deny",
    Permit: "permit",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Consent_provisionType.Deny:
                return visitor.deny();
            case exports.Consent_provisionType.Permit:
                return visitor.permit();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Consent_provisionType.js.map