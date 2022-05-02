export type NarrativeStatus =
    | NarrativeStatus.Generated
    | NarrativeStatus.Extensions
    | NarrativeStatus.Additional
    | NarrativeStatus.Empty;

export const NarrativeStatus = {
    Generated: "generated" as NarrativeStatus.Generated,
    Extensions: "extensions" as NarrativeStatus.Extensions,
    Additional: "additional" as NarrativeStatus.Additional,
    Empty: "empty" as NarrativeStatus.Empty,

    _visit: <Result>(
        value: NarrativeStatus,
        visitor: NarrativeStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case NarrativeStatus.Generated:
                return visitor.generated();
            case NarrativeStatus.Extensions:
                return visitor.extensions();
            case NarrativeStatus.Additional:
                return visitor.additional();
            case NarrativeStatus.Empty:
                return visitor.empty();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace NarrativeStatus {
    export type Generated = "generated" & {
        __Generated: void;
    };
    export type Extensions = "extensions" & {
        __Extensions: void;
    };
    export type Additional = "additional" & {
        __Additional: void;
    };
    export type Empty = "empty" & {
        __Empty: void;
    };

    export interface _Visitor<Result> {
        generated: () => Result;
        extensions: () => Result;
        additional: () => Result;
        empty: () => Result;
        _unknown: () => Result;
    }
}
