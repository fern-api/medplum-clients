export declare type Datarequirement_sortDirection = Datarequirement_sortDirection.Ascending | Datarequirement_sortDirection.Descending;
export declare const Datarequirement_sortDirection: {
    Ascending: Datarequirement_sortDirection.Ascending;
    Descending: Datarequirement_sortDirection.Descending;
    _visit: <Result>(value: Datarequirement_sortDirection, visitor: Datarequirement_sortDirection._Visitor<Result>) => Result;
};
export declare namespace Datarequirement_sortDirection {
    type Ascending = "ascending" & {
        __Ascending: void;
    };
    type Descending = "descending" & {
        __Descending: void;
    };
    interface _Visitor<Result> {
        ascending: () => Result;
        descending: () => Result;
        _unknown: () => Result;
    }
}
