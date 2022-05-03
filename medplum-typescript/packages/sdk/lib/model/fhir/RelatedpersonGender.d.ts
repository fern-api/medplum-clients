export declare type RelatedpersonGender = RelatedpersonGender.Male | RelatedpersonGender.Female | RelatedpersonGender.Other;
export declare const RelatedpersonGender: {
    Male: RelatedpersonGender.Male;
    Female: RelatedpersonGender.Female;
    Other: RelatedpersonGender.Other;
    _visit: <Result>(value: RelatedpersonGender, visitor: RelatedpersonGender._Visitor<Result>) => Result;
};
export declare namespace RelatedpersonGender {
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
