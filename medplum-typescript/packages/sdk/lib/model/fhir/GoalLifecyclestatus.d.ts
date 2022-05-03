export declare type GoalLifecyclestatus = GoalLifecyclestatus.Proposed | GoalLifecyclestatus.Planned | GoalLifecyclestatus.Accepted | GoalLifecyclestatus.Active | GoalLifecyclestatus.Completed | GoalLifecyclestatus.Cancelled | GoalLifecyclestatus.Rejected;
export declare const GoalLifecyclestatus: {
    Proposed: GoalLifecyclestatus.Proposed;
    Planned: GoalLifecyclestatus.Planned;
    Accepted: GoalLifecyclestatus.Accepted;
    Active: GoalLifecyclestatus.Active;
    Completed: GoalLifecyclestatus.Completed;
    Cancelled: GoalLifecyclestatus.Cancelled;
    Rejected: GoalLifecyclestatus.Rejected;
    _visit: <Result>(value: GoalLifecyclestatus, visitor: GoalLifecyclestatus._Visitor<Result>) => Result;
};
export declare namespace GoalLifecyclestatus {
    type Proposed = "proposed" & {
        __Proposed: void;
    };
    type Planned = "planned" & {
        __Planned: void;
    };
    type Accepted = "accepted" & {
        __Accepted: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Completed = "completed" & {
        __Completed: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    type Rejected = "rejected" & {
        __Rejected: void;
    };
    interface _Visitor<Result> {
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
