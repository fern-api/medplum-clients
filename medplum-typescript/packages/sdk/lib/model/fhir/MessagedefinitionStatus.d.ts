export declare type MessagedefinitionStatus = MessagedefinitionStatus.Draft | MessagedefinitionStatus.Active | MessagedefinitionStatus.Retired;
export declare const MessagedefinitionStatus: {
    Draft: MessagedefinitionStatus.Draft;
    Active: MessagedefinitionStatus.Active;
    Retired: MessagedefinitionStatus.Retired;
    _visit: <Result>(value: MessagedefinitionStatus, visitor: MessagedefinitionStatus._Visitor<Result>) => Result;
};
export declare namespace MessagedefinitionStatus {
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
