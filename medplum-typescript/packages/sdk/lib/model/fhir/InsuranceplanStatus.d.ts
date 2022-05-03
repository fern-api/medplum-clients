export declare type InsuranceplanStatus = InsuranceplanStatus.Draft | InsuranceplanStatus.Active | InsuranceplanStatus.Retired;
export declare const InsuranceplanStatus: {
    Draft: InsuranceplanStatus.Draft;
    Active: InsuranceplanStatus.Active;
    Retired: InsuranceplanStatus.Retired;
    _visit: <Result>(value: InsuranceplanStatus, visitor: InsuranceplanStatus._Visitor<Result>) => Result;
};
export declare namespace InsuranceplanStatus {
    type Draft = "draft" & {
        __Draft: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Retired = "retired" & {
        __Retired: void;
    };
    interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
