export type PersonGender =
    | PersonGender.Male
    | PersonGender.Female
    | PersonGender.Other;

export const PersonGender = {
    Male: "male" as PersonGender.Male,
    Female: "female" as PersonGender.Female,
    Other: "other" as PersonGender.Other,

    _visit: <Result>(
        value: PersonGender,
        visitor: PersonGender._Visitor<Result>
    ): Result => {
        switch (value) {
            case PersonGender.Male:
                return visitor.male();
            case PersonGender.Female:
                return visitor.female();
            case PersonGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace PersonGender {
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
