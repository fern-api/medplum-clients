"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SpecimenStatus = void 0;
exports.SpecimenStatus = {
    Available: "available",
    Unavailable: "unavailable",
    Unsatisfactory: "unsatisfactory",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.SpecimenStatus.Available:
                return visitor.available();
            case exports.SpecimenStatus.Unavailable:
                return visitor.unavailable();
            case exports.SpecimenStatus.Unsatisfactory:
                return visitor.unsatisfactory();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=SpecimenStatus.js.map