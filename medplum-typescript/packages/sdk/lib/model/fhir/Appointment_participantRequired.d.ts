export declare type Appointment_participantRequired = Appointment_participantRequired.Required | Appointment_participantRequired.Optional;
export declare const Appointment_participantRequired: {
    Required: Appointment_participantRequired.Required;
    Optional: Appointment_participantRequired.Optional;
    _visit: <Result>(value: Appointment_participantRequired, visitor: Appointment_participantRequired._Visitor<Result>) => Result;
};
export declare namespace Appointment_participantRequired {
    type Required = "required" & {
        __Required: void;
    };
    type Optional = "optional" & {
        __Optional: void;
    };
    interface _Visitor<Result> {
        required: () => Result;
        optional: () => Result;
        _unknown: () => Result;
    }
}
