export type Appointment_participantStatus =
    | Appointment_participantStatus.Accepted
    | Appointment_participantStatus.Declined
    | Appointment_participantStatus.Tentative;

export const Appointment_participantStatus = {
    Accepted: "accepted" as Appointment_participantStatus.Accepted,
    Declined: "declined" as Appointment_participantStatus.Declined,
    Tentative: "tentative" as Appointment_participantStatus.Tentative,

    _visit: <Result>(value: Appointment_participantStatus, visitor: Appointment_participantStatus._Visitor<Result>): Result => {
        switch (value) {
            case Appointment_participantStatus.Accepted: return visitor.accepted();
            case Appointment_participantStatus.Declined: return visitor.declined();
            case Appointment_participantStatus.Tentative: return visitor.tentative();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Appointment_participantStatus {
    export type Accepted = "accepted" & {
        __Accepted: void,
    };
    export type Declined = "declined" & {
        __Declined: void,
    };
    export type Tentative = "tentative" & {
        __Tentative: void,
    };

    export interface _Visitor<Result> {
        accepted: () => Result;
        declined: () => Result;
        tentative: () => Result;
        _unknown: () => Result;
    }
}
