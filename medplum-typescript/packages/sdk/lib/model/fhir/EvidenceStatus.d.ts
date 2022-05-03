export declare type EvidenceStatus = EvidenceStatus.Draft | EvidenceStatus.Active | EvidenceStatus.Retired;
export declare const EvidenceStatus: {
    Draft: EvidenceStatus.Draft;
    Active: EvidenceStatus.Active;
    Retired: EvidenceStatus.Retired;
    _visit: <Result>(value: EvidenceStatus, visitor: EvidenceStatus._Visitor<Result>) => Result;
};
export declare namespace EvidenceStatus {
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
