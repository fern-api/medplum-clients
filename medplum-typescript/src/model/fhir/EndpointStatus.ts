export type EndpointStatus =
    | EndpointStatus.Active
    | EndpointStatus.Suspended
    | EndpointStatus.Error
    | EndpointStatus.Off
    | EndpointStatus.Test;

export const EndpointStatus = {
    Active: "active" as EndpointStatus.Active,
    Suspended: "suspended" as EndpointStatus.Suspended,
    Error: "error" as EndpointStatus.Error,
    Off: "off" as EndpointStatus.Off,
    Test: "test" as EndpointStatus.Test,

    _visit: <Result>(
        value: EndpointStatus,
        visitor: EndpointStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case EndpointStatus.Active:
                return visitor.active();
            case EndpointStatus.Suspended:
                return visitor.suspended();
            case EndpointStatus.Error:
                return visitor.error();
            case EndpointStatus.Off:
                return visitor.off();
            case EndpointStatus.Test:
                return visitor.test();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace EndpointStatus {
    export type Active = "active" & {
        __Active: void;
    };
    export type Suspended = "suspended" & {
        __Suspended: void;
    };
    export type Error = "error" & {
        __Error: void;
    };
    export type Off = "off" & {
        __Off: void;
    };
    export type Test = "test" & {
        __Test: void;
    };

    export interface _Visitor<Result> {
        active: () => Result;
        suspended: () => Result;
        error: () => Result;
        off: () => Result;
        test: () => Result;
        _unknown: () => Result;
    }
}
