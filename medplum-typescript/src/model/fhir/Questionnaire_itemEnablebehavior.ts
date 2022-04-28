export type Questionnaire_itemEnablebehavior =
    | Questionnaire_itemEnablebehavior.All
    | Questionnaire_itemEnablebehavior.Any;

export const Questionnaire_itemEnablebehavior = {
    All: "all" as Questionnaire_itemEnablebehavior.All,
    Any: "any" as Questionnaire_itemEnablebehavior.Any,

    _visit: <Result>(value: Questionnaire_itemEnablebehavior, visitor: Questionnaire_itemEnablebehavior._Visitor<Result>): Result => {
        switch (value) {
            case Questionnaire_itemEnablebehavior.All: return visitor.all();
            case Questionnaire_itemEnablebehavior.Any: return visitor.any();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Questionnaire_itemEnablebehavior {
    export type All = "all" & {
        __All: void,
    };
    export type Any = "any" & {
        __Any: void,
    };

    export interface _Visitor<Result> {
        all: () => Result;
        any: () => Result;
        _unknown: () => Result;
    }
}
