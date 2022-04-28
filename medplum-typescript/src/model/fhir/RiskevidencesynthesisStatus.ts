export type RiskevidencesynthesisStatus =
    | RiskevidencesynthesisStatus.Draft
    | RiskevidencesynthesisStatus.Active
    | RiskevidencesynthesisStatus.Retired;

export const RiskevidencesynthesisStatus = {
    Draft: "draft" as RiskevidencesynthesisStatus.Draft,
    Active: "active" as RiskevidencesynthesisStatus.Active,
    Retired: "retired" as RiskevidencesynthesisStatus.Retired,

    _visit: <Result>(value: RiskevidencesynthesisStatus, visitor: RiskevidencesynthesisStatus._Visitor<Result>): Result => {
        switch (value) {
            case RiskevidencesynthesisStatus.Draft: return visitor.draft();
            case RiskevidencesynthesisStatus.Active: return visitor.active();
            case RiskevidencesynthesisStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace RiskevidencesynthesisStatus {
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
