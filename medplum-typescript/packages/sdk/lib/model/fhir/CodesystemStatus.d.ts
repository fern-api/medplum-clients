export declare type CodesystemStatus = CodesystemStatus.Draft | CodesystemStatus.Active | CodesystemStatus.Retired;
export declare const CodesystemStatus: {
    Draft: CodesystemStatus.Draft;
    Active: CodesystemStatus.Active;
    Retired: CodesystemStatus.Retired;
    _visit: <Result>(value: CodesystemStatus, visitor: CodesystemStatus._Visitor<Result>) => Result;
};
export declare namespace CodesystemStatus {
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
