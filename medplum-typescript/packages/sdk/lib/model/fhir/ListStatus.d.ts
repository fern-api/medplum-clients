export declare type ListStatus = ListStatus.Current | ListStatus.Retired;
export declare const ListStatus: {
    Current: ListStatus.Current;
    Retired: ListStatus.Retired;
    _visit: <Result>(value: ListStatus, visitor: ListStatus._Visitor<Result>) => Result;
};
export declare namespace ListStatus {
    type Current = "current" & {
        __Current: void;
    };
    type Retired = "retired" & {
        __Retired: void;
    };
    interface _Visitor<Result> {
        current: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
