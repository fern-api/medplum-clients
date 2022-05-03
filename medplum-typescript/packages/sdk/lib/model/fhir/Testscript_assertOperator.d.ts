export declare type Testscript_assertOperator = Testscript_assertOperator.Equals | Testscript_assertOperator.NotEquals | Testscript_assertOperator.In | Testscript_assertOperator.NotIn | Testscript_assertOperator.GreaterThan | Testscript_assertOperator.LessThan | Testscript_assertOperator.Empty | Testscript_assertOperator.NotEmpty | Testscript_assertOperator.Contains | Testscript_assertOperator.NotContains | Testscript_assertOperator.Eval;
export declare const Testscript_assertOperator: {
    Equals: Testscript_assertOperator.Equals;
    NotEquals: Testscript_assertOperator.NotEquals;
    In: Testscript_assertOperator.In;
    NotIn: Testscript_assertOperator.NotIn;
    GreaterThan: Testscript_assertOperator.GreaterThan;
    LessThan: Testscript_assertOperator.LessThan;
    Empty: Testscript_assertOperator.Empty;
    NotEmpty: Testscript_assertOperator.NotEmpty;
    Contains: Testscript_assertOperator.Contains;
    NotContains: Testscript_assertOperator.NotContains;
    Eval: Testscript_assertOperator.Eval;
    _visit: <Result>(value: Testscript_assertOperator, visitor: Testscript_assertOperator._Visitor<Result>) => Result;
};
export declare namespace Testscript_assertOperator {
    type Equals = "equals" & {
        __Equals: void;
    };
    type NotEquals = "notEquals" & {
        __NotEquals: void;
    };
    type In = "in" & {
        __In: void;
    };
    type NotIn = "notIn" & {
        __NotIn: void;
    };
    type GreaterThan = "greaterThan" & {
        __GreaterThan: void;
    };
    type LessThan = "lessThan" & {
        __LessThan: void;
    };
    type Empty = "empty" & {
        __Empty: void;
    };
    type NotEmpty = "notEmpty" & {
        __NotEmpty: void;
    };
    type Contains = "contains" & {
        __Contains: void;
    };
    type NotContains = "notContains" & {
        __NotContains: void;
    };
    type Eval = "eval" & {
        __Eval: void;
    };
    interface _Visitor<Result> {
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
