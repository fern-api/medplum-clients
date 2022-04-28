export type Linkage_itemType =
    | Linkage_itemType.Source
    | Linkage_itemType.Alternate
    | Linkage_itemType.Historical;

export const Linkage_itemType = {
    Source: "source" as Linkage_itemType.Source,
    Alternate: "alternate" as Linkage_itemType.Alternate,
    Historical: "historical" as Linkage_itemType.Historical,

    _visit: <Result>(value: Linkage_itemType, visitor: Linkage_itemType._Visitor<Result>): Result => {
        switch (value) {
            case Linkage_itemType.Source: return visitor.source();
            case Linkage_itemType.Alternate: return visitor.alternate();
            case Linkage_itemType.Historical: return visitor.historical();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Linkage_itemType {
    export type Source = "source" & {
        __Source: void,
    };
    export type Alternate = "alternate" & {
        __Alternate: void,
    };
    export type Historical = "historical" & {
        __Historical: void,
    };

    export interface _Visitor<Result> {
        source: () => Result;
        alternate: () => Result;
        historical: () => Result;
        _unknown: () => Result;
    }
}
