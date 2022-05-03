export declare type FamilymemberhistoryStatus = FamilymemberhistoryStatus.Partial | FamilymemberhistoryStatus.Completed;
export declare const FamilymemberhistoryStatus: {
    Partial: FamilymemberhistoryStatus.Partial;
    Completed: FamilymemberhistoryStatus.Completed;
    _visit: <Result>(value: FamilymemberhistoryStatus, visitor: FamilymemberhistoryStatus._Visitor<Result>) => Result;
};
export declare namespace FamilymemberhistoryStatus {
    type Partial = "partial" & {
        __Partial: void;
    };
    type Completed = "completed" & {
        __Completed: void;
    };
    interface _Visitor<Result> {
        partial: () => Result;
        completed: () => Result;
        _unknown: () => Result;
    }
}
