export declare type Operationoutcome_issueSeverity = Operationoutcome_issueSeverity.Fatal | Operationoutcome_issueSeverity.Error | Operationoutcome_issueSeverity.Warning | Operationoutcome_issueSeverity.Information;
export declare const Operationoutcome_issueSeverity: {
    Fatal: Operationoutcome_issueSeverity.Fatal;
    Error: Operationoutcome_issueSeverity.Error;
    Warning: Operationoutcome_issueSeverity.Warning;
    Information: Operationoutcome_issueSeverity.Information;
    _visit: <Result>(value: Operationoutcome_issueSeverity, visitor: Operationoutcome_issueSeverity._Visitor<Result>) => Result;
};
export declare namespace Operationoutcome_issueSeverity {
    type Fatal = "fatal" & {
        __Fatal: void;
    };
    type Error = "error" & {
        __Error: void;
    };
    type Warning = "warning" & {
        __Warning: void;
    };
    type Information = "information" & {
        __Information: void;
    };
    interface _Visitor<Result> {
        fatal: () => Result;
        error: () => Result;
        warning: () => Result;
        information: () => Result;
        _unknown: () => Result;
    }
}
