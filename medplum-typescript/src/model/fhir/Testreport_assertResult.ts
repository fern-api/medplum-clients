export type Testreport_assertResult =
    | Testreport_assertResult.Pass
    | Testreport_assertResult.Skip
    | Testreport_assertResult.Fail
    | Testreport_assertResult.Warning
    | Testreport_assertResult.Error;

export const Testreport_assertResult = {
    Pass: "pass" as Testreport_assertResult.Pass,
    Skip: "skip" as Testreport_assertResult.Skip,
    Fail: "fail" as Testreport_assertResult.Fail,
    Warning: "warning" as Testreport_assertResult.Warning,
    Error: "error" as Testreport_assertResult.Error,

    _visit: <Result>(
        value: Testreport_assertResult,
        visitor: Testreport_assertResult._Visitor<Result>
    ): Result => {
        switch (value) {
            case Testreport_assertResult.Pass:
                return visitor.pass();
            case Testreport_assertResult.Skip:
                return visitor.skip();
            case Testreport_assertResult.Fail:
                return visitor.fail();
            case Testreport_assertResult.Warning:
                return visitor.warning();
            case Testreport_assertResult.Error:
                return visitor.error();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Testreport_assertResult {
    export type Pass = "pass" & {
        __Pass: void;
    };
    export type Skip = "skip" & {
        __Skip: void;
    };
    export type Fail = "fail" & {
        __Fail: void;
    };
    export type Warning = "warning" & {
        __Warning: void;
    };
    export type Error = "error" & {
        __Error: void;
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
