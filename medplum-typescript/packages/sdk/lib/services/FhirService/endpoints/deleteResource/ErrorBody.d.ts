export declare type ErrorBody = never;
export declare namespace ErrorBody {
    interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
export declare const ErrorBody: {
    _visit: <Result>(_value: ErrorBody, visitor: ErrorBody._Visitor<Result>) => Result;
};
