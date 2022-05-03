export declare type Linkage_itemType = Linkage_itemType.Source | Linkage_itemType.Alternate | Linkage_itemType.Historical;
export declare const Linkage_itemType: {
    Source: Linkage_itemType.Source;
    Alternate: Linkage_itemType.Alternate;
    Historical: Linkage_itemType.Historical;
    _visit: <Result>(value: Linkage_itemType, visitor: Linkage_itemType._Visitor<Result>) => Result;
};
export declare namespace Linkage_itemType {
    type Source = "source" & {
        __Source: void;
    };
    type Alternate = "alternate" & {
        __Alternate: void;
    };
    type Historical = "historical" & {
        __Historical: void;
    };
    interface _Visitor<Result> {
        source: () => Result;
        alternate: () => Result;
        historical: () => Result;
        _unknown: () => Result;
    }
}
