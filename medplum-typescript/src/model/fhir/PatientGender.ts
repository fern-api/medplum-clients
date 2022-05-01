export type PatientGender =
    | PatientGender.Male
    | PatientGender.Female
    | PatientGender.Other;

export const PatientGender = {
    Male: "male" as PatientGender.Male,
    Female: "female" as PatientGender.Female,
    Other: "other" as PatientGender.Other,

    _visit: <Result>(
        value: PatientGender,
        visitor: PatientGender._Visitor<Result>
    ): Result => {
        switch (value) {
            case PatientGender.Male:
                return visitor.male();
            case PatientGender.Female:
                return visitor.female();
            case PatientGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace PatientGender {
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
