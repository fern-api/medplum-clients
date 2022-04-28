export type Testreport_operationResult =
    | Testreport_operationResult.Pass
    | Testreport_operationResult.Skip
    | Testreport_operationResult.Fail
    | Testreport_operationResult.Warning
    | Testreport_operationResult.Error;

export const Testreport_operationResult = {
    Pass: "pass" as Testreport_operationResult.Pass,
    Skip: "skip" as Testreport_operationResult.Skip,
    Fail: "fail" as Testreport_operationResult.Fail,
    Warning: "warning" as Testreport_operationResult.Warning,
    Error: "error" as Testreport_operationResult.Error,

    _visit: <Result>(value: Testreport_operationResult, visitor: Testreport_operationResult._Visitor<Result>): Result => {
        switch (value) {
            case Testreport_operationResult.Pass: return visitor.pass();
            case Testreport_operationResult.Skip: return visitor.skip();
            case Testreport_operationResult.Fail: return visitor.fail();
            case Testreport_operationResult.Warning: return visitor.warning();
            case Testreport_operationResult.Error: return visitor.error();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Testreport_operationResult {
    export type Pass = "pass" & {
        __Pass: void,
    };
    export type Skip = "skip" & {
        __Skip: void,
    };
    export type Fail = "fail" & {
        __Fail: void,
    };
    export type Warning = "warning" & {
        __Warning: void,
    };
    export type Error = "error" & {
        __Error: void,
    };

    export interface _Visitor<Result> {
        pass: () => Result;
        skip: () => Result;
        fail: () => Result;
        warning: () => Result;
        error: () => Result;
        _unknown: () => Result;
    }
}
