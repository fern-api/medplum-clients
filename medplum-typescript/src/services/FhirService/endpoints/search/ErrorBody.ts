export type ErrorBody = never;

export declare namespace ErrorBody {
    export interface _Visitor<Result> {
        _unknown: () => Result;
    }
}

export const ErrorBody = {
    _visit: <Result>(
        _value: ErrorBody,
        visitor: ErrorBody._Visitor<Result>
    ): Result => {
        return visitor._unknown();
    },
};
