"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Appointment_participantRequired = void 0;
exports.Appointment_participantRequired = {
    Required: "required",
    Optional: "optional",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Appointment_participantRequired.Required:
                return visitor.required();
            case exports.Appointment_participantRequired.Optional:
                return visitor.optional();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Appointment_participantRequired.js.map