export declare type CountComparator = never;
export declare const CountComparator: {
    _visit: <Result>(_value: CountComparator, visitor: CountComparator._Visitor<Result>) => Result;
};
export declare namespace CountComparator {
    interface _Visitor<Result> {
        _unknown: () => Result;
    }
}
