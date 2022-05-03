export declare type ExpressionLanguage = never;
export declare const ExpressionLanguage: {
    _visit: <Result>(_value: ExpressionLanguage, visitor: ExpressionLanguage._Visitor<Result>) => Result;
};
export declare namespace ExpressionLanguage {
    interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
