export declare type DocumentreferenceStatus = DocumentreferenceStatus.Current | DocumentreferenceStatus.Superseded;
export declare const DocumentreferenceStatus: {
    Current: DocumentreferenceStatus.Current;
    Superseded: DocumentreferenceStatus.Superseded;
    _visit: <Result>(value: DocumentreferenceStatus, visitor: DocumentreferenceStatus._Visitor<Result>) => Result;
};
export declare namespace DocumentreferenceStatus {
    type Current = "current" & {
        __Current: void;
    };
    type Superseded = "superseded" & {
        __Superseded: void;
    };
    interface _Visitor<Result> {
        current: () => Result;
        superseded: () => Result;
        _unknown: () => Result;
    }
}
