export declare type Graphdefinition_compartmentUse = Graphdefinition_compartmentUse.Condition | Graphdefinition_compartmentUse.Requirement;
export declare const Graphdefinition_compartmentUse: {
    Condition: Graphdefinition_compartmentUse.Condition;
    Requirement: Graphdefinition_compartmentUse.Requirement;
    _visit: <Result>(value: Graphdefinition_compartmentUse, visitor: Graphdefinition_compartmentUse._Visitor<Result>) => Result;
};
export declare namespace Graphdefinition_compartmentUse {
    type Condition = "condition" & {
        __Condition: void;
    };
    type Requirement = "requirement" & {
        __Requirement: void;
    };
    interface _Visitor<Result> {
        condition: () => Result;
        requirement: () => Result;
        _unknown: () => Result;
    }
}
