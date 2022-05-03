export type Patient_contactGender =
    | Patient_contactGender.Male
    | Patient_contactGender.Female
    | Patient_contactGender.Other;

export const Patient_contactGender = {
    Male: "male" as Patient_contactGender.Male,
    Female: "female" as Patient_contactGender.Female,
    Other: "other" as Patient_contactGender.Other,

    _visit: <Result>(
        value: Patient_contactGender,
        visitor: Patient_contactGender._Visitor<Result>
    ): Result => {
        switch (value) {
            case Patient_contactGender.Male:
                return visitor.male();
            case Patient_contactGender.Female:
                return visitor.female();
            case Patient_contactGender.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Patient_contactGender {
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
