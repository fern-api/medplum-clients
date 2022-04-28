export type Graphdefinition_compartmentUse =
    | Graphdefinition_compartmentUse.Condition
    | Graphdefinition_compartmentUse.Requirement;

export const Graphdefinition_compartmentUse = {
    Condition: "condition" as Graphdefinition_compartmentUse.Condition,
    Requirement: "requirement" as Graphdefinition_compartmentUse.Requirement,

    _visit: <Result>(value: Graphdefinition_compartmentUse, visitor: Graphdefinition_compartmentUse._Visitor<Result>): Result => {
        switch (value) {
            case Graphdefinition_compartmentUse.Condition: return visitor.condition();
            case Graphdefinition_compartmentUse.Requirement: return visitor.requirement();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Graphdefinition_compartmentUse {
    export type Condition = "condition" & {
        __Condition: void,
    };
    export type Requirement = "requirement" & {
        __Requirement: void,
    };

    export interface _Visitor<Result> {
        condition: () => Result;
        requirement: () => Result;
        _unknown: () => Result;
    }
}
