"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CompartmentdefinitionCode = void 0;
exports.CompartmentdefinitionCode = {
    Patient: "Patient",
    Encounter: "Encounter",
    RelatedPerson: "RelatedPerson",
    Practitioner: "Practitioner",
    Device: "Device",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.CompartmentdefinitionCode.Patient:
                return visitor.patient();
            case exports.CompartmentdefinitionCode.Encounter:
                return visitor.encounter();
            case exports.CompartmentdefinitionCode.RelatedPerson:
                return visitor.relatedPerson();
            case exports.CompartmentdefinitionCode.Practitioner:
                return visitor.practitioner();
            case exports.CompartmentdefinitionCode.Device:
                return visitor.device();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=CompartmentdefinitionCode.js.map