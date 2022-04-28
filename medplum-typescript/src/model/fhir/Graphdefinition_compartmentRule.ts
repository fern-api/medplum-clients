export type Graphdefinition_compartmentRule =
    | Graphdefinition_compartmentRule.Identical
    | Graphdefinition_compartmentRule.Matching
    | Graphdefinition_compartmentRule.Different
    | Graphdefinition_compartmentRule.Custom;

export const Graphdefinition_compartmentRule = {
    Identical: "identical" as Graphdefinition_compartmentRule.Identical,
    Matching: "matching" as Graphdefinition_compartmentRule.Matching,
    Different: "different" as Graphdefinition_compartmentRule.Different,
    Custom: "custom" as Graphdefinition_compartmentRule.Custom,

    _visit: <Result>(value: Graphdefinition_compartmentRule, visitor: Graphdefinition_compartmentRule._Visitor<Result>): Result => {
        switch (value) {
            case Graphdefinition_compartmentRule.Identical: return visitor.identical();
            case Graphdefinition_compartmentRule.Matching: return visitor.matching();
            case Graphdefinition_compartmentRule.Different: return visitor.different();
            case Graphdefinition_compartmentRule.Custom: return visitor.custom();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Graphdefinition_compartmentRule {
    export type Identical = "identical" & {
        __Identical: void,
    };
    export type Matching = "matching" & {
        __Matching: void,
    };
    export type Different = "different" & {
        __Different: void,
    };
    export type Custom = "custom" & {
        __Custom: void,
    };

    export interface _Visitor<Result> {
        identical: () => Result;
        matching: () => Result;
        different: () => Result;
        custom: () => Result;
        _unknown: () => Result;
    }
}
