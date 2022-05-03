export declare type CapabilitystatementStatus = CapabilitystatementStatus.Draft | CapabilitystatementStatus.Active | CapabilitystatementStatus.Retired;
export declare const CapabilitystatementStatus: {
    Draft: CapabilitystatementStatus.Draft;
    Active: CapabilitystatementStatus.Active;
    Retired: CapabilitystatementStatus.Retired;
    _visit: <Result>(value: CapabilitystatementStatus, visitor: CapabilitystatementStatus._Visitor<Result>) => Result;
};
export declare namespace CapabilitystatementStatus {
    type Draft = "draft" & {
        __Draft: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Retired = "retired" & {
        __Retired: void;
    };
    interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
