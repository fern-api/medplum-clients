export type ChargeitemStatus =
    | ChargeitemStatus.Planned
    | ChargeitemStatus.Billable
    | ChargeitemStatus.Aborted
    | ChargeitemStatus.Billed;

export const ChargeitemStatus = {
    Planned: "planned" as ChargeitemStatus.Planned,
    Billable: "billable" as ChargeitemStatus.Billable,
    Aborted: "aborted" as ChargeitemStatus.Aborted,
    Billed: "billed" as ChargeitemStatus.Billed,

    _visit: <Result>(value: ChargeitemStatus, visitor: ChargeitemStatus._Visitor<Result>): Result => {
        switch (value) {
            case ChargeitemStatus.Planned: return visitor.planned();
            case ChargeitemStatus.Billable: return visitor.billable();
            case ChargeitemStatus.Aborted: return visitor.aborted();
            case ChargeitemStatus.Billed: return visitor.billed();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ChargeitemStatus {
    export type Planned = "planned" & {
        __Planned: void,
    };
    export type Billable = "billable" & {
        __Billable: void,
    };
    export type Aborted = "aborted" & {
        __Aborted: void,
    };
    export type Billed = "billed" & {
        __Billed: void,
    };

    export interface _Visitor<Result> {
        planned: () => Result;
        billable: () => Result;
        aborted: () => Result;
        billed: () => Result;
        _unknown: () => Result;
    }
}
