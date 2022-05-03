"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Composition_attesterMode = void 0;
exports.Composition_attesterMode = {
    Personal: "personal",
    Professional: "professional",
    Legal: "legal",
    Official: "official",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Composition_attesterMode.Personal:
                return visitor.personal();
            case exports.Composition_attesterMode.Professional:
                return visitor.professional();
            case exports.Composition_attesterMode.Legal:
                return visitor.legal();
            case exports.Composition_attesterMode.Official:
                return visitor.official();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Composition_attesterMode.js.map