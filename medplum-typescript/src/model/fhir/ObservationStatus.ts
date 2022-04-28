export type ObservationStatus =
    | ObservationStatus.Registered
    | ObservationStatus.Preliminary
    | ObservationStatus.Final
    | ObservationStatus.Amended
    | ObservationStatus.Corrected
    | ObservationStatus.Cancelled;

export const ObservationStatus = {
    Registered: "registered" as ObservationStatus.Registered,
    Preliminary: "preliminary" as ObservationStatus.Preliminary,
    Final: "final" as ObservationStatus.Final,
    Amended: "amended" as ObservationStatus.Amended,
    Corrected: "corrected" as ObservationStatus.Corrected,
    Cancelled: "cancelled" as ObservationStatus.Cancelled,

    _visit: <Result>(value: ObservationStatus, visitor: ObservationStatus._Visitor<Result>): Result => {
        switch (value) {
            case ObservationStatus.Registered: return visitor.registered();
            case ObservationStatus.Preliminary: return visitor.preliminary();
            case ObservationStatus.Final: return visitor.final();
            case ObservationStatus.Amended: return visitor.amended();
            case ObservationStatus.Corrected: return visitor.corrected();
            case ObservationStatus.Cancelled: return visitor.cancelled();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ObservationStatus {
    export type Registered = "registered" & {
        __Registered: void,
    };
    export type Preliminary = "preliminary" & {
        __Preliminary: void,
    };
    export type Final = "final" & {
        __Final: void,
    };
    export type Amended = "amended" & {
        __Amended: void,
    };
    export type Corrected = "corrected" & {
        __Corrected: void,
    };
    export type Cancelled = "cancelled" & {
        __Cancelled: void,
    };

    export interface _Visitor<Result> {
        registered: () => Result;
        preliminary: () => Result;
        final: () => Result;
        amended: () => Result;
        corrected: () => Result;
        cancelled: () => Result;
        _unknown: () => Result;
    }
}
