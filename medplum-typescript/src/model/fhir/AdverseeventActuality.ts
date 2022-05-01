export type AdverseeventActuality =
    | AdverseeventActuality.Actual
    | AdverseeventActuality.Potential;

export const AdverseeventActuality = {
    Actual: "actual" as AdverseeventActuality.Actual,
    Potential: "potential" as AdverseeventActuality.Potential,

    _visit: <Result>(
        value: AdverseeventActuality,
        visitor: AdverseeventActuality._Visitor<Result>
    ): Result => {
        switch (value) {
            case AdverseeventActuality.Actual:
                return visitor.actual();
            case AdverseeventActuality.Potential:
                return visitor.potential();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace AdverseeventActuality {
    export type Actual = "actual" & {
        __Actual: void;
    };
    export type Potential = "potential" & {
        __Potential: void;
    };

    export interface _Visitor<Result> {
        actual: () => Result;
        potential: () => Result;
        _unknown: () => Result;
    }
}
