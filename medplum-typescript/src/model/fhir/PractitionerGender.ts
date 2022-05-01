export type PractitionerGender =
    | PractitionerGender.Male
    | PractitionerGender.Female
    | PractitionerGender.Other;

export const PractitionerGender = {
    Male: "male" as PractitionerGender.Male,
    Female: "female" as PractitionerGender.Female,
    Other: "other" as PractitionerGender.Other,

    _visit: <Result>(
        value: PractitionerGender,
        visitor: PractitionerGender._Visitor<Result>
    ): Result => {
        switch (value) {
            case PractitionerGender.Male:
                return visitor.male();
            case PractitionerGender.Female:
                return visitor.female();
            case PractitionerGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace PractitionerGender {
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
