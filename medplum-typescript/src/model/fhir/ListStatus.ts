export type ListStatus =
    | ListStatus.Current
    | ListStatus.Retired;

export const ListStatus = {
    Current: "current" as ListStatus.Current,
    Retired: "retired" as ListStatus.Retired,

    _visit: <Result>(value: ListStatus, visitor: ListStatus._Visitor<Result>): Result => {
        switch (value) {
            case ListStatus.Current: return visitor.current();
            case ListStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ListStatus {
    export type Current = "current" & {
        __Current: void,
    };
    export type Retired = "retired" & {
        __Retired: void,
    };

    export interface _Visitor<Result> {
        current: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
