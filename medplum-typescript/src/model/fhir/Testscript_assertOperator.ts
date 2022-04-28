export type Testscript_assertOperator =
    | Testscript_assertOperator.Equals
    | Testscript_assertOperator.NotEquals
    | Testscript_assertOperator.In
    | Testscript_assertOperator.NotIn
    | Testscript_assertOperator.GreaterThan
    | Testscript_assertOperator.LessThan
    | Testscript_assertOperator.Empty
    | Testscript_assertOperator.NotEmpty
    | Testscript_assertOperator.Contains
    | Testscript_assertOperator.NotContains
    | Testscript_assertOperator.Eval;

export const Testscript_assertOperator = {
    Equals: "equals" as Testscript_assertOperator.Equals,
    NotEquals: "notEquals" as Testscript_assertOperator.NotEquals,
    In: "in" as Testscript_assertOperator.In,
    NotIn: "notIn" as Testscript_assertOperator.NotIn,
    GreaterThan: "greaterThan" as Testscript_assertOperator.GreaterThan,
    LessThan: "lessThan" as Testscript_assertOperator.LessThan,
    Empty: "empty" as Testscript_assertOperator.Empty,
    NotEmpty: "notEmpty" as Testscript_assertOperator.NotEmpty,
    Contains: "contains" as Testscript_assertOperator.Contains,
    NotContains: "notContains" as Testscript_assertOperator.NotContains,
    Eval: "eval" as Testscript_assertOperator.Eval,

    _visit: <Result>(value: Testscript_assertOperator, visitor: Testscript_assertOperator._Visitor<Result>): Result => {
        switch (value) {
            case Testscript_assertOperator.Equals: return visitor.equals();
            case Testscript_assertOperator.NotEquals: return visitor.notEquals();
            case Testscript_assertOperator.In: return visitor.in();
            case Testscript_assertOperator.NotIn: return visitor.notIn();
            case Testscript_assertOperator.GreaterThan: return visitor.greaterThan();
            case Testscript_assertOperator.LessThan: return visitor.lessThan();
            case Testscript_assertOperator.Empty: return visitor.empty();
            case Testscript_assertOperator.NotEmpty: return visitor.notEmpty();
            case Testscript_assertOperator.Contains: return visitor.contains();
            case Testscript_assertOperator.NotContains: return visitor.notContains();
            case Testscript_assertOperator.Eval: return visitor.eval();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Testscript_assertOperator {
    export type Equals = "equals" & {
        __Equals: void,
    };
    export type NotEquals = "notEquals" & {
        __NotEquals: void,
    };
    export type In = "in" & {
        __In: void,
    };
    export type NotIn = "notIn" & {
        __NotIn: void,
    };
    export type GreaterThan = "greaterThan" & {
        __GreaterThan: void,
    };
    export type LessThan = "lessThan" & {
        __LessThan: void,
    };
    export type Empty = "empty" & {
        __Empty: void,
    };
    export type NotEmpty = "notEmpty" & {
        __NotEmpty: void,
    };
    export type Contains = "contains" & {
        __Contains: void,
    };
    export type NotContains = "notContains" & {
        __NotContains: void,
    };
    export type Eval = "eval" & {
        __Eval: void,
    };

    export interface _Visitor<Result> {
        equals: () => Result;
        notEquals: () => Result;
        in: () => Result;
        notIn: () => Result;
        greaterThan: () => Result;
        lessThan: () => Result;
        empty: () => Result;
        notEmpty: () => Result;
        contains: () => Result;
        notContains: () => Result;
        eval: () => Result;
        _unknown: () => Result;
    }
}
