export declare type CompartmentdefinitionCode = CompartmentdefinitionCode.Patient | CompartmentdefinitionCode.Encounter | CompartmentdefinitionCode.RelatedPerson | CompartmentdefinitionCode.Practitioner | CompartmentdefinitionCode.Device;
export declare const CompartmentdefinitionCode: {
    Patient: CompartmentdefinitionCode.Patient;
    Encounter: CompartmentdefinitionCode.Encounter;
    RelatedPerson: CompartmentdefinitionCode.RelatedPerson;
    Practitioner: CompartmentdefinitionCode.Practitioner;
    Device: CompartmentdefinitionCode.Device;
    _visit: <Result>(value: CompartmentdefinitionCode, visitor: CompartmentdefinitionCode._Visitor<Result>) => Result;
};
export declare namespace CompartmentdefinitionCode {
    type Patient = "Patient" & {
        __Patient: void;
    };
    type Encounter = "Encounter" & {
        __Encounter: void;
    };
    type RelatedPerson = "RelatedPerson" & {
        __RelatedPerson: void;
    };
    type Practitioner = "Practitioner" & {
        __Practitioner: void;
    };
    type Device = "Device" & {
        __Device: void;
    };
    interface _Visitor<Result> {
        patient: () => Result;
        encounter: () => Result;
        relatedPerson: () => Result;
        practitioner: () => Result;
        device: () => Result;
        _unknown: () => Result;
    }
}
