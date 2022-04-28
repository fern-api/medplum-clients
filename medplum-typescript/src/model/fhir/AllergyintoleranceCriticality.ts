export type AllergyintoleranceCriticality =
    | AllergyintoleranceCriticality.Low
    | AllergyintoleranceCriticality.High;

export const AllergyintoleranceCriticality = {
    Low: "low" as AllergyintoleranceCriticality.Low,
    High: "high" as AllergyintoleranceCriticality.High,

    _visit: <Result>(value: AllergyintoleranceCriticality, visitor: AllergyintoleranceCriticality._Visitor<Result>): Result => {
        switch (value) {
            case AllergyintoleranceCriticality.Low: return visitor.low();
            case AllergyintoleranceCriticality.High: return visitor.high();
            default: return visitor._unknown();
        }
    },
};

export declare namespace AllergyintoleranceCriticality {
    export type Low = "low" & {
        __Low: void,
    };
    export type High = "high" & {
        __High: void,
    };

    export interface _Visitor<Result> {
        low: () => Result;
        high: () => Result;
        _unknown: () => Result;
    }
}
