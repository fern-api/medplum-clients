export declare type ResearchelementdefinitionStatus = ResearchelementdefinitionStatus.Draft | ResearchelementdefinitionStatus.Active | ResearchelementdefinitionStatus.Retired;
export declare const ResearchelementdefinitionStatus: {
    Draft: ResearchelementdefinitionStatus.Draft;
    Active: ResearchelementdefinitionStatus.Active;
    Retired: ResearchelementdefinitionStatus.Retired;
    _visit: <Result>(value: ResearchelementdefinitionStatus, visitor: ResearchelementdefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace ResearchelementdefinitionStatus {
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
