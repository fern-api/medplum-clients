export declare type ObservationStatus = ObservationStatus.Registered | ObservationStatus.Preliminary | ObservationStatus.Final | ObservationStatus.Amended | ObservationStatus.Corrected | ObservationStatus.Cancelled;
export declare const ObservationStatus: {
    Registered: ObservationStatus.Registered;
    Preliminary: ObservationStatus.Preliminary;
    Final: ObservationStatus.Final;
    Amended: ObservationStatus.Amended;
    Corrected: ObservationStatus.Corrected;
    Cancelled: ObservationStatus.Cancelled;
    _visit: <Result>(value: ObservationStatus, visitor: ObservationStatus._Visitor<Result>) => Result;
};
export declare namespace ObservationStatus {
    type Registered = "registered" & {
        __Registered: void;
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
    type Cancelled = "cancelled" & {
        __Cancelled: void;
    };
    interface _Visitor<Result> {
        registered: () => Result;
        preliminary: () => Result;
        final: () => Result;
        amended: () => Result;
        corrected: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
