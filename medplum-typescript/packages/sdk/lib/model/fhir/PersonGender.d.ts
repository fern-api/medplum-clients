export declare type PersonGender = PersonGender.Male | PersonGender.Female | PersonGender.Other;
export declare const PersonGender: {
    Male: PersonGender.Male;
    Female: PersonGender.Female;
    Other: PersonGender.Other;
    _visit: <Result>(value: PersonGender, visitor: PersonGender._Visitor<Result>) => Result;
};
export declare namespace PersonGender {
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
