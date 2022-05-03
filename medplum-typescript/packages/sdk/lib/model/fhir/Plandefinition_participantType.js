"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Plandefinition_participantType = void 0;
exports.Plandefinition_participantType = {
    Patient: "patient",
    Practitioner: "practitioner",
    Device: "device",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Plandefinition_participantType.Patient:
                return visitor.patient();
            case exports.Plandefinition_participantType.Practitioner:
                return visitor.practitioner();
            case exports.Plandefinition_participantType.Device:
                return visitor.device();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Plandefinition_participantType.js.map