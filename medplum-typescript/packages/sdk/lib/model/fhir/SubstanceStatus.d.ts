export declare type SubstanceStatus = SubstanceStatus.Active | SubstanceStatus.Inactive;
export declare const SubstanceStatus: {
    Active: SubstanceStatus.Active;
    Inactive: SubstanceStatus.Inactive;
    _visit: <Result>(value: SubstanceStatus, visitor: SubstanceStatus._Visitor<Result>) => Result;
};
export declare namespace SubstanceStatus {
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
