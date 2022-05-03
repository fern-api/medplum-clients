export declare type DiagnosticreportStatus = DiagnosticreportStatus.Registered | DiagnosticreportStatus.Partial | DiagnosticreportStatus.Preliminary | DiagnosticreportStatus.Final | DiagnosticreportStatus.Amended | DiagnosticreportStatus.Corrected | DiagnosticreportStatus.Appended | DiagnosticreportStatus.Cancelled;
export declare const DiagnosticreportStatus: {
    Registered: DiagnosticreportStatus.Registered;
    Partial: DiagnosticreportStatus.Partial;
    Preliminary: DiagnosticreportStatus.Preliminary;
    Final: DiagnosticreportStatus.Final;
    Amended: DiagnosticreportStatus.Amended;
    Corrected: DiagnosticreportStatus.Corrected;
    Appended: DiagnosticreportStatus.Appended;
    Cancelled: DiagnosticreportStatus.Cancelled;
    _visit: <Result>(value: DiagnosticreportStatus, visitor: DiagnosticreportStatus._Visitor<Result>) => Result;
};
export declare namespace DiagnosticreportStatus {
    type Registered = "registered" & {
        __Registered: void;
    };
    type Partial = "partial" & {
        __Partial: void;
    };
    type Preliminary = "preliminary" & {
        __Preliminary: void;
    };
    type Final = "final" & {
        __Final: void;
    };
    type Amended = "amended" & {
        __Amended: void;
    };
    type Corrected = "corrected" & {
        __Corrected: void;
    };
    type Appended = "appended" & {
        __Appended: void;
    };
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    interface _Visitor<Result> {
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
