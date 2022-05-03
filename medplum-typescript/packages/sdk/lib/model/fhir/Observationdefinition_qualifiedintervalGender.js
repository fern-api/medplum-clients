"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Observationdefinition_qualifiedintervalGender = void 0;
exports.Observationdefinition_qualifiedintervalGender = {
    Male: "male",
    Female: "female",
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Observationdefinition_qualifiedintervalGender.Male:
                return visitor.male();
            case exports.Observationdefinition_qualifiedintervalGender.Female:
                return visitor.female();
            case exports.Observationdefinition_qualifiedintervalGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Observationdefinition_qualifiedintervalGender.js.map