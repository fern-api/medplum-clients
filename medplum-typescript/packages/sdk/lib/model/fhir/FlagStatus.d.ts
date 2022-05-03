export declare type FlagStatus = FlagStatus.Active | FlagStatus.Inactive;
export declare const FlagStatus: {
    Active: FlagStatus.Active;
    Inactive: FlagStatus.Inactive;
    _visit: <Result>(value: FlagStatus, visitor: FlagStatus._Visitor<Result>) => Result;
};
export declare namespace FlagStatus {
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
