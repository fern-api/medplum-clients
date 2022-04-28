export type FamilymemberhistoryStatus =
    | FamilymemberhistoryStatus.Partial
    | FamilymemberhistoryStatus.Completed;

export const FamilymemberhistoryStatus = {
    Partial: "partial" as FamilymemberhistoryStatus.Partial,
    Completed: "completed" as FamilymemberhistoryStatus.Completed,

    _visit: <Result>(value: FamilymemberhistoryStatus, visitor: FamilymemberhistoryStatus._Visitor<Result>): Result => {
        switch (value) {
            case FamilymemberhistoryStatus.Partial: return visitor.partial();
            case FamilymemberhistoryStatus.Completed: return visitor.completed();
            default: return visitor._unknown();
        }
    },
};

export declare namespace FamilymemberhistoryStatus {
    export type Partial = "partial" & {
        __Partial: void,
    };
    export type Completed = "completed" & {
        __Completed: void,
    };

    export interface _Visitor<Result> {
        partial: () => Result;
        completed: () => Result;
        _unknown: () => Result;
    }
}
