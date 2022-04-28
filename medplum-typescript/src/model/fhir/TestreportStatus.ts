export type TestreportStatus =
    | TestreportStatus.Completed
    | TestreportStatus.Waiting
    | TestreportStatus.Stopped;

export const TestreportStatus = {
    Completed: "completed" as TestreportStatus.Completed,
    Waiting: "waiting" as TestreportStatus.Waiting,
    Stopped: "stopped" as TestreportStatus.Stopped,

    _visit: <Result>(value: TestreportStatus, visitor: TestreportStatus._Visitor<Result>): Result => {
        switch (value) {
            case TestreportStatus.Completed: return visitor.completed();
            case TestreportStatus.Waiting: return visitor.waiting();
            case TestreportStatus.Stopped: return visitor.stopped();
            default: return visitor._unknown();
        }
    },
};

export declare namespace TestreportStatus {
    export type Completed = "completed" & {
        __Completed: void,
    };
    export type Waiting = "waiting" & {
        __Waiting: void,
    };
    export type Stopped = "stopped" & {
        __Stopped: void,
    };

    export interface _Visitor<Result> {
        completed: () => Result;
        waiting: () => Result;
        stopped: () => Result;
        _unknown: () => Result;
    }
}
