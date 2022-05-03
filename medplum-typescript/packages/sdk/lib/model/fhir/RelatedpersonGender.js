"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RelatedpersonGender = void 0;
exports.RelatedpersonGender = {
    Male: "male",
    Female: "female",
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.RelatedpersonGender.Male:
                return visitor.male();
            case exports.RelatedpersonGender.Female:
                return visitor.female();
            case exports.RelatedpersonGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=RelatedpersonGender.js.map