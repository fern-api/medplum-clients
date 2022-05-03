export declare type Testreport_assertResult = Testreport_assertResult.Pass | Testreport_assertResult.Skip | Testreport_assertResult.Fail | Testreport_assertResult.Warning | Testreport_assertResult.Error;
export declare const Testreport_assertResult: {
    Pass: Testreport_assertResult.Pass;
    Skip: Testreport_assertResult.Skip;
    Fail: Testreport_assertResult.Fail;
    Warning: Testreport_assertResult.Warning;
    Error: Testreport_assertResult.Error;
    _visit: <Result>(value: Testreport_assertResult, visitor: Testreport_assertResult._Visitor<Result>) => Result;
};
export declare namespace Testreport_assertResult {
    type Pass = "pass" & {
        __Pass: void;
    };
    type Skip = "skip" & {
        __Skip: void;
    };
    type Fail = "fail" & {
        __Fail: void;
    };
    type Warning = "warning" & {
        __Warning: void;
    };
    type Error = "error" & {
        __Error: void;
    };
    interface _Visitor<Result> {
        pass: () => Result;
        skip: () => Result;
        fail: () => Result;
        warning: () => Result;
        error: () => Result;
        _unknown: () => Result;
    }
}
