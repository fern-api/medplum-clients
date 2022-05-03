"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GroupType = void 0;
exports.GroupType = {
    Person: "person",
    Animal: "animal",
    Practitioner: "practitioner",
    Device: "device",
    Medication: "medication",
    Substance: "substance",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.GroupType.Person:
                return visitor.person();
            case exports.GroupType.Animal:
                return visitor.animal();
            case exports.GroupType.Practitioner:
                return visitor.practitioner();
            case exports.GroupType.Device:
                return visitor.device();
            case exports.GroupType.Medication:
                return visitor.medication();
            case exports.GroupType.Substance:
                return visitor.substance();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=GroupType.js.map