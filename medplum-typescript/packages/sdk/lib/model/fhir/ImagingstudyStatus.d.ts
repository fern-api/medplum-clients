export declare type ImagingstudyStatus = ImagingstudyStatus.Registered | ImagingstudyStatus.Available | ImagingstudyStatus.Cancelled;
export declare const ImagingstudyStatus: {
    Registered: ImagingstudyStatus.Registered;
    Available: ImagingstudyStatus.Available;
    Cancelled: ImagingstudyStatus.Cancelled;
    _visit: <Result>(value: ImagingstudyStatus, visitor: ImagingstudyStatus._Visitor<Result>) => Result;
};
export declare namespace ImagingstudyStatus {
    type Registered = "registered" & {
        __Registered: void;
    };
    type Available = "available" & {
        __Available: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    interface _Visitor<Result> {
        registered: () => Result;
        available: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
