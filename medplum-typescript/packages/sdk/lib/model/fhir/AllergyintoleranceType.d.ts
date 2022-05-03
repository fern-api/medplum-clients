export declare type AllergyintoleranceType = AllergyintoleranceType.Allergy | AllergyintoleranceType.Intolerance;
export declare const AllergyintoleranceType: {
    Allergy: AllergyintoleranceType.Allergy;
    Intolerance: AllergyintoleranceType.Intolerance;
    _visit: <Result>(value: AllergyintoleranceType, visitor: AllergyintoleranceType._Visitor<Result>) => Result;
};
export declare namespace AllergyintoleranceType {
    type Allergy = "allergy" & {
        __Allergy: void;
    };
    type Intolerance = "intolerance" & {
        __Intolerance: void;
    };
    interface _Visitor<Result> {
        allergy: () => Result;
        intolerance: () => Result;
        _unknown: () => Result;
    }
}
