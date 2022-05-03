export declare type Plandefinition_participantType = Plandefinition_participantType.Patient | Plandefinition_participantType.Practitioner | Plandefinition_participantType.Device;
export declare const Plandefinition_participantType: {
    Patient: Plandefinition_participantType.Patient;
    Practitioner: Plandefinition_participantType.Practitioner;
    Device: Plandefinition_participantType.Device;
    _visit: <Result>(value: Plandefinition_participantType, visitor: Plandefinition_participantType._Visitor<Result>) => Result;
};
export declare namespace Plandefinition_participantType {
    type Patient = "patient" & {
        __Patient: void;
    };
    type Practitioner = "practitioner" & {
        __Practitioner: void;
    };
    type Device = "device" & {
        __Device: void;
    };
    interface _Visitor<Result> {
        patient: () => Result;
        practitioner: () => Result;
        device: () => Result;
        _unknown: () => Result;
    }
}
