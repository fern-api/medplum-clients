export declare type GroupType = GroupType.Person | GroupType.Animal | GroupType.Practitioner | GroupType.Device | GroupType.Medication | GroupType.Substance;
export declare const GroupType: {
    Person: GroupType.Person;
    Animal: GroupType.Animal;
    Practitioner: GroupType.Practitioner;
    Device: GroupType.Device;
    Medication: GroupType.Medication;
    Substance: GroupType.Substance;
    _visit: <Result>(value: GroupType, visitor: GroupType._Visitor<Result>) => Result;
};
export declare namespace GroupType {
    type Person = "person" & {
        __Person: void;
    };
    type Animal = "animal" & {
        __Animal: void;
    };
    type Practitioner = "practitioner" & {
        __Practitioner: void;
    };
    type Device = "device" & {
        __Device: void;
    };
    type Medication = "medication" & {
        __Medication: void;
    };
    type Substance = "substance" & {
        __Substance: void;
    };
    interface _Visitor<Result> {
        person: () => Result;
        animal: () => Result;
        practitioner: () => Result;
        device: () => Result;
        medication: () => Result;
        substance: () => Result;
        _unknown: () => Result;
    }
}
