export type Questionnaire_enablewhenOperator =
    | Questionnaire_enablewhenOperator.Exists;

export const Questionnaire_enablewhenOperator = {
    Exists: "exists" as Questionnaire_enablewhenOperator.Exists,

    _visit: <Result>(value: Questionnaire_enablewhenOperator, visitor: Questionnaire_enablewhenOperator._Visitor<Result>): Result => {
        switch (value) {
            case Questionnaire_enablewhenOperator.Exists: return visitor.exists();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Questionnaire_enablewhenOperator {
    export type Exists = "exists" & {
        __Exists: void,
    };

    export interface _Visitor<Result> {
        exists: () => Result;
        _unknown: () => Result;
    }
}
