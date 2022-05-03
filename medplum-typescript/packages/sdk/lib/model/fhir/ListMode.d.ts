export declare type ListMode = ListMode.Working | ListMode.Snapshot | ListMode.Changes;
export declare const ListMode: {
    Working: ListMode.Working;
    Snapshot: ListMode.Snapshot;
    Changes: ListMode.Changes;
    _visit: <Result>(value: ListMode, visitor: ListMode._Visitor<Result>) => Result;
};
export declare namespace ListMode {
    type Working = "working" & {
        __Working: void;
    };
    type Snapshot = "snapshot" & {
        __Snapshot: void;
    };
    type Changes = "changes" & {
        __Changes: void;
    };
    interface _Visitor<Result> {
        working: () => Result;
        snapshot: () => Result;
        changes: () => Result;
        _unknown: () => Result;
    }
}
