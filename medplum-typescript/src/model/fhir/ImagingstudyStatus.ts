export type ImagingstudyStatus =
    | ImagingstudyStatus.Registered
    | ImagingstudyStatus.Available
    | ImagingstudyStatus.Cancelled;

export const ImagingstudyStatus = {
    Registered: "registered" as ImagingstudyStatus.Registered,
    Available: "available" as ImagingstudyStatus.Available,
    Cancelled: "cancelled" as ImagingstudyStatus.Cancelled,

    _visit: <Result>(
        value: ImagingstudyStatus,
        visitor: ImagingstudyStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case ImagingstudyStatus.Registered:
                return visitor.registered();
            case ImagingstudyStatus.Available:
                return visitor.available();
            case ImagingstudyStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace ImagingstudyStatus {
    export type Registered = "registered" & {
        __Registered: void;
    };
    export type Available = "available" & {
        __Available: void;
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void;
    };

    export interface _Visitor<Result> {
        registered: () => Result;
        available: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
