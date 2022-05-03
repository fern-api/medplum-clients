export declare type PractitionerGender = PractitionerGender.Male | PractitionerGender.Female | PractitionerGender.Other;
export declare const PractitionerGender: {
    Male: PractitionerGender.Male;
    Female: PractitionerGender.Female;
    Other: PractitionerGender.Other;
    _visit: <Result>(value: PractitionerGender, visitor: PractitionerGender._Visitor<Result>) => Result;
};
export declare namespace PractitionerGender {
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
