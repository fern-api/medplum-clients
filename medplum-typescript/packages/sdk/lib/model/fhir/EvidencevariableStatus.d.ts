export declare type EvidencevariableStatus = EvidencevariableStatus.Draft | EvidencevariableStatus.Active | EvidencevariableStatus.Retired;
export declare const EvidencevariableStatus: {
    Draft: EvidencevariableStatus.Draft;
    Active: EvidencevariableStatus.Active;
    Retired: EvidencevariableStatus.Retired;
    _visit: <Result>(value: EvidencevariableStatus, visitor: EvidencevariableStatus._Visitor<Result>) => Result;
};
export declare namespace EvidencevariableStatus {
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
