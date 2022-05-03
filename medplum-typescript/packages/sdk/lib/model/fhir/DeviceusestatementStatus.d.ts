export declare type DeviceusestatementStatus = DeviceusestatementStatus.Active | DeviceusestatementStatus.Completed | DeviceusestatementStatus.Intended | DeviceusestatementStatus.Stopped;
export declare const DeviceusestatementStatus: {
    Active: DeviceusestatementStatus.Active;
    Completed: DeviceusestatementStatus.Completed;
    Intended: DeviceusestatementStatus.Intended;
    Stopped: DeviceusestatementStatus.Stopped;
    _visit: <Result>(value: DeviceusestatementStatus, visitor: DeviceusestatementStatus._Visitor<Result>) => Result;
};
export declare namespace DeviceusestatementStatus {
    type Active = "active" & {
        __Active: void;
    };
    type Completed = "completed" & {
        __Completed: void;
    };
    type Intended = "intended" & {
        __Intended: void;
    };
    type Stopped = "stopped" & {
        __Stopped: void;
    };
    interface _Visitor<Result> {
        active: () => Result;
        completed: () => Result;
        intended: () => Result;
        stopped: () => Result;
        _unknown: () => Result;
    }
}
