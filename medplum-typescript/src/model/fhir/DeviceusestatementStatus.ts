export type DeviceusestatementStatus =
    | DeviceusestatementStatus.Active
    | DeviceusestatementStatus.Completed
    | DeviceusestatementStatus.Intended
    | DeviceusestatementStatus.Stopped;

export const DeviceusestatementStatus = {
    Active: "active" as DeviceusestatementStatus.Active,
    Completed: "completed" as DeviceusestatementStatus.Completed,
    Intended: "intended" as DeviceusestatementStatus.Intended,
    Stopped: "stopped" as DeviceusestatementStatus.Stopped,

    _visit: <Result>(value: DeviceusestatementStatus, visitor: DeviceusestatementStatus._Visitor<Result>): Result => {
        switch (value) {
            case DeviceusestatementStatus.Active: return visitor.active();
            case DeviceusestatementStatus.Completed: return visitor.completed();
            case DeviceusestatementStatus.Intended: return visitor.intended();
            case DeviceusestatementStatus.Stopped: return visitor.stopped();
            default: return visitor._unknown();
        }
    },
};

export declare namespace DeviceusestatementStatus {
    export type Active = "active" & {
        __Active: void,
    };
    export type Completed = "completed" & {
        __Completed: void,
    };
    export type Intended = "intended" & {
        __Intended: void,
    };
    export type Stopped = "stopped" & {
        __Stopped: void,
    };

    export interface _Visitor<Result> {
        active: () => Result;
        completed: () => Result;
        intended: () => Result;
        stopped: () => Result;
        _unknown: () => Result;
    }
}
