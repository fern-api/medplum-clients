export type Structuremap_targetListmodeItem =
    | Structuremap_targetListmodeItem.First
    | Structuremap_targetListmodeItem.Share
    | Structuremap_targetListmodeItem.Last
    | Structuremap_targetListmodeItem.Collate;

export const Structuremap_targetListmodeItem = {
    First: "first" as Structuremap_targetListmodeItem.First,
    Share: "share" as Structuremap_targetListmodeItem.Share,
    Last: "last" as Structuremap_targetListmodeItem.Last,
    Collate: "collate" as Structuremap_targetListmodeItem.Collate,

    _visit: <Result>(
        value: Structuremap_targetListmodeItem,
        visitor: Structuremap_targetListmodeItem._Visitor<Result>
    ): Result => {
        switch (value) {
            case Structuremap_targetListmodeItem.First:
                return visitor.first();
            case Structuremap_targetListmodeItem.Share:
                return visitor.share();
            case Structuremap_targetListmodeItem.Last:
                return visitor.last();
            case Structuremap_targetListmodeItem.Collate:
                return visitor.collate();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Structuremap_targetListmodeItem {
    export type First = "first" & {
        __First: void;
    };
    export type Share = "share" & {
        __Share: void;
    };
    export type Last = "last" & {
        __Last: void;
    };
    export type Collate = "collate" & {
        __Collate: void;
    };

    export interface _Visitor<Result> {
        first: () => Result;
        share: () => Result;
        last: () => Result;
        collate: () => Result;
        _unknown: () => Result;
    }
}
