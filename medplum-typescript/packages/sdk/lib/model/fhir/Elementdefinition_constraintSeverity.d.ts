export declare type Elementdefinition_constraintSeverity = Elementdefinition_constraintSeverity.Error | Elementdefinition_constraintSeverity.Warning;
export declare const Elementdefinition_constraintSeverity: {
    Error: Elementdefinition_constraintSeverity.Error;
    Warning: Elementdefinition_constraintSeverity.Warning;
    _visit: <Result>(value: Elementdefinition_constraintSeverity, visitor: Elementdefinition_constraintSeverity._Visitor<Result>) => Result;
};
export declare namespace Elementdefinition_constraintSeverity {
    type Error = "error" & {
        __Error: void;
    };
    type Warning = "warning" & {
        __Warning: void;
    };
    interface _Visitor<Result> {
        error: () => Result;
        warning: () => Result;
        _unknown: () => Result;
    }
}
