export declare type AllergyintoleranceCriticality = AllergyintoleranceCriticality.Low | AllergyintoleranceCriticality.High;
export declare const AllergyintoleranceCriticality: {
    Low: AllergyintoleranceCriticality.Low;
    High: AllergyintoleranceCriticality.High;
    _visit: <Result>(value: AllergyintoleranceCriticality, visitor: AllergyintoleranceCriticality._Visitor<Result>) => Result;
};
export declare namespace AllergyintoleranceCriticality {
    type Low = "low" & {
        __Low: void;
    };
    type High = "high" & {
        __High: void;
    };
    interface _Visitor<Result> {
        low: () => Result;
        high: () => Result;
        _unknown: () => Result;
    }
}
