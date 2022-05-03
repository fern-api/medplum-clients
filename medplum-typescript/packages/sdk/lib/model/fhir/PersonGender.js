"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PersonGender = void 0;
exports.PersonGender = {
    Male: "male",
    Female: "female",
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.PersonGender.Male:
                return visitor.male();
            case exports.PersonGender.Female:
                return visitor.female();
            case exports.PersonGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=PersonGender.js.map