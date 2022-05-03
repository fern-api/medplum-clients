export declare type EndpointStatus = EndpointStatus.Active | EndpointStatus.Suspended | EndpointStatus.Error | EndpointStatus.Off | EndpointStatus.Test;
export declare const EndpointStatus: {
    Active: EndpointStatus.Active;
    Suspended: EndpointStatus.Suspended;
    Error: EndpointStatus.Error;
    Off: EndpointStatus.Off;
    Test: EndpointStatus.Test;
    _visit: <Result>(value: EndpointStatus, visitor: EndpointStatus._Visitor<Result>) => Result;
};
export declare namespace EndpointStatus {
    type Active = "active" & {
        __Active: void;
    };
    type Suspended = "suspended" & {
        __Suspended: void;
    };
    type Error = "error" & {
        __Error: void;
    };
    type Off = "off" & {
        __Off: void;
    };
    type Test = "test" & {
        __Test: void;
    };
    interface _Visitor<Result> {
        active: () => Result;
        suspended: () => Result;
        error: () => Result;
        off: () => Result;
        test: () => Result;
        _unknown: () => Result;
    }
}
