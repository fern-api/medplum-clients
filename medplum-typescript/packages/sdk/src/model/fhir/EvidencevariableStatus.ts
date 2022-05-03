export type EvidencevariableStatus =
    | EvidencevariableStatus.Draft
    | EvidencevariableStatus.Active
    | EvidencevariableStatus.Retired;

export const EvidencevariableStatus = {
    Draft: "draft" as EvidencevariableStatus.Draft,
    Active: "active" as EvidencevariableStatus.Active,
    Retired: "retired" as EvidencevariableStatus.Retired,

    _visit: <Result>(
        value: EvidencevariableStatus,
        visitor: EvidencevariableStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case EvidencevariableStatus.Draft:
                return visitor.draft();
            case EvidencevariableStatus.Active:
                return visitor.active();
            case EvidencevariableStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace EvidencevariableStatus {
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
