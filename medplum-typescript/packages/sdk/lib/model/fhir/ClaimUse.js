"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ClaimUse = void 0;
exports.ClaimUse = {
    Claim: "claim",
    Preauthorization: "preauthorization",
    Predetermination: "predetermination",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ClaimUse.Claim:
                return visitor.claim();
            case exports.ClaimUse.Preauthorization:
                return visitor.preauthorization();
            case exports.ClaimUse.Predetermination:
                return visitor.predetermination();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ClaimUse.js.map