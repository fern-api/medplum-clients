export declare type ConceptmapStatus = ConceptmapStatus.Draft | ConceptmapStatus.Active | ConceptmapStatus.Retired;
export declare const ConceptmapStatus: {
    Draft: ConceptmapStatus.Draft;
    Active: ConceptmapStatus.Active;
    Retired: ConceptmapStatus.Retired;
    _visit: <Result>(value: ConceptmapStatus, visitor: ConceptmapStatus._Visitor<Result>) => Result;
};
export declare namespace ConceptmapStatus {
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
