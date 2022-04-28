export type Careplan_detailStatus =
    | Careplan_detailStatus.Scheduled
    | Careplan_detailStatus.Completed
    | Careplan_detailStatus.Cancelled
    | Careplan_detailStatus.Stopped;

export const Careplan_detailStatus = {
    Scheduled: "scheduled" as Careplan_detailStatus.Scheduled,
    Completed: "completed" as Careplan_detailStatus.Completed,
    Cancelled: "cancelled" as Careplan_detailStatus.Cancelled,
    Stopped: "stopped" as Careplan_detailStatus.Stopped,

    _visit: <Result>(value: Careplan_detailStatus, visitor: Careplan_detailStatus._Visitor<Result>): Result => {
        switch (value) {
            case Careplan_detailStatus.Scheduled: return visitor.scheduled();
            case Careplan_detailStatus.Completed: return visitor.completed();
            case Careplan_detailStatus.Cancelled: return visitor.cancelled();
            case Careplan_detailStatus.Stopped: return visitor.stopped();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Careplan_detailStatus {
    export type Scheduled = "scheduled" & {
        __Scheduled: void,
    };
    export type Completed = "completed" & {
        __Completed: void,
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void,
    };
    export type Stopped = "stopped" & {
        __Stopped: void,
    };

    export interface _Visitor<Result> {
        scheduled: () => Result;
        completed: () => Result;
        cancelled: () => Result;
        stopped: () => Result;
        _unknown: () => Result;
    }
}
