export type Appointment_participantRequired =
    | Appointment_participantRequired.Required
    | Appointment_participantRequired.Optional;

export const Appointment_participantRequired = {
    Required: "required" as Appointment_participantRequired.Required,
    Optional: "optional" as Appointment_participantRequired.Optional,

    _visit: <Result>(value: Appointment_participantRequired, visitor: Appointment_participantRequired._Visitor<Result>): Result => {
        switch (value) {
            case Appointment_participantRequired.Required: return visitor.required();
            case Appointment_participantRequired.Optional: return visitor.optional();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Appointment_participantRequired {
    export type Required = "required" & {
        __Required: void,
    };
    export type Optional = "optional" & {
        __Optional: void,
    };

    export interface _Visitor<Result> {
        required: () => Result;
        optional: () => Result;
        _unknown: () => Result;
    }
}
