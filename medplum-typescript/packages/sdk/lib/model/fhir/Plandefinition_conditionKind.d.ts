export declare type Plandefinition_conditionKind = Plandefinition_conditionKind.Applicability | Plandefinition_conditionKind.Start | Plandefinition_conditionKind.Stop;
export declare const Plandefinition_conditionKind: {
    Applicability: Plandefinition_conditionKind.Applicability;
    Start: Plandefinition_conditionKind.Start;
    Stop: Plandefinition_conditionKind.Stop;
    _visit: <Result>(value: Plandefinition_conditionKind, visitor: Plandefinition_conditionKind._Visitor<Result>) => Result;
};
export declare namespace Plandefinition_conditionKind {
    type Applicability = "applicability" & {
        __Applicability: void;
    };
    type Start = "start" & {
        __Start: void;
    };
    type Stop = "stop" & {
        __Stop: void;
    };
    interface _Visitor<Result> {
        applicability: () => Result;
        start: () => Result;
        stop: () => Result;
        _unknown: () => Result;
    }
}
