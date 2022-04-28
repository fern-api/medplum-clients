export type SubscriptionStatus =
    | SubscriptionStatus.Requested
    | SubscriptionStatus.Active
    | SubscriptionStatus.Error
    | SubscriptionStatus.Off;

export const SubscriptionStatus = {
    Requested: "requested" as SubscriptionStatus.Requested,
    Active: "active" as SubscriptionStatus.Active,
    Error: "error" as SubscriptionStatus.Error,
    Off: "off" as SubscriptionStatus.Off,

    _visit: <Result>(value: SubscriptionStatus, visitor: SubscriptionStatus._Visitor<Result>): Result => {
        switch (value) {
            case SubscriptionStatus.Requested: return visitor.requested();
            case SubscriptionStatus.Active: return visitor.active();
            case SubscriptionStatus.Error: return visitor.error();
            case SubscriptionStatus.Off: return visitor.off();
            default: return visitor._unknown();
        }
    },
};

export declare namespace SubscriptionStatus {
    export type Requested = "requested" & {
        __Requested: void,
    };
    export type Active = "active" & {
        __Active: void,
    };
    export type Error = "error" & {
        __Error: void,
    };
    export type Off = "off" & {
        __Off: void,
    };

    export interface _Visitor<Result> {
        requested: () => Result;
        active: () => Result;
        error: () => Result;
        off: () => Result;
        _unknown: () => Result;
    }
}
