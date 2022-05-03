export declare type AllergyintoleranceCategoryItem = AllergyintoleranceCategoryItem.Food | AllergyintoleranceCategoryItem.Medication | AllergyintoleranceCategoryItem.Environment | AllergyintoleranceCategoryItem.Biologic;
export declare const AllergyintoleranceCategoryItem: {
    Food: AllergyintoleranceCategoryItem.Food;
    Medication: AllergyintoleranceCategoryItem.Medication;
    Environment: AllergyintoleranceCategoryItem.Environment;
    Biologic: AllergyintoleranceCategoryItem.Biologic;
    _visit: <Result>(value: AllergyintoleranceCategoryItem, visitor: AllergyintoleranceCategoryItem._Visitor<Result>) => Result;
};
export declare namespace AllergyintoleranceCategoryItem {
    type Food = "food" & {
        __Food: void;
    };
    type Medication = "medication" & {
        __Medication: void;
    };
    type Environment = "environment" & {
        __Environment: void;
    };
    type Biologic = "biologic" & {
        __Biologic: void;
    };
    interface _Visitor<Result> {
        food: () => Result;
        medication: () => Result;
        environment: () => Result;
        biologic: () => Result;
        _unknown: () => Result;
    }
}
