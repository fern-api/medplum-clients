export declare type Structuremap_groupTypemode = Structuremap_groupTypemode.None | Structuremap_groupTypemode.Types;
export declare const Structuremap_groupTypemode: {
    None: Structuremap_groupTypemode.None;
    Types: Structuremap_groupTypemode.Types;
    _visit: <Result>(value: Structuremap_groupTypemode, visitor: Structuremap_groupTypemode._Visitor<Result>) => Result;
};
export declare namespace Structuremap_groupTypemode {
    type None = "none" & {
        __None: void;
    };
    type Types = "types" & {
        __Types: void;
    };
    interface _Visitor<Result> {
        none: () => Result;
        types: () => Result;
        _unknown: () => Result;
    }
}
