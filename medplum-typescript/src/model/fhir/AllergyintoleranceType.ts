export type AllergyintoleranceType =
    | AllergyintoleranceType.Allergy
    | AllergyintoleranceType.Intolerance;

export const AllergyintoleranceType = {
    Allergy: "allergy" as AllergyintoleranceType.Allergy,
    Intolerance: "intolerance" as AllergyintoleranceType.Intolerance,

    _visit: <Result>(
        value: AllergyintoleranceType,
        visitor: AllergyintoleranceType._Visitor<Result>
    ): Result => {
        switch (value) {
            case AllergyintoleranceType.Allergy:
                return visitor.allergy();
            case AllergyintoleranceType.Intolerance:
                return visitor.intolerance();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace AllergyintoleranceType {
    export type Allergy = "allergy" & {
        __Allergy: void;
    };
    export type Intolerance = "intolerance" & {
        __Intolerance: void;
    };

    export interface _Visitor<Result> {
        allergy: () => Result;
        intolerance: () => Result;
        _unknown: () => Result;
    }
}
