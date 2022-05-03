"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PractitionerGender = void 0;
exports.PractitionerGender = {
    Male: "male",
    Female: "female",
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.PractitionerGender.Male:
                return visitor.male();
            case exports.PractitionerGender.Female:
                return visitor.female();
            case exports.PractitionerGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=PractitionerGender.js.map