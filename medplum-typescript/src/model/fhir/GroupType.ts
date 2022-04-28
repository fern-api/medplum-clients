export type GroupType =
    | GroupType.Person
    | GroupType.Animal
    | GroupType.Practitioner
    | GroupType.Device
    | GroupType.Medication
    | GroupType.Substance;

export const GroupType = {
    Person: "person" as GroupType.Person,
    Animal: "animal" as GroupType.Animal,
    Practitioner: "practitioner" as GroupType.Practitioner,
    Device: "device" as GroupType.Device,
    Medication: "medication" as GroupType.Medication,
    Substance: "substance" as GroupType.Substance,

    _visit: <Result>(value: GroupType, visitor: GroupType._Visitor<Result>): Result => {
        switch (value) {
            case GroupType.Person: return visitor.person();
            case GroupType.Animal: return visitor.animal();
            case GroupType.Practitioner: return visitor.practitioner();
            case GroupType.Device: return visitor.device();
            case GroupType.Medication: return visitor.medication();
            case GroupType.Substance: return visitor.substance();
            default: return visitor._unknown();
        }
    },
};

export declare namespace GroupType {
    export type Person = "person" & {
        __Person: void,
    };
    export type Animal = "animal" & {
        __Animal: void,
    };
    export type Practitioner = "practitioner" & {
        __Practitioner: void,
    };
    export type Device = "device" & {
        __Device: void,
    };
    export type Medication = "medication" & {
        __Medication: void,
    };
    export type Substance = "substance" & {
        __Substance: void,
    };

    export interface _Visitor<Result> {
        person: () => Result;
        animal: () => Result;
        practitioner: () => Result;
        device: () => Result;
        medication: () => Result;
        substance: () => Result;
        _unknown: () => Result;
    }
}
