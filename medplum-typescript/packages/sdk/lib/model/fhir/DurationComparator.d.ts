export declare type DurationComparator = never;
export declare const DurationComparator: {
    _visit: <Result>(_value: DurationComparator, visitor: DurationComparator._Visitor<Result>) => Result;
};
export declare namespace DurationComparator {
    interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
