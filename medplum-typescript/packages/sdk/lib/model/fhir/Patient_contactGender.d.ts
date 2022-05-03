export declare type Patient_contactGender = Patient_contactGender.Male | Patient_contactGender.Female | Patient_contactGender.Other;
export declare const Patient_contactGender: {
    Male: Patient_contactGender.Male;
    Female: Patient_contactGender.Female;
    Other: Patient_contactGender.Other;
    _visit: <Result>(value: Patient_contactGender, visitor: Patient_contactGender._Visitor<Result>) => Result;
};
export declare namespace Patient_contactGender {
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
