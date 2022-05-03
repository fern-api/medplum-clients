export declare type AdverseeventActuality = AdverseeventActuality.Actual | AdverseeventActuality.Potential;
export declare const AdverseeventActuality: {
    Actual: AdverseeventActuality.Actual;
    Potential: AdverseeventActuality.Potential;
    _visit: <Result>(value: AdverseeventActuality, visitor: AdverseeventActuality._Visitor<Result>) => Result;
};
export declare namespace AdverseeventActuality {
    type Actual = "actual" & {
        __Actual: void;
    };
    type Potential = "potential" & {
        __Potential: void;
    };
    interface _Visitor<Result> {
        actual: () => Result;
        potential: () => Result;
        _unknown: () => Result;
    }
}
