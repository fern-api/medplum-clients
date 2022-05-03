export declare type CompartmentdefinitionStatus = CompartmentdefinitionStatus.Draft | CompartmentdefinitionStatus.Active | CompartmentdefinitionStatus.Retired;
export declare const CompartmentdefinitionStatus: {
    Draft: CompartmentdefinitionStatus.Draft;
    Active: CompartmentdefinitionStatus.Active;
    Retired: CompartmentdefinitionStatus.Retired;
    _visit: <Result>(value: CompartmentdefinitionStatus, visitor: CompartmentdefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace CompartmentdefinitionStatus {
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
