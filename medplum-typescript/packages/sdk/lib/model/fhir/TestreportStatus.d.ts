export declare type TestreportStatus = TestreportStatus.Completed | TestreportStatus.Waiting | TestreportStatus.Stopped;
export declare const TestreportStatus: {
    Completed: TestreportStatus.Completed;
    Waiting: TestreportStatus.Waiting;
    Stopped: TestreportStatus.Stopped;
    _visit: <Result>(value: TestreportStatus, visitor: TestreportStatus._Visitor<Result>) => Result;
};
export declare namespace TestreportStatus {
    type Completed = "completed" & {
        __Completed: void;
    };
    type Waiting = "waiting" & {
        __Waiting: void;
    };
    type Stopped = "stopped" & {
        __Stopped: void;
    };
    interface _Visitor<Result> {
        completed: () => Result;
        waiting: () => Result;
        stopped: () => Result;
        _unknown: () => Result;
    }
}
