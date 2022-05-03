"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Testscript_assertOperator = void 0;
exports.Testscript_assertOperator = {
    Equals: "equals",
    NotEquals: "notEquals",
    In: "in",
    NotIn: "notIn",
    GreaterThan: "greaterThan",
    LessThan: "lessThan",
    Empty: "empty",
    NotEmpty: "notEmpty",
    Contains: "contains",
    NotContains: "notContains",
    Eval: "eval",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Testscript_assertOperator.Equals:
                return visitor.equals();
            case exports.Testscript_assertOperator.NotEquals:
                return visitor.notEquals();
            case exports.Testscript_assertOperator.In:
                return visitor.in();
            case exports.Testscript_assertOperator.NotIn:
                return visitor.notIn();
            case exports.Testscript_assertOperator.GreaterThan:
                return visitor.greaterThan();
            case exports.Testscript_assertOperator.LessThan:
                return visitor.lessThan();
            case exports.Testscript_assertOperator.Empty:
                return visitor.empty();
            case exports.Testscript_assertOperator.NotEmpty:
                return visitor.notEmpty();
            case exports.Testscript_assertOperator.Contains:
                return visitor.contains();
            case exports.Testscript_assertOperator.NotContains:
                return visitor.notContains();
            case exports.Testscript_assertOperator.Eval:
                return visitor.eval();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Testscript_assertOperator.js.map