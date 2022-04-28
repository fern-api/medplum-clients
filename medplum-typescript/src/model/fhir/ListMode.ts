export type ListMode =
    | ListMode.Working
    | ListMode.Snapshot
    | ListMode.Changes;

export const ListMode = {
    Working: "working" as ListMode.Working,
    Snapshot: "snapshot" as ListMode.Snapshot,
    Changes: "changes" as ListMode.Changes,

    _visit: <Result>(value: ListMode, visitor: ListMode._Visitor<Result>): Result => {
        switch (value) {
            case ListMode.Working: return visitor.working();
            case ListMode.Snapshot: return visitor.snapshot();
            case ListMode.Changes: return visitor.changes();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ListMode {
    export type Working = "working" & {
        __Working: void,
    };
    export type Snapshot = "snapshot" & {
        __Snapshot: void,
    };
    export type Changes = "changes" & {
        __Changes: void,
    };

    export interface _Visitor<Result> {
        working: () => Result;
        snapshot: () => Result;
        changes: () => Result;
        _unknown: () => Result;
    }
}
