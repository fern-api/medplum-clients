export declare type CapabilitystatementKind = CapabilitystatementKind.Instance | CapabilitystatementKind.Capability | CapabilitystatementKind.Requirements;
export declare const CapabilitystatementKind: {
    Instance: CapabilitystatementKind.Instance;
    Capability: CapabilitystatementKind.Capability;
    Requirements: CapabilitystatementKind.Requirements;
    _visit: <Result>(value: CapabilitystatementKind, visitor: CapabilitystatementKind._Visitor<Result>) => Result;
};
export declare namespace CapabilitystatementKind {
    type Instance = "instance" & {
        __Instance: void;
    };
    type Capability = "capability" & {
        __Capability: void;
    };
    type Requirements = "requirements" & {
        __Requirements: void;
    };
    interface _Visitor<Result> {
        instance: () => Result;
        capability: () => Result;
        requirements: () => Result;
        _unknown: () => Result;
    }
}
