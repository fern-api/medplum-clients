export type SlotStatus =
    | SlotStatus.Busy
    | SlotStatus.Free;

export const SlotStatus = {
    Busy: "busy" as SlotStatus.Busy,
    Free: "free" as SlotStatus.Free,

    _visit: <Result>(value: SlotStatus, visitor: SlotStatus._Visitor<Result>): Result => {
        switch (value) {
            case SlotStatus.Busy: return visitor.busy();
            case SlotStatus.Free: return visitor.free();
            default: return visitor._unknown();
        }
    },
};

export declare namespace SlotStatus {
    export type Busy = "busy" & {
        __Busy: void,
    };
    export type Free = "free" & {
        __Free: void,
    };

    export interface _Visitor<Result> {
        busy: () => Result;
        free: () => Result;
        _unknown: () => Result;
    }
}
