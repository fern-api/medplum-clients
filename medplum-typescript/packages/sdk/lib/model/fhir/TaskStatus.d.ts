export declare type TaskStatus = TaskStatus.Draft | TaskStatus.Requested | TaskStatus.Received | TaskStatus.Accepted | TaskStatus.Rejected | TaskStatus.Ready | TaskStatus.Cancelled | TaskStatus.Failed | TaskStatus.Completed;
export declare const TaskStatus: {
    Draft: TaskStatus.Draft;
    Requested: TaskStatus.Requested;
    Received: TaskStatus.Received;
    Accepted: TaskStatus.Accepted;
    Rejected: TaskStatus.Rejected;
    Ready: TaskStatus.Ready;
    Cancelled: TaskStatus.Cancelled;
    Failed: TaskStatus.Failed;
    Completed: TaskStatus.Completed;
    _visit: <Result>(value: TaskStatus, visitor: TaskStatus._Visitor<Result>) => Result;
};
export declare namespace TaskStatus {
    type Draft = "draft" & {
        __Draft: void;
    };
    type Requested = "requested" & {
        __Requested: void;
    };
    type Received = "received" & {
        __Received: void;
    };
    type Accepted = "accepted" & {
        __Accepted: void;
    };
    type Rejected = "rejected" & {
        __Rejected: void;
    };
    type Ready = "ready" & {
        __Ready: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    type Failed = "failed" & {
        __Failed: void;
    };
    type Completed = "completed" & {
        __Completed: void;
    };
    interface _Visitor<Result> {
        draft: () => Result;
        requested: () => Result;
        received: () => Result;
        accepted: () => Result;
        rejected: () => Result;
        ready: () => Result;
        cancelled: () => Result;
        failed: () => Result;
        completed: () => Result;
        _unknown: () => Result;
    }
}
