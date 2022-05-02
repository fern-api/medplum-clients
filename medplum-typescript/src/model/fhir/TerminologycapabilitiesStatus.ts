export type TerminologycapabilitiesStatus =
    | TerminologycapabilitiesStatus.Draft
    | TerminologycapabilitiesStatus.Active
    | TerminologycapabilitiesStatus.Retired;

export const TerminologycapabilitiesStatus = {
    Draft: "draft" as TerminologycapabilitiesStatus.Draft,
    Active: "active" as TerminologycapabilitiesStatus.Active,
    Retired: "retired" as TerminologycapabilitiesStatus.Retired,

    _visit: <Result>(
        value: TerminologycapabilitiesStatus,
        visitor: TerminologycapabilitiesStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case TerminologycapabilitiesStatus.Draft:
                return visitor.draft();
            case TerminologycapabilitiesStatus.Active:
                return visitor.active();
            case TerminologycapabilitiesStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace TerminologycapabilitiesStatus {
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
