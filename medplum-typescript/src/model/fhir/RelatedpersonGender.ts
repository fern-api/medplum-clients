export type RelatedpersonGender =
    | RelatedpersonGender.Male
    | RelatedpersonGender.Female
    | RelatedpersonGender.Other;

export const RelatedpersonGender = {
    Male: "male" as RelatedpersonGender.Male,
    Female: "female" as RelatedpersonGender.Female,
    Other: "other" as RelatedpersonGender.Other,

    _visit: <Result>(
        value: RelatedpersonGender,
        visitor: RelatedpersonGender._Visitor<Result>
    ): Result => {
        switch (value) {
            case RelatedpersonGender.Male:
                return visitor.male();
            case RelatedpersonGender.Female:
                return visitor.female();
            case RelatedpersonGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace RelatedpersonGender {
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
