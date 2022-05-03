export declare type TestreportResult = TestreportResult.Pass | TestreportResult.Fail | TestreportResult.Pending;
export declare const TestreportResult: {
    Pass: TestreportResult.Pass;
    Fail: TestreportResult.Fail;
    Pending: TestreportResult.Pending;
    _visit: <Result>(value: TestreportResult, visitor: TestreportResult._Visitor<Result>) => Result;
};
export declare namespace TestreportResult {
    type Pass = "pass" & {
        __Pass: void;
    };
    type Fail = "fail" & {
        __Fail: void;
    };
    type Pending = "pending" & {
        __Pending: void;
    };
    interface _Visitor<Result> {
        pass: () => Result;
        fail: () => Result;
        pending: () => Result;
        _unknown: () => Result;
    }
}
