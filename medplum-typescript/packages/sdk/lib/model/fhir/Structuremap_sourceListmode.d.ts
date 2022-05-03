export declare type Structuremap_sourceListmode = Structuremap_sourceListmode.First | Structuremap_sourceListmode.Last;
export declare const Structuremap_sourceListmode: {
    First: Structuremap_sourceListmode.First;
    Last: Structuremap_sourceListmode.Last;
    _visit: <Result>(value: Structuremap_sourceListmode, visitor: Structuremap_sourceListmode._Visitor<Result>) => Result;
};
export declare namespace Structuremap_sourceListmode {
    type First = "first" & {
        __First: void;
    };
    type Last = "last" & {
        __Last: void;
    };
    interface _Visitor<Result> {
        first: () => Result;
        last: () => Result;
        _unknown: () => Result;
    }
}
