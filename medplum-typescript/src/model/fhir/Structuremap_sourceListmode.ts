export type Structuremap_sourceListmode =
    | Structuremap_sourceListmode.First
    | Structuremap_sourceListmode.Last;

export const Structuremap_sourceListmode = {
    First: "first" as Structuremap_sourceListmode.First,
    Last: "last" as Structuremap_sourceListmode.Last,

    _visit: <Result>(value: Structuremap_sourceListmode, visitor: Structuremap_sourceListmode._Visitor<Result>): Result => {
        switch (value) {
            case Structuremap_sourceListmode.First: return visitor.first();
            case Structuremap_sourceListmode.Last: return visitor.last();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Structuremap_sourceListmode {
    export type First = "first" & {
        __First: void,
    };
    export type Last = "last" & {
        __Last: void,
    };

    export interface _Visitor<Result> {
        first: () => Result;
        last: () => Result;
        _unknown: () => Result;
    }
}
