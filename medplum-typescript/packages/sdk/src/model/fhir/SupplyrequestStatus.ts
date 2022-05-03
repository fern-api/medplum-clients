export type SupplyrequestStatus =
    | SupplyrequestStatus.Draft
    | SupplyrequestStatus.Active
    | SupplyrequestStatus.Suspended
    | SupplyrequestStatus.Cancelled
    | SupplyrequestStatus.Completed;

export const SupplyrequestStatus = {
    Draft: "draft" as SupplyrequestStatus.Draft,
    Active: "active" as SupplyrequestStatus.Active,
    Suspended: "suspended" as SupplyrequestStatus.Suspended,
    Cancelled: "cancelled" as SupplyrequestStatus.Cancelled,
    Completed: "completed" as SupplyrequestStatus.Completed,

    _visit: <Result>(
        value: SupplyrequestStatus,
        visitor: SupplyrequestStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case SupplyrequestStatus.Draft:
                return visitor.draft();
            case SupplyrequestStatus.Active:
                return visitor.active();
            case SupplyrequestStatus.Suspended:
                return visitor.suspended();
            case SupplyrequestStatus.Cancelled:
                return visitor.cancelled();
            case SupplyrequestStatus.Completed:
                return visitor.completed();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace SupplyrequestStatus {
    export type Draft = "draft" & {
        __Draft: void;
    };
    export type Active = "active" & {
        __Active: void;
    };
    export type Suspended = "suspended" & {
        __Suspended: void;
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    export type Completed = "completed" & {
        __Completed: void;
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        suspended: () => Result;
        cancelled: () => Result;
        completed: () => Result;
        _unknown: () => Result;
    }
}
