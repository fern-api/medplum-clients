export declare type SupplyrequestStatus = SupplyrequestStatus.Draft | SupplyrequestStatus.Active | SupplyrequestStatus.Suspended | SupplyrequestStatus.Cancelled | SupplyrequestStatus.Completed;
export declare const SupplyrequestStatus: {
    Draft: SupplyrequestStatus.Draft;
    Active: SupplyrequestStatus.Active;
    Suspended: SupplyrequestStatus.Suspended;
    Cancelled: SupplyrequestStatus.Cancelled;
    Completed: SupplyrequestStatus.Completed;
    _visit: <Result>(value: SupplyrequestStatus, visitor: SupplyrequestStatus._Visitor<Result>) => Result;
};
export declare namespace SupplyrequestStatus {
    type Draft = "draft" & {
        __Draft: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Suspended = "suspended" & {
        __Suspended: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    type Completed = "completed" & {
        __Completed: void;
    };
    interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        suspended: () => Result;
        cancelled: () => Result;
        completed: () => Result;
        _unknown: () => Result;
    }
}
