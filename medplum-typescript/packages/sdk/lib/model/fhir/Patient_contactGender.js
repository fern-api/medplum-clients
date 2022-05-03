"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Patient_contactGender = void 0;
exports.Patient_contactGender = {
    Male: "male",
    Female: "female",
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Patient_contactGender.Male:
                return visitor.male();
            case exports.Patient_contactGender.Female:
                return visitor.female();
            case exports.Patient_contactGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Patient_contactGender.js.map