export declare type Elementdefinition_typeAggregationItem = Elementdefinition_typeAggregationItem.Contained | Elementdefinition_typeAggregationItem.Referenced | Elementdefinition_typeAggregationItem.Bundled;
export declare const Elementdefinition_typeAggregationItem: {
    Contained: Elementdefinition_typeAggregationItem.Contained;
    Referenced: Elementdefinition_typeAggregationItem.Referenced;
    Bundled: Elementdefinition_typeAggregationItem.Bundled;
    _visit: <Result>(value: Elementdefinition_typeAggregationItem, visitor: Elementdefinition_typeAggregationItem._Visitor<Result>) => Result;
};
export declare namespace Elementdefinition_typeAggregationItem {
    type Contained = "contained" & {
        __Contained: void;
    };
    type Referenced = "referenced" & {
        __Referenced: void;
    };
    type Bundled = "bundled" & {
        __Bundled: void;
    };
    interface _Visitor<Result> {
        contained: () => Result;
        referenced: () => Result;
        bundled: () => Result;
        _unknown: () => Result;
    }
}
