export type EffectevidencesynthesisStatus =
    | EffectevidencesynthesisStatus.Draft
    | EffectevidencesynthesisStatus.Active
    | EffectevidencesynthesisStatus.Retired;

export const EffectevidencesynthesisStatus = {
    Draft: "draft" as EffectevidencesynthesisStatus.Draft,
    Active: "active" as EffectevidencesynthesisStatus.Active,
    Retired: "retired" as EffectevidencesynthesisStatus.Retired,

    _visit: <Result>(value: EffectevidencesynthesisStatus, visitor: EffectevidencesynthesisStatus._Visitor<Result>): Result => {
        switch (value) {
            case EffectevidencesynthesisStatus.Draft: return visitor.draft();
            case EffectevidencesynthesisStatus.Active: return visitor.active();
            case EffectevidencesynthesisStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace EffectevidencesynthesisStatus {
    export type Draft = "draft" & {
        __Draft: void,
    };
    export type Active = "active" & {
        __Active: void,
    };
    export type Retired = "retired" & {
        __Retired: void,
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
