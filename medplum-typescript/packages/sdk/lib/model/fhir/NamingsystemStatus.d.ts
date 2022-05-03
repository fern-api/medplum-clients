export declare type NamingsystemStatus = NamingsystemStatus.Draft | NamingsystemStatus.Active | NamingsystemStatus.Retired;
export declare const NamingsystemStatus: {
    Draft: NamingsystemStatus.Draft;
    Active: NamingsystemStatus.Active;
    Retired: NamingsystemStatus.Retired;
    _visit: <Result>(value: NamingsystemStatus, visitor: NamingsystemStatus._Visitor<Result>) => Result;
};
export declare namespace NamingsystemStatus {
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
