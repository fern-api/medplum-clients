export type SupplydeliveryStatus =
    | SupplydeliveryStatus.Completed
    | SupplydeliveryStatus.Abandoned;

export const SupplydeliveryStatus = {
    Completed: "completed" as SupplydeliveryStatus.Completed,
    Abandoned: "abandoned" as SupplydeliveryStatus.Abandoned,

    _visit: <Result>(value: SupplydeliveryStatus, visitor: SupplydeliveryStatus._Visitor<Result>): Result => {
        switch (value) {
            case SupplydeliveryStatus.Completed: return visitor.completed();
            case SupplydeliveryStatus.Abandoned: return visitor.abandoned();
            default: return visitor._unknown();
        }
    },
};

export declare namespace SupplydeliveryStatus {
    export type Completed = "completed" & {
        __Completed: void,
    };
    export type Abandoned = "abandoned" & {
        __Abandoned: void,
    };

    export interface _Visitor<Result> {
        completed: () => Result;
        abandoned: () => Result;
        _unknown: () => Result;
    }
}
