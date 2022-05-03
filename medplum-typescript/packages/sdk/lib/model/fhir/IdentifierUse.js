"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.IdentifierUse = void 0;
exports.IdentifierUse = {
    Usual: "usual",
    Official: "official",
    Temp: "temp",
    Secondary: "secondary",
    Old: "old",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.IdentifierUse.Usual:
                return visitor.usual();
            case exports.IdentifierUse.Official:
                return visitor.official();
            case exports.IdentifierUse.Temp:
                return visitor.temp();
            case exports.IdentifierUse.Secondary:
                return visitor.secondary();
            case exports.IdentifierUse.Old:
                return visitor.old();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=IdentifierUse.js.map