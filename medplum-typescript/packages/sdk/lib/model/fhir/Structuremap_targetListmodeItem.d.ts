export declare type Structuremap_targetListmodeItem = Structuremap_targetListmodeItem.First | Structuremap_targetListmodeItem.Share | Structuremap_targetListmodeItem.Last | Structuremap_targetListmodeItem.Collate;
export declare const Structuremap_targetListmodeItem: {
    First: Structuremap_targetListmodeItem.First;
    Share: Structuremap_targetListmodeItem.Share;
    Last: Structuremap_targetListmodeItem.Last;
    Collate: Structuremap_targetListmodeItem.Collate;
    _visit: <Result>(value: Structuremap_targetListmodeItem, visitor: Structuremap_targetListmodeItem._Visitor<Result>) => Result;
};
export declare namespace Structuremap_targetListmodeItem {
    type First = "first" & {
        __First: void;
    };
    type Share = "share" & {
        __Share: void;
    };
    type Last = "last" & {
        __Last: void;
    };
    type Collate = "collate" & {
        __Collate: void;
    };
    interface _Visitor<Result> {
        first: () => Result;
        share: () => Result;
        last: () => Result;
        collate: () => Result;
        _unknown: () => Result;
    }
}
