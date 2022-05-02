export type Observationdefinition_qualifiedintervalGender =
    | Observationdefinition_qualifiedintervalGender.Male
    | Observationdefinition_qualifiedintervalGender.Female
    | Observationdefinition_qualifiedintervalGender.Other;

export const Observationdefinition_qualifiedintervalGender = {
    Male: "male" as Observationdefinition_qualifiedintervalGender.Male,
    Female: "female" as Observationdefinition_qualifiedintervalGender.Female,
    Other: "other" as Observationdefinition_qualifiedintervalGender.Other,

    _visit: <Result>(
        value: Observationdefinition_qualifiedintervalGender,
        visitor: Observationdefinition_qualifiedintervalGender._Visitor<Result>
    ): Result => {
        switch (value) {
            case Observationdefinition_qualifiedintervalGender.Male:
                return visitor.male();
            case Observationdefinition_qualifiedintervalGender.Female:
                return visitor.female();
            case Observationdefinition_qualifiedintervalGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Observationdefinition_qualifiedintervalGender {
    export type Male = "male" & {
        __Male: void;
    };
    export type Female = "female" & {
        __Female: void;
    };
    export type Other = "other" & {
        __Other: void;
    };

    export interface _Visitor<Result> {
        male: () => Result;
        female: () => Result;
        other: () => Result;
        _unknown: () => Result;
    }
}
