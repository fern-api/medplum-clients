export declare type NarrativeStatus = NarrativeStatus.Generated | NarrativeStatus.Extensions | NarrativeStatus.Additional | NarrativeStatus.Empty;
export declare const NarrativeStatus: {
    Generated: NarrativeStatus.Generated;
    Extensions: NarrativeStatus.Extensions;
    Additional: NarrativeStatus.Additional;
    Empty: NarrativeStatus.Empty;
    _visit: <Result>(value: NarrativeStatus, visitor: NarrativeStatus._Visitor<Result>) => Result;
};
export declare namespace NarrativeStatus {
    type Generated = "generated" & {
        __Generated: void;
    };
    type Extensions = "extensions" & {
        __Extensions: void;
    };
    type Additional = "additional" & {
        __Additional: void;
    };
    type Empty = "empty" & {
        __Empty: void;
    };
    interface _Visitor<Result> {
        generated: () => Result;
        extensions: () => Result;
        additional: () => Result;
        empty: () => Result;
        _unknown: () => Result;
    }
}
