export declare type Testreport_operationResult = Testreport_operationResult.Pass | Testreport_operationResult.Skip | Testreport_operationResult.Fail | Testreport_operationResult.Warning | Testreport_operationResult.Error;
export declare const Testreport_operationResult: {
    Pass: Testreport_operationResult.Pass;
    Skip: Testreport_operationResult.Skip;
    Fail: Testreport_operationResult.Fail;
    Warning: Testreport_operationResult.Warning;
    Error: Testreport_operationResult.Error;
    _visit: <Result>(value: Testreport_operationResult, visitor: Testreport_operationResult._Visitor<Result>) => Result;
};
export declare namespace Testreport_operationResult {
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
