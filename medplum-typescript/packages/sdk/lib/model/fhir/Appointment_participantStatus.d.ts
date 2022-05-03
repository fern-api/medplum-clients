export declare type Appointment_participantStatus = Appointment_participantStatus.Accepted | Appointment_participantStatus.Declined | Appointment_participantStatus.Tentative;
export declare const Appointment_participantStatus: {
    Accepted: Appointment_participantStatus.Accepted;
    Declined: Appointment_participantStatus.Declined;
    Tentative: Appointment_participantStatus.Tentative;
    _visit: <Result>(value: Appointment_participantStatus, visitor: Appointment_participantStatus._Visitor<Result>) => Result;
};
export declare namespace Appointment_participantStatus {
    type Accepted = "accepted" & {
        __Accepted: void;
    };
    type Declined = "declined" & {
        __Declined: void;
    };
    type Tentative = "tentative" & {
        __Tentative: void;
    };
    interface _Visitor<Result> {
        accepted: () => Result;
        declined: () => Result;
        tentative: () => Result;
        _unknown: () => Result;
    }
}
