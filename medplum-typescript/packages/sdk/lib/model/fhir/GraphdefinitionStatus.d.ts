export declare type GraphdefinitionStatus = GraphdefinitionStatus.Draft | GraphdefinitionStatus.Active | GraphdefinitionStatus.Retired;
export declare const GraphdefinitionStatus: {
    Draft: GraphdefinitionStatus.Draft;
    Active: GraphdefinitionStatus.Active;
    Retired: GraphdefinitionStatus.Retired;
    _visit: <Result>(value: GraphdefinitionStatus, visitor: GraphdefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace GraphdefinitionStatus {
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
