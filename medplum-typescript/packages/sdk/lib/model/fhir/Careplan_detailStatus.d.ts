export declare type Careplan_detailStatus = Careplan_detailStatus.Scheduled | Careplan_detailStatus.Completed | Careplan_detailStatus.Cancelled | Careplan_detailStatus.Stopped;
export declare const Careplan_detailStatus: {
    Scheduled: Careplan_detailStatus.Scheduled;
    Completed: Careplan_detailStatus.Completed;
    Cancelled: Careplan_detailStatus.Cancelled;
    Stopped: Careplan_detailStatus.Stopped;
    _visit: <Result>(value: Careplan_detailStatus, visitor: Careplan_detailStatus._Visitor<Result>) => Result;
};
export declare namespace Careplan_detailStatus {
    type Scheduled = "scheduled" & {
        __Scheduled: void;
    };
    type Completed = "completed" & {
        __Completed: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    type Stopped = "stopped" & {
        __Stopped: void;
    };
    interface _Visitor<Result> {
        scheduled: () => Result;
        completed: () => Result;
        cancelled: () => Result;
        stopped: () => Result;
        _unknown: () => Result;
    }
}
