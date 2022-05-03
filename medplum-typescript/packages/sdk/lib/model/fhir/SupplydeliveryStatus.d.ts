export declare type SupplydeliveryStatus = SupplydeliveryStatus.Completed | SupplydeliveryStatus.Abandoned;
export declare const SupplydeliveryStatus: {
    Completed: SupplydeliveryStatus.Completed;
    Abandoned: SupplydeliveryStatus.Abandoned;
    _visit: <Result>(value: SupplydeliveryStatus, visitor: SupplydeliveryStatus._Visitor<Result>) => Result;
};
export declare namespace SupplydeliveryStatus {
    type Completed = "completed" & {
        __Completed: void;
    };
    type Abandoned = "abandoned" & {
        __Abandoned: void;
    };
    interface _Visitor<Result> {
        completed: () => Result;
        abandoned: () => Result;
        _unknown: () => Result;
    }
}
