export declare type PatientGender = PatientGender.Male | PatientGender.Female | PatientGender.Other;
export declare const PatientGender: {
    Male: PatientGender.Male;
    Female: PatientGender.Female;
    Other: PatientGender.Other;
    _visit: <Result>(value: PatientGender, visitor: PatientGender._Visitor<Result>) => Result;
};
export declare namespace PatientGender {
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
