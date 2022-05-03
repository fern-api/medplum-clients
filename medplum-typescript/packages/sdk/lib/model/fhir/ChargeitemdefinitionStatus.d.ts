export declare type ChargeitemdefinitionStatus = ChargeitemdefinitionStatus.Draft | ChargeitemdefinitionStatus.Active | ChargeitemdefinitionStatus.Retired;
export declare const ChargeitemdefinitionStatus: {
    Draft: ChargeitemdefinitionStatus.Draft;
    Active: ChargeitemdefinitionStatus.Active;
    Retired: ChargeitemdefinitionStatus.Retired;
    _visit: <Result>(value: ChargeitemdefinitionStatus, visitor: ChargeitemdefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace ChargeitemdefinitionStatus {
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
