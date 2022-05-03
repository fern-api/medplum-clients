"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AppointmentStatus = void 0;
exports.AppointmentStatus = {
    Proposed: "proposed",
    Pending: "pending",
    Booked: "booked",
    Arrived: "arrived",
    Fulfilled: "fulfilled",
    Cancelled: "cancelled",
    Noshow: "noshow",
    Waitlist: "waitlist",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.AppointmentStatus.Proposed:
                return visitor.proposed();
            case exports.AppointmentStatus.Pending:
                return visitor.pending();
            case exports.AppointmentStatus.Booked:
                return visitor.booked();
            case exports.AppointmentStatus.Arrived:
                return visitor.arrived();
            case exports.AppointmentStatus.Fulfilled:
                return visitor.fulfilled();
            case exports.AppointmentStatus.Cancelled:
                return visitor.cancelled();
            case exports.AppointmentStatus.Noshow:
                return visitor.noshow();
            case exports.AppointmentStatus.Waitlist:
                return visitor.waitlist();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=AppointmentStatus.js.map