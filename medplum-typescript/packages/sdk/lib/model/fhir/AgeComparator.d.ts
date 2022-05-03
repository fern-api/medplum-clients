export declare type AgeComparator = never;
export declare const AgeComparator: {
    _visit: <Result>(_value: AgeComparator, visitor: AgeComparator._Visitor<Result>) => Result;
};
export declare namespace AgeComparator {
    interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
