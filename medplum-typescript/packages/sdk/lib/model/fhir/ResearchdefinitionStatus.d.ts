export declare type ResearchdefinitionStatus = ResearchdefinitionStatus.Draft | ResearchdefinitionStatus.Active | ResearchdefinitionStatus.Retired;
export declare const ResearchdefinitionStatus: {
    Draft: ResearchdefinitionStatus.Draft;
    Active: ResearchdefinitionStatus.Active;
    Retired: ResearchdefinitionStatus.Retired;
    _visit: <Result>(value: ResearchdefinitionStatus, visitor: ResearchdefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace ResearchdefinitionStatus {
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
