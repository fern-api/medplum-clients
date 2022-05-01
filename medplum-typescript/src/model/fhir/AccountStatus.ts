export type AccountStatus = AccountStatus.Active | AccountStatus.Inactive;

export const AccountStatus = {
    Active: "active" as AccountStatus.Active,
    Inactive: "inactive" as AccountStatus.Inactive,

    _visit: <Result>(
        value: AccountStatus,
        visitor: AccountStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case AccountStatus.Active:
                return visitor.active();
            case AccountStatus.Inactive:
                return visitor.inactive();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace AccountStatus {
    export type Active = "active" & {
        __Active: void;
    };
    export type Inactive = "inactive" & {
        __Inactive: void;
    };

    export interface _Visitor<Result> {
        active: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
