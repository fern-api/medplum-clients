"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PatientGender = void 0;
exports.PatientGender = {
    Male: "male",
    Female: "female",
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.PatientGender.Male:
                return visitor.male();
            case exports.PatientGender.Female:
                return visitor.female();
            case exports.PatientGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=PatientGender.js.map