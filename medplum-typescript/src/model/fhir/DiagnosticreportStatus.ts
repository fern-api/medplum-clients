export type DiagnosticreportStatus =
    | DiagnosticreportStatus.Registered
    | DiagnosticreportStatus.Partial
    | DiagnosticreportStatus.Preliminary
    | DiagnosticreportStatus.Final
    | DiagnosticreportStatus.Amended
    | DiagnosticreportStatus.Corrected
    | DiagnosticreportStatus.Appended
    | DiagnosticreportStatus.Cancelled;

export const DiagnosticreportStatus = {
    Registered: "registered" as DiagnosticreportStatus.Registered,
    Partial: "partial" as DiagnosticreportStatus.Partial,
    Preliminary: "preliminary" as DiagnosticreportStatus.Preliminary,
    Final: "final" as DiagnosticreportStatus.Final,
    Amended: "amended" as DiagnosticreportStatus.Amended,
    Corrected: "corrected" as DiagnosticreportStatus.Corrected,
    Appended: "appended" as DiagnosticreportStatus.Appended,
    Cancelled: "cancelled" as DiagnosticreportStatus.Cancelled,

    _visit: <Result>(
        value: DiagnosticreportStatus,
        visitor: DiagnosticreportStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case DiagnosticreportStatus.Registered:
                return visitor.registered();
            case DiagnosticreportStatus.Partial:
                return visitor.partial();
            case DiagnosticreportStatus.Preliminary:
                return visitor.preliminary();
            case DiagnosticreportStatus.Final:
                return visitor.final();
            case DiagnosticreportStatus.Amended:
                return visitor.amended();
            case DiagnosticreportStatus.Corrected:
                return visitor.corrected();
            case DiagnosticreportStatus.Appended:
                return visitor.appended();
            case DiagnosticreportStatus.Cancelled:
                return visitor.cancelled();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace DiagnosticreportStatus {
    export type Registered = "registered" & {
        __Registered: void;
    };
    export type Partial = "partial" & {
        __Partial: void;
    };
    export type Preliminary = "preliminary" & {
        __Preliminary: void;
    };
    export type Final = "final" & {
        __Final: void;
    };
    export type Amended = "amended" & {
        __Amended: void;
    };
    export type Corrected = "corrected" & {
        __Corrected: void;
    };
    export type Appended = "appended" & {
        __Appended: void;
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void;
    };

    export interface _Visitor<Result> {
        registered: () => Result;
        partial: () => Result;
        preliminary: () => Result;
        final: () => Result;
        amended: () => Result;
        corrected: () => Result;
        appended: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
