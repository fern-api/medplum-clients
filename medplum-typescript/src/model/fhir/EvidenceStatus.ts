export type EvidenceStatus =
    | EvidenceStatus.Draft
    | EvidenceStatus.Active
    | EvidenceStatus.Retired;

export const EvidenceStatus = {
    Draft: "draft" as EvidenceStatus.Draft,
    Active: "active" as EvidenceStatus.Active,
    Retired: "retired" as EvidenceStatus.Retired,

    _visit: <Result>(
        value: EvidenceStatus,
        visitor: EvidenceStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case EvidenceStatus.Draft:
                return visitor.draft();
            case EvidenceStatus.Active:
                return visitor.active();
            case EvidenceStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace EvidenceStatus {
    export type Draft = "draft" & {
        __Draft: void;
    };
    export type Active = "active" & {
        __Active: void;
    };
    export type Retired = "retired" & {
        __Retired: void;
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
