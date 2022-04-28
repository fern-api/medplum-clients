export type FlagStatus =
    | FlagStatus.Active
    | FlagStatus.Inactive;

export const FlagStatus = {
    Active: "active" as FlagStatus.Active,
    Inactive: "inactive" as FlagStatus.Inactive,

    _visit: <Result>(value: FlagStatus, visitor: FlagStatus._Visitor<Result>): Result => {
        switch (value) {
            case FlagStatus.Active: return visitor.active();
            case FlagStatus.Inactive: return visitor.inactive();
            default: return visitor._unknown();
        }
    },
};

export declare namespace FlagStatus {
    export type Active = "active" & {
        __Active: void,
    };
    export type Inactive = "inactive" & {
        __Inactive: void,
    };

    export interface _Visitor<Result> {
        active: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
