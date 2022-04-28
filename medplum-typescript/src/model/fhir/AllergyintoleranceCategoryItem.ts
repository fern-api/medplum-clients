export type AllergyintoleranceCategoryItem =
    | AllergyintoleranceCategoryItem.Food
    | AllergyintoleranceCategoryItem.Medication
    | AllergyintoleranceCategoryItem.Environment
    | AllergyintoleranceCategoryItem.Biologic;

export const AllergyintoleranceCategoryItem = {
    Food: "food" as AllergyintoleranceCategoryItem.Food,
    Medication: "medication" as AllergyintoleranceCategoryItem.Medication,
    Environment: "environment" as AllergyintoleranceCategoryItem.Environment,
    Biologic: "biologic" as AllergyintoleranceCategoryItem.Biologic,

    _visit: <Result>(value: AllergyintoleranceCategoryItem, visitor: AllergyintoleranceCategoryItem._Visitor<Result>): Result => {
        switch (value) {
            case AllergyintoleranceCategoryItem.Food: return visitor.food();
            case AllergyintoleranceCategoryItem.Medication: return visitor.medication();
            case AllergyintoleranceCategoryItem.Environment: return visitor.environment();
            case AllergyintoleranceCategoryItem.Biologic: return visitor.biologic();
            default: return visitor._unknown();
        }
    },
};

export declare namespace AllergyintoleranceCategoryItem {
    export type Food = "food" & {
        __Food: void,
    };
    export type Medication = "medication" & {
        __Medication: void,
    };
    export type Environment = "environment" & {
        __Environment: void,
    };
    export type Biologic = "biologic" & {
        __Biologic: void,
    };

    export interface _Visitor<Result> {
        food: () => Result;
        medication: () => Result;
        environment: () => Result;
        biologic: () => Result;
        _unknown: () => Result;
    }
}
