export declare type Graphdefinition_compartmentRule = Graphdefinition_compartmentRule.Identical | Graphdefinition_compartmentRule.Matching | Graphdefinition_compartmentRule.Different | Graphdefinition_compartmentRule.Custom;
export declare const Graphdefinition_compartmentRule: {
    Identical: Graphdefinition_compartmentRule.Identical;
    Matching: Graphdefinition_compartmentRule.Matching;
    Different: Graphdefinition_compartmentRule.Different;
    Custom: Graphdefinition_compartmentRule.Custom;
    _visit: <Result>(value: Graphdefinition_compartmentRule, visitor: Graphdefinition_compartmentRule._Visitor<Result>) => Result;
};
export declare namespace Graphdefinition_compartmentRule {
    type Identical = "identical" & {
        __Identical: void;
    };
    type Matching = "matching" & {
        __Matching: void;
    };
    type Different = "different" & {
        __Different: void;
    };
    type Custom = "custom" & {
        __Custom: void;
    };
    interface _Visitor<Result> {
        identical: () => Result;
        matching: () => Result;
        different: () => Result;
        custom: () => Result;
        _unknown: () => Result;
    }
}
