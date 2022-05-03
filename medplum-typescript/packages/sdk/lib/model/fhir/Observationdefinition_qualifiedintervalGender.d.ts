export declare type Observationdefinition_qualifiedintervalGender = Observationdefinition_qualifiedintervalGender.Male | Observationdefinition_qualifiedintervalGender.Female | Observationdefinition_qualifiedintervalGender.Other;
export declare const Observationdefinition_qualifiedintervalGender: {
    Male: Observationdefinition_qualifiedintervalGender.Male;
    Female: Observationdefinition_qualifiedintervalGender.Female;
    Other: Observationdefinition_qualifiedintervalGender.Other;
    _visit: <Result>(value: Observationdefinition_qualifiedintervalGender, visitor: Observationdefinition_qualifiedintervalGender._Visitor<Result>) => Result;
};
export declare namespace Observationdefinition_qualifiedintervalGender {
    type Male = "male" & {
        __Male: void;
    };
    type Female = "female" & {
        __Female: void;
    };
    type Other = "other" & {
        __Other: void;
    };
    interface _Visitor<Result> {
        male: () => Result;
        female: () => Result;
        other: () => Result;
        _unknown: () => Result;
    }
}
