export type Elementdefinition_typeAggregationItem =
    | Elementdefinition_typeAggregationItem.Contained
    | Elementdefinition_typeAggregationItem.Referenced
    | Elementdefinition_typeAggregationItem.Bundled;

export const Elementdefinition_typeAggregationItem = {
    Contained: "contained" as Elementdefinition_typeAggregationItem.Contained,
    Referenced:
        "referenced" as Elementdefinition_typeAggregationItem.Referenced,
    Bundled: "bundled" as Elementdefinition_typeAggregationItem.Bundled,

    _visit: <Result>(
        value: Elementdefinition_typeAggregationItem,
        visitor: Elementdefinition_typeAggregationItem._Visitor<Result>
    ): Result => {
        switch (value) {
            case Elementdefinition_typeAggregationItem.Contained:
                return visitor.contained();
            case Elementdefinition_typeAggregationItem.Referenced:
                return visitor.referenced();
            case Elementdefinition_typeAggregationItem.Bundled:
                return visitor.bundled();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Elementdefinition_typeAggregationItem {
    export type Contained = "contained" & {
        __Contained: void;
    };
    export type Referenced = "referenced" & {
        __Referenced: void;
    };
    export type Bundled = "bundled" & {
        __Bundled: void;
    };

    export interface _Visitor<Result> {
        contained: () => Result;
        referenced: () => Result;
        bundled: () => Result;
        _unknown: () => Result;
    }
}
