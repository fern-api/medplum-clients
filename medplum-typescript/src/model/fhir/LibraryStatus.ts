export type LibraryStatus =
    | LibraryStatus.Draft
    | LibraryStatus.Active
    | LibraryStatus.Retired;

export const LibraryStatus = {
    Draft: "draft" as LibraryStatus.Draft,
    Active: "active" as LibraryStatus.Active,
    Retired: "retired" as LibraryStatus.Retired,

    _visit: <Result>(value: LibraryStatus, visitor: LibraryStatus._Visitor<Result>): Result => {
        switch (value) {
            case LibraryStatus.Draft: return visitor.draft();
            case LibraryStatus.Active: return visitor.active();
            case LibraryStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace LibraryStatus {
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
