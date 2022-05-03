export declare type RiskevidencesynthesisStatus = RiskevidencesynthesisStatus.Draft | RiskevidencesynthesisStatus.Active | RiskevidencesynthesisStatus.Retired;
export declare const RiskevidencesynthesisStatus: {
    Draft: RiskevidencesynthesisStatus.Draft;
    Active: RiskevidencesynthesisStatus.Active;
    Retired: RiskevidencesynthesisStatus.Retired;
    _visit: <Result>(value: RiskevidencesynthesisStatus, visitor: RiskevidencesynthesisStatus._Visitor<Result>) => Result;
};
export declare namespace RiskevidencesynthesisStatus {
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
