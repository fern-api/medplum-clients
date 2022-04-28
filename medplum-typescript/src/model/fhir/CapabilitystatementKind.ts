export type CapabilitystatementKind =
    | CapabilitystatementKind.Instance
    | CapabilitystatementKind.Capability
    | CapabilitystatementKind.Requirements;

export const CapabilitystatementKind = {
    Instance: "instance" as CapabilitystatementKind.Instance,
    Capability: "capability" as CapabilitystatementKind.Capability,
    Requirements: "requirements" as CapabilitystatementKind.Requirements,

    _visit: <Result>(value: CapabilitystatementKind, visitor: CapabilitystatementKind._Visitor<Result>): Result => {
        switch (value) {
            case CapabilitystatementKind.Instance: return visitor.instance();
            case CapabilitystatementKind.Capability: return visitor.capability();
            case CapabilitystatementKind.Requirements: return visitor.requirements();
            default: return visitor._unknown();
        }
    },
};

export declare namespace CapabilitystatementKind {
    export type Instance = "instance" & {
        __Instance: void,
    };
    export type Capability = "capability" & {
        __Capability: void,
    };
    export type Requirements = "requirements" & {
        __Requirements: void,
    };

    export interface _Visitor<Result> {
        instance: () => Result;
        capability: () => Result;
        requirements: () => Result;
        _unknown: () => Result;
    }
}
