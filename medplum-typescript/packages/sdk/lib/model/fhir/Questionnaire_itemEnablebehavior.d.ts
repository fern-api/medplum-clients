export declare type Questionnaire_itemEnablebehavior = Questionnaire_itemEnablebehavior.All | Questionnaire_itemEnablebehavior.Any;
export declare const Questionnaire_itemEnablebehavior: {
    All: Questionnaire_itemEnablebehavior.All;
    Any: Questionnaire_itemEnablebehavior.Any;
    _visit: <Result>(value: Questionnaire_itemEnablebehavior, visitor: Questionnaire_itemEnablebehavior._Visitor<Result>) => Result;
};
export declare namespace Questionnaire_itemEnablebehavior {
    type All = "all" & {
        __All: void;
    };
    type Any = "any" & {
        __Any: void;
    };
    interface _Visitor<Result> {
        all: () => Result;
        any: () => Result;
        _unknown: () => Result;
    }
}
