export type GoalLifecyclestatus =
    | GoalLifecyclestatus.Proposed
    | GoalLifecyclestatus.Planned
    | GoalLifecyclestatus.Accepted
    | GoalLifecyclestatus.Active
    | GoalLifecyclestatus.Completed
    | GoalLifecyclestatus.Cancelled
    | GoalLifecyclestatus.Rejected;

export const GoalLifecyclestatus = {
    Proposed: "proposed" as GoalLifecyclestatus.Proposed,
    Planned: "planned" as GoalLifecyclestatus.Planned,
    Accepted: "accepted" as GoalLifecyclestatus.Accepted,
    Active: "active" as GoalLifecyclestatus.Active,
    Completed: "completed" as GoalLifecyclestatus.Completed,
    Cancelled: "cancelled" as GoalLifecyclestatus.Cancelled,
    Rejected: "rejected" as GoalLifecyclestatus.Rejected,

    _visit: <Result>(
        value: GoalLifecyclestatus,
        visitor: GoalLifecyclestatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case GoalLifecyclestatus.Proposed:
                return visitor.proposed();
            case GoalLifecyclestatus.Planned:
                return visitor.planned();
            case GoalLifecyclestatus.Accepted:
                return visitor.accepted();
            case GoalLifecyclestatus.Active:
                return visitor.active();
            case GoalLifecyclestatus.Completed:
                return visitor.completed();
            case GoalLifecyclestatus.Cancelled:
                return visitor.cancelled();
            case GoalLifecyclestatus.Rejected:
                return visitor.rejected();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace GoalLifecyclestatus {
    export type Proposed = "proposed" & {
        __Proposed: void;
    };
    export type Planned = "planned" & {
        __Planned: void;
    };
    export type Accepted = "accepted" & {
        __Accepted: void;
    };
    export type Active = "active" & {
        __Active: void;
    };
    export type Completed = "completed" & {
        __Completed: void;
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    export type Rejected = "rejected" & {
        __Rejected: void;
    };

    export interface _Visitor<Result> {
        proposed: () => Result;
        planned: () => Result;
        accepted: () => Result;
        active: () => Result;
        completed: () => Result;
        cancelled: () => Result;
        rejected: () => Result;
        _unknown: () => Result;
    }
}
