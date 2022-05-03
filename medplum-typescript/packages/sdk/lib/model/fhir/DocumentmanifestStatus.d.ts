export declare type DocumentmanifestStatus = DocumentmanifestStatus.Current | DocumentmanifestStatus.Superseded;
export declare const DocumentmanifestStatus: {
    Current: DocumentmanifestStatus.Current;
    Superseded: DocumentmanifestStatus.Superseded;
    _visit: <Result>(value: DocumentmanifestStatus, visitor: DocumentmanifestStatus._Visitor<Result>) => Result;
};
export declare namespace DocumentmanifestStatus {
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
