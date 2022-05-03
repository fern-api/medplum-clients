export type TaskStatus =
    | TaskStatus.Draft
    | TaskStatus.Requested
    | TaskStatus.Received
    | TaskStatus.Accepted
    | TaskStatus.Rejected
    | TaskStatus.Ready
    | TaskStatus.Cancelled
    | TaskStatus.Failed
    | TaskStatus.Completed;

export const TaskStatus = {
    Draft: "draft" as TaskStatus.Draft,
    Requested: "requested" as TaskStatus.Requested,
    Received: "received" as TaskStatus.Received,
    Accepted: "accepted" as TaskStatus.Accepted,
    Rejected: "rejected" as TaskStatus.Rejected,
    Ready: "ready" as TaskStatus.Ready,
    Cancelled: "cancelled" as TaskStatus.Cancelled,
    Failed: "failed" as TaskStatus.Failed,
    Completed: "completed" as TaskStatus.Completed,

    _visit: <Result>(
        value: TaskStatus,
        visitor: TaskStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case TaskStatus.Draft:
                return visitor.draft();
            case TaskStatus.Requested:
                return visitor.requested();
            case TaskStatus.Received:
                return visitor.received();
            case TaskStatus.Accepted:
                return visitor.accepted();
            case TaskStatus.Rejected:
                return visitor.rejected();
            case TaskStatus.Ready:
                return visitor.ready();
            case TaskStatus.Cancelled:
                return visitor.cancelled();
            case TaskStatus.Failed:
                return visitor.failed();
            case TaskStatus.Completed:
                return visitor.completed();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace TaskStatus {
    export type Draft = "draft" & {
        __Draft: void;
    };
    export type Requested = "requested" & {
        __Requested: void;
    };
    export type Received = "received" & {
        __Received: void;
    };
    export type Accepted = "accepted" & {
        __Accepted: void;
    };
    export type Rejected = "rejected" & {
        __Rejected: void;
    };
    export type Ready = "ready" & {
        __Ready: void;
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    export type Failed = "failed" & {
        __Failed: void;
    };
    export type Completed = "completed" & {
        __Completed: void;
    };

    export interface _Visitor<Result> {
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
