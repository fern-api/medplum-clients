export declare type AccountStatus = AccountStatus.Active | AccountStatus.Inactive;
export declare const AccountStatus: {
    Active: AccountStatus.Active;
    Inactive: AccountStatus.Inactive;
    _visit: <Result>(value: AccountStatus, visitor: AccountStatus._Visitor<Result>) => Result;
};
export declare namespace AccountStatus {
    type Active = "active" & {
        __Active: void;
    };
    type Inactive = "inactive" & {
        __Inactive: void;
    };
    interface _Visitor<Result> {
        active: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
