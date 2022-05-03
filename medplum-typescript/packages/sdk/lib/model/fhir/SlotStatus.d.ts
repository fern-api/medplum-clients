export declare type SlotStatus = SlotStatus.Busy | SlotStatus.Free;
export declare const SlotStatus: {
    Busy: SlotStatus.Busy;
    Free: SlotStatus.Free;
    _visit: <Result>(value: SlotStatus, visitor: SlotStatus._Visitor<Result>) => Result;
};
export declare namespace SlotStatus {
    type Busy = "busy" & {
        __Busy: void;
    };
    type Free = "free" & {
        __Free: void;
    };
    interface _Visitor<Result> {
        busy: () => Result;
        free: () => Result;
        _unknown: () => Result;
    }
}
