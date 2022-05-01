export type TestreportResult =
    | TestreportResult.Pass
    | TestreportResult.Fail
    | TestreportResult.Pending;

export const TestreportResult = {
    Pass: "pass" as TestreportResult.Pass,
    Fail: "fail" as TestreportResult.Fail,
    Pending: "pending" as TestreportResult.Pending,

    _visit: <Result>(
        value: TestreportResult,
        visitor: TestreportResult._Visitor<Result>
    ): Result => {
        switch (value) {
            case TestreportResult.Pass:
                return visitor.pass();
            case TestreportResult.Fail:
                return visitor.fail();
            case TestreportResult.Pending:
                return visitor.pending();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace TestreportResult {
    export type Pass = "pass" & {
        __Pass: void;
    };
    export type Fail = "fail" & {
        __Fail: void;
    };
    export type Pending = "pending" & {
        __Pending: void;
    };

    export interface _Visitor<Result> {
        pass: () => Result;
        fail: () => Result;
        pending: () => Result;
        _unknown: () => Result;
    }
}
