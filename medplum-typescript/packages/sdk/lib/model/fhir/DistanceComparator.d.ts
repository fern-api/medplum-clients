export declare type DistanceComparator = never;
export declare const DistanceComparator: {
    _visit: <Result>(_value: DistanceComparator, visitor: DistanceComparator._Visitor<Result>) => Result;
};
export declare namespace DistanceComparator {
    interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
