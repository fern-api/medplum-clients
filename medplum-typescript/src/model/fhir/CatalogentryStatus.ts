export type CatalogentryStatus =
    | CatalogentryStatus.Draft
    | CatalogentryStatus.Active
    | CatalogentryStatus.Retired;

export const CatalogentryStatus = {
    Draft: "draft" as CatalogentryStatus.Draft,
    Active: "active" as CatalogentryStatus.Active,
    Retired: "retired" as CatalogentryStatus.Retired,

    _visit: <Result>(value: CatalogentryStatus, visitor: CatalogentryStatus._Visitor<Result>): Result => {
        switch (value) {
            case CatalogentryStatus.Draft: return visitor.draft();
            case CatalogentryStatus.Active: return visitor.active();
            case CatalogentryStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace CatalogentryStatus {
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
