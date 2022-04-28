export type ExpressionLanguage = never;

export const ExpressionLanguage = {

    _visit: <Result>(_value: ExpressionLanguage, visitor: ExpressionLanguage._Visitor<Result>): Result => {
        return visitor._unknown();
    },
};

export declare namespace ExpressionLanguage {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
