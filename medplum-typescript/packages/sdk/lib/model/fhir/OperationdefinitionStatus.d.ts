export declare type OperationdefinitionStatus = OperationdefinitionStatus.Draft | OperationdefinitionStatus.Active | OperationdefinitionStatus.Retired;
export declare const OperationdefinitionStatus: {
    Draft: OperationdefinitionStatus.Draft;
    Active: OperationdefinitionStatus.Active;
    Retired: OperationdefinitionStatus.Retired;
    _visit: <Result>(value: OperationdefinitionStatus, visitor: OperationdefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace OperationdefinitionStatus {
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
