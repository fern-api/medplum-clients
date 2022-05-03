export declare type ChargeitemStatus = ChargeitemStatus.Planned | ChargeitemStatus.Billable | ChargeitemStatus.Aborted | ChargeitemStatus.Billed;
export declare const ChargeitemStatus: {
    Planned: ChargeitemStatus.Planned;
    Billable: ChargeitemStatus.Billable;
    Aborted: ChargeitemStatus.Aborted;
    Billed: ChargeitemStatus.Billed;
    _visit: <Result>(value: ChargeitemStatus, visitor: ChargeitemStatus._Visitor<Result>) => Result;
};
export declare namespace ChargeitemStatus {
    type Planned = "planned" & {
        __Planned: void;
    };
    type Billable = "billable" & {
        __Billable: void;
    };
    type Aborted = "aborted" & {
        __Aborted: void;
    };
    type Billed = "billed" & {
        __Billed: void;
    };
    interface _Visitor<Result> {
        planned: () => Result;
        billable: () => Result;
        aborted: () => Result;
        billed: () => Result;
        _unknown: () => Result;
    }
}
