export declare type EffectevidencesynthesisStatus = EffectevidencesynthesisStatus.Draft | EffectevidencesynthesisStatus.Active | EffectevidencesynthesisStatus.Retired;
export declare const EffectevidencesynthesisStatus: {
    Draft: EffectevidencesynthesisStatus.Draft;
    Active: EffectevidencesynthesisStatus.Active;
    Retired: EffectevidencesynthesisStatus.Retired;
    _visit: <Result>(value: EffectevidencesynthesisStatus, visitor: EffectevidencesynthesisStatus._Visitor<Result>) => Result;
};
export declare namespace EffectevidencesynthesisStatus {
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
