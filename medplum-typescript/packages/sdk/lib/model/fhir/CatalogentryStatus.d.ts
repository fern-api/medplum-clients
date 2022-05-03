export declare type CatalogentryStatus = CatalogentryStatus.Draft | CatalogentryStatus.Active | CatalogentryStatus.Retired;
export declare const CatalogentryStatus: {
    Draft: CatalogentryStatus.Draft;
    Active: CatalogentryStatus.Active;
    Retired: CatalogentryStatus.Retired;
    _visit: <Result>(value: CatalogentryStatus, visitor: CatalogentryStatus._Visitor<Result>) => Result;
};
export declare namespace CatalogentryStatus {
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
