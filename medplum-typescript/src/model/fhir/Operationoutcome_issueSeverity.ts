export type Operationoutcome_issueSeverity =
    | Operationoutcome_issueSeverity.Fatal
    | Operationoutcome_issueSeverity.Error
    | Operationoutcome_issueSeverity.Warning
    | Operationoutcome_issueSeverity.Information;

export const Operationoutcome_issueSeverity = {
    Fatal: "fatal" as Operationoutcome_issueSeverity.Fatal,
    Error: "error" as Operationoutcome_issueSeverity.Error,
    Warning: "warning" as Operationoutcome_issueSeverity.Warning,
    Information: "information" as Operationoutcome_issueSeverity.Information,

    _visit: <Result>(value: Operationoutcome_issueSeverity, visitor: Operationoutcome_issueSeverity._Visitor<Result>): Result => {
        switch (value) {
            case Operationoutcome_issueSeverity.Fatal: return visitor.fatal();
            case Operationoutcome_issueSeverity.Error: return visitor.error();
            case Operationoutcome_issueSeverity.Warning: return visitor.warning();
            case Operationoutcome_issueSeverity.Information: return visitor.information();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Operationoutcome_issueSeverity {
    export type Fatal = "fatal" & {
        __Fatal: void,
    };
    export type Error = "error" & {
        __Error: void,
    };
    export type Warning = "warning" & {
        __Warning: void,
    };
    export type Information = "information" & {
        __Information: void,
    };

    export interface _Visitor<Result> {
        fatal: () => Result;
        error: () => Result;
        warning: () => Result;
        information: () => Result;
        _unknown: () => Result;
    }
}
