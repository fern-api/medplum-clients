export declare type SubscriptionStatus = SubscriptionStatus.Requested | SubscriptionStatus.Active | SubscriptionStatus.Error | SubscriptionStatus.Off;
export declare const SubscriptionStatus: {
    Requested: SubscriptionStatus.Requested;
    Active: SubscriptionStatus.Active;
    Error: SubscriptionStatus.Error;
    Off: SubscriptionStatus.Off;
    _visit: <Result>(value: SubscriptionStatus, visitor: SubscriptionStatus._Visitor<Result>) => Result;
};
export declare namespace SubscriptionStatus {
    type Requested = "requested" & {
        __Requested: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Error = "error" & {
        __Error: void;
    };
    type Off = "off" & {
        __Off: void;
    };
    interface _Visitor<Result> {
        requested: () => Result;
        active: () => Result;
        error: () => Result;
        off: () => Result;
        _unknown: () => Result;
    }
}
