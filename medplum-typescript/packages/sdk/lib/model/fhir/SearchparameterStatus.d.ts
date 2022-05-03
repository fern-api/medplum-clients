export declare type SearchparameterStatus = SearchparameterStatus.Draft | SearchparameterStatus.Active | SearchparameterStatus.Retired;
export declare const SearchparameterStatus: {
    Draft: SearchparameterStatus.Draft;
    Active: SearchparameterStatus.Active;
    Retired: SearchparameterStatus.Retired;
    _visit: <Result>(value: SearchparameterStatus, visitor: SearchparameterStatus._Visitor<Result>) => Result;
};
export declare namespace SearchparameterStatus {
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
