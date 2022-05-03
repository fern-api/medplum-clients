export type Elementdefinition_constraintSeverity =
    | Elementdefinition_constraintSeverity.Error
    | Elementdefinition_constraintSeverity.Warning;

export const Elementdefinition_constraintSeverity = {
    Error: "error" as Elementdefinition_constraintSeverity.Error,
    Warning: "warning" as Elementdefinition_constraintSeverity.Warning,

    _visit: <Result>(
        value: Elementdefinition_constraintSeverity,
        visitor: Elementdefinition_constraintSeverity._Visitor<Result>
    ): Result => {
        switch (value) {
            case Elementdefinition_constraintSeverity.Error:
                return visitor.error();
            case Elementdefinition_constraintSeverity.Warning:
                return visitor.warning();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Elementdefinition_constraintSeverity {
    export type Error = "error" & {
        __Error: void;
    };
    export type Warning = "warning" & {
        __Warning: void;
    };

    export interface _Visitor<Result> {
        error: () => Result;
        warning: () => Result;
        _unknown: () => Result;
    }
}
