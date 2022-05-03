"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Appointment_participantStatus = void 0;
exports.Appointment_participantStatus = {
    Accepted: "accepted",
    Declined: "declined",
    Tentative: "tentative",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Appointment_participantStatus.Accepted:
                return visitor.accepted();
            case exports.Appointment_participantStatus.Declined:
                return visitor.declined();
            case exports.Appointment_participantStatus.Tentative:
                return visitor.tentative();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Appointment_participantStatus.js.map