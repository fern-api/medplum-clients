export type TaskIntent =
    | TaskIntent.Proposal
    | TaskIntent.Plan
    | TaskIntent.Order
    | TaskIntent.Option;

export const TaskIntent = {
    Proposal: "proposal" as TaskIntent.Proposal,
    Plan: "plan" as TaskIntent.Plan,
    Order: "order" as TaskIntent.Order,
    Option: "option" as TaskIntent.Option,

    _visit: <Result>(
        value: TaskIntent,
        visitor: TaskIntent._Visitor<Result>
    ): Result => {
        switch (value) {
            case TaskIntent.Proposal:
                return visitor.proposal();
            case TaskIntent.Plan:
                return visitor.plan();
            case TaskIntent.Order:
                return visitor.order();
            case TaskIntent.Option:
                return visitor.option();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace TaskIntent {
    export type Proposal = "proposal" & {
        __Proposal: void;
    };
    export type Plan = "plan" & {
        __Plan: void;
    };
    export type Order = "order" & {
        __Order: void;
    };
    export type Option = "option" & {
        __Option: void;
    };

    export interface _Visitor<Result> {
        proposal: () => Result;
        plan: () => Result;
        order: () => Result;
        option: () => Result;
        _unknown: () => Result;
    }
}
