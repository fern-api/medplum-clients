export type DocumentmanifestStatus =
    | DocumentmanifestStatus.Current
    | DocumentmanifestStatus.Superseded;

export const DocumentmanifestStatus = {
    Current: "current" as DocumentmanifestStatus.Current,
    Superseded: "superseded" as DocumentmanifestStatus.Superseded,

    _visit: <Result>(value: DocumentmanifestStatus, visitor: DocumentmanifestStatus._Visitor<Result>): Result => {
        switch (value) {
            case DocumentmanifestStatus.Current: return visitor.current();
            case DocumentmanifestStatus.Superseded: return visitor.superseded();
            default: return visitor._unknown();
        }
    },
};

export declare namespace DocumentmanifestStatus {
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
