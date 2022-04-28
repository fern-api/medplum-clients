export type CompartmentdefinitionCode =
    | CompartmentdefinitionCode.Patient
    | CompartmentdefinitionCode.Encounter
    | CompartmentdefinitionCode.RelatedPerson
    | CompartmentdefinitionCode.Practitioner
    | CompartmentdefinitionCode.Device;

export const CompartmentdefinitionCode = {
    Patient: "Patient" as CompartmentdefinitionCode.Patient,
    Encounter: "Encounter" as CompartmentdefinitionCode.Encounter,
    RelatedPerson: "RelatedPerson" as CompartmentdefinitionCode.RelatedPerson,
    Practitioner: "Practitioner" as CompartmentdefinitionCode.Practitioner,
    Device: "Device" as CompartmentdefinitionCode.Device,

    _visit: <Result>(value: CompartmentdefinitionCode, visitor: CompartmentdefinitionCode._Visitor<Result>): Result => {
        switch (value) {
            case CompartmentdefinitionCode.Patient: return visitor.patient();
            case CompartmentdefinitionCode.Encounter: return visitor.encounter();
            case CompartmentdefinitionCode.RelatedPerson: return visitor.relatedPerson();
            case CompartmentdefinitionCode.Practitioner: return visitor.practitioner();
            case CompartmentdefinitionCode.Device: return visitor.device();
            default: return visitor._unknown();
        }
    },
};

export declare namespace CompartmentdefinitionCode {
    export type Patient = "Patient" & {
        __Patient: void,
    };
    export type Encounter = "Encounter" & {
        __Encounter: void,
    };
    export type RelatedPerson = "RelatedPerson" & {
        __RelatedPerson: void,
    };
    export type Practitioner = "Practitioner" & {
        __Practitioner: void,
    };
    export type Device = "Device" & {
        __Device: void,
    };

    export interface _Visitor<Result> {
        patient: () => Result;
        encounter: () => Result;
        relatedPerson: () => Result;
        practitioner: () => Result;
        device: () => Result;
        _unknown: () => Result;
    }
}
