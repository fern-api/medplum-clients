export type Plandefinition_participantType =
    | Plandefinition_participantType.Patient
    | Plandefinition_participantType.Practitioner
    | Plandefinition_participantType.Device;

export const Plandefinition_participantType = {
    Patient: "patient" as Plandefinition_participantType.Patient,
    Practitioner: "practitioner" as Plandefinition_participantType.Practitioner,
    Device: "device" as Plandefinition_participantType.Device,

    _visit: <Result>(
        value: Plandefinition_participantType,
        visitor: Plandefinition_participantType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Plandefinition_participantType.Patient:
                return visitor.patient();
            case Plandefinition_participantType.Practitioner:
                return visitor.practitioner();
            case Plandefinition_participantType.Device:
                return visitor.device();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Plandefinition_participantType {
    export type Patient = "patient" & {
        __Patient: void;
    };
    export type Practitioner = "practitioner" & {
        __Practitioner: void;
    };
    export type Device = "device" & {
        __Device: void;
    };

    export interface _Visitor<Result> {
        patient: () => Result;
        practitioner: () => Result;
        device: () => Result;
        _unknown: () => Result;
    }
}
