export type Plandefinition_conditionKind =
    | Plandefinition_conditionKind.Applicability
    | Plandefinition_conditionKind.Start
    | Plandefinition_conditionKind.Stop;

export const Plandefinition_conditionKind = {
    Applicability: "applicability" as Plandefinition_conditionKind.Applicability,
    Start: "start" as Plandefinition_conditionKind.Start,
    Stop: "stop" as Plandefinition_conditionKind.Stop,

    _visit: <Result>(value: Plandefinition_conditionKind, visitor: Plandefinition_conditionKind._Visitor<Result>): Result => {
        switch (value) {
            case Plandefinition_conditionKind.Applicability: return visitor.applicability();
            case Plandefinition_conditionKind.Start: return visitor.start();
            case Plandefinition_conditionKind.Stop: return visitor.stop();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Plandefinition_conditionKind {
    export type Applicability = "applicability" & {
        __Applicability: void,
    };
    export type Start = "start" & {
        __Start: void,
    };
    export type Stop = "stop" & {
        __Stop: void,
    };

    export interface _Visitor<Result> {
        applicability: () => Result;
        start: () => Result;
        stop: () => Result;
        _unknown: () => Result;
    }
}
