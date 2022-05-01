export type Structuremap_groupTypemode =
    | Structuremap_groupTypemode.None
    | Structuremap_groupTypemode.Types;

export const Structuremap_groupTypemode = {
    None: "none" as Structuremap_groupTypemode.None,
    Types: "types" as Structuremap_groupTypemode.Types,

    _visit: <Result>(
        value: Structuremap_groupTypemode,
        visitor: Structuremap_groupTypemode._Visitor<Result>
    ): Result => {
        switch (value) {
            case Structuremap_groupTypemode.None:
                return visitor.none();
            case Structuremap_groupTypemode.Types:
                return visitor.types();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Structuremap_groupTypemode {
    export type None = "none" & {
        __None: void;
    };
    export type Types = "types" & {
        __Types: void;
    };

    export interface _Visitor<Result> {
        none: () => Result;
        types: () => Result;
        _unknown: () => Result;
    }
}
