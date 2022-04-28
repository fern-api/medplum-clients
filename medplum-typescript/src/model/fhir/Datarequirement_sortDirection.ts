export type Datarequirement_sortDirection =
    | Datarequirement_sortDirection.Ascending
    | Datarequirement_sortDirection.Descending;

export const Datarequirement_sortDirection = {
    Ascending: "ascending" as Datarequirement_sortDirection.Ascending,
    Descending: "descending" as Datarequirement_sortDirection.Descending,

    _visit: <Result>(value: Datarequirement_sortDirection, visitor: Datarequirement_sortDirection._Visitor<Result>): Result => {
        switch (value) {
            case Datarequirement_sortDirection.Ascending: return visitor.ascending();
            case Datarequirement_sortDirection.Descending: return visitor.descending();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Datarequirement_sortDirection {
    export type Ascending = "ascending" & {
        __Ascending: void,
    };
    export type Descending = "descending" & {
        __Descending: void,
    };

    export interface _Visitor<Result> {
        ascending: () => Result;
        descending: () => Result;
        _unknown: () => Result;
    }
}
