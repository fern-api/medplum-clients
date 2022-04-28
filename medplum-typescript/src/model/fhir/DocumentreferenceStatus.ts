export type DocumentreferenceStatus =
    | DocumentreferenceStatus.Current
    | DocumentreferenceStatus.Superseded;

export const DocumentreferenceStatus = {
    Current: "current" as DocumentreferenceStatus.Current,
    Superseded: "superseded" as DocumentreferenceStatus.Superseded,

    _visit: <Result>(value: DocumentreferenceStatus, visitor: DocumentreferenceStatus._Visitor<Result>): Result => {
        switch (value) {
            case DocumentreferenceStatus.Current: return visitor.current();
            case DocumentreferenceStatus.Superseded: return visitor.superseded();
            default: return visitor._unknown();
        }
    },
};

export declare namespace DocumentreferenceStatus {
    export type Current = "current" & {
        __Current: void,
    };
    export type Superseded = "superseded" & {
        __Superseded: void,
    };

    export interface _Visitor<Result> {
        current: () => Result;
        superseded: () => Result;
        _unknown: () => Result;
    }
}
