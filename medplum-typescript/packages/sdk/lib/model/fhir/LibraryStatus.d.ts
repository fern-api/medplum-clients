export declare type LibraryStatus = LibraryStatus.Draft | LibraryStatus.Active | LibraryStatus.Retired;
export declare const LibraryStatus: {
    Draft: LibraryStatus.Draft;
    Active: LibraryStatus.Active;
    Retired: LibraryStatus.Retired;
    _visit: <Result>(value: LibraryStatus, visitor: LibraryStatus._Visitor<Result>) => Result;
};
export declare namespace LibraryStatus {
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
