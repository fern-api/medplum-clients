export type Timing_repeatDurationunit =
    | Timing_repeatDurationunit.S
    | Timing_repeatDurationunit.Min
    | Timing_repeatDurationunit.H
    | Timing_repeatDurationunit.D
    | Timing_repeatDurationunit.Wk
    | Timing_repeatDurationunit.Mo
    | Timing_repeatDurationunit.A;

export const Timing_repeatDurationunit = {
    S: "s" as Timing_repeatDurationunit.S,
    Min: "min" as Timing_repeatDurationunit.Min,
    H: "h" as Timing_repeatDurationunit.H,
    D: "d" as Timing_repeatDurationunit.D,
    Wk: "wk" as Timing_repeatDurationunit.Wk,
    Mo: "mo" as Timing_repeatDurationunit.Mo,
    A: "a" as Timing_repeatDurationunit.A,

    _visit: <Result>(
        value: Timing_repeatDurationunit,
        visitor: Timing_repeatDurationunit._Visitor<Result>
    ): Result => {
        switch (value) {
            case Timing_repeatDurationunit.S:
                return visitor.s();
            case Timing_repeatDurationunit.Min:
                return visitor.min();
            case Timing_repeatDurationunit.H:
                return visitor.h();
            case Timing_repeatDurationunit.D:
                return visitor.d();
            case Timing_repeatDurationunit.Wk:
                return visitor.wk();
            case Timing_repeatDurationunit.Mo:
                return visitor.mo();
            case Timing_repeatDurationunit.A:
                return visitor.a();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Timing_repeatDurationunit {
    export type S = "s" & {
        __S: void;
    };
    export type Min = "min" & {
        __Min: void;
    };
    export type H = "h" & {
        __H: void;
    };
    export type D = "d" & {
        __D: void;
    };
    export type Wk = "wk" & {
        __Wk: void;
    };
    export type Mo = "mo" & {
        __Mo: void;
    };
    export type A = "a" & {
        __A: void;
    };

    export interface _Visitor<Result> {
        s: () => Result;
        min: () => Result;
        h: () => Result;
        d: () => Result;
        wk: () => Result;
        mo: () => Result;
        a: () => Result;
        _unknown: () => Result;
    }
}
