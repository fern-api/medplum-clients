export type Timing_repeatPeriodunit =
    | Timing_repeatPeriodunit.S
    | Timing_repeatPeriodunit.Min
    | Timing_repeatPeriodunit.H
    | Timing_repeatPeriodunit.D
    | Timing_repeatPeriodunit.Wk
    | Timing_repeatPeriodunit.Mo
    | Timing_repeatPeriodunit.A;

export const Timing_repeatPeriodunit = {
    S: "s" as Timing_repeatPeriodunit.S,
    Min: "min" as Timing_repeatPeriodunit.Min,
    H: "h" as Timing_repeatPeriodunit.H,
    D: "d" as Timing_repeatPeriodunit.D,
    Wk: "wk" as Timing_repeatPeriodunit.Wk,
    Mo: "mo" as Timing_repeatPeriodunit.Mo,
    A: "a" as Timing_repeatPeriodunit.A,

    _visit: <Result>(value: Timing_repeatPeriodunit, visitor: Timing_repeatPeriodunit._Visitor<Result>): Result => {
        switch (value) {
            case Timing_repeatPeriodunit.S: return visitor.s();
            case Timing_repeatPeriodunit.Min: return visitor.min();
            case Timing_repeatPeriodunit.H: return visitor.h();
            case Timing_repeatPeriodunit.D: return visitor.d();
            case Timing_repeatPeriodunit.Wk: return visitor.wk();
            case Timing_repeatPeriodunit.Mo: return visitor.mo();
            case Timing_repeatPeriodunit.A: return visitor.a();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Timing_repeatPeriodunit {
    export type S = "s" & {
        __S: void,
    };
    export type Min = "min" & {
        __Min: void,
    };
    export type H = "h" & {
        __H: void,
    };
    export type D = "d" & {
        __D: void,
    };
    export type Wk = "wk" & {
        __Wk: void,
    };
    export type Mo = "mo" & {
        __Mo: void,
    };
    export type A = "a" & {
        __A: void,
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
