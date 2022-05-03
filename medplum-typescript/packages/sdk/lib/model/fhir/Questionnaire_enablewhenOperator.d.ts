export declare type Questionnaire_enablewhenOperator = Questionnaire_enablewhenOperator.Exists;
export declare const Questionnaire_enablewhenOperator: {
    Exists: Questionnaire_enablewhenOperator.Exists;
    _visit: <Result>(value: Questionnaire_enablewhenOperator, visitor: Questionnaire_enablewhenOperator._Visitor<Result>) => Result;
};
export declare namespace Questionnaire_enablewhenOperator {
    type Exists = "exists" & {
        __Exists: void;
    };
    interface _Visitor<Result> {
        exists: () => Result;
        _unknown: () => Result;
    }
}
