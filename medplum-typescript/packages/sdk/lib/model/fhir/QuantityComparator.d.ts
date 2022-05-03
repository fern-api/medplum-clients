export declare type QuantityComparator = never;
export declare const QuantityComparator: {
    _visit: <Result>(_value: QuantityComparator, visitor: QuantityComparator._Visitor<Result>) => Result;
};
export declare namespace QuantityComparator {
    interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
