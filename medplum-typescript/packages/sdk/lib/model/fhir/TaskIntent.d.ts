export declare type TaskIntent = TaskIntent.Proposal | TaskIntent.Plan | TaskIntent.Order | TaskIntent.Option;
export declare const TaskIntent: {
    Proposal: TaskIntent.Proposal;
    Plan: TaskIntent.Plan;
    Order: TaskIntent.Order;
    Option: TaskIntent.Option;
    _visit: <Result>(value: TaskIntent, visitor: TaskIntent._Visitor<Result>) => Result;
};
export declare namespace TaskIntent {
    type Proposal = "proposal" & {
        __Proposal: void;
    };
    type Plan = "plan" & {
        __Plan: void;
    };
    type Order = "order" & {
        __Order: void;
    };
    type Option = "option" & {
        __Option: void;
    };
    interface _Visitor<Result> {
        proposal: () => Result;
        plan: () => Result;
        order: () => Result;
        option: () => Result;
        _unknown: () => Result;
    }
}
