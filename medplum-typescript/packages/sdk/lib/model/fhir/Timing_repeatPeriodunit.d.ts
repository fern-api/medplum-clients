export declare type Timing_repeatPeriodunit = Timing_repeatPeriodunit.S | Timing_repeatPeriodunit.Min | Timing_repeatPeriodunit.H | Timing_repeatPeriodunit.D | Timing_repeatPeriodunit.Wk | Timing_repeatPeriodunit.Mo | Timing_repeatPeriodunit.A;
export declare const Timing_repeatPeriodunit: {
    S: Timing_repeatPeriodunit.S;
    Min: Timing_repeatPeriodunit.Min;
    H: Timing_repeatPeriodunit.H;
    D: Timing_repeatPeriodunit.D;
    Wk: Timing_repeatPeriodunit.Wk;
    Mo: Timing_repeatPeriodunit.Mo;
    A: Timing_repeatPeriodunit.A;
    _visit: <Result>(value: Timing_repeatPeriodunit, visitor: Timing_repeatPeriodunit._Visitor<Result>) => Result;
};
export declare namespace Timing_repeatPeriodunit {
    type S = "s" & {
        __S: void;
    };
    type Min = "min" & {
        __Min: void;
    };
    type H = "h" & {
        __H: void;
    };
    type D = "d" & {
        __D: void;
    };
    type Wk = "wk" & {
        __Wk: void;
    };
    type Mo = "mo" & {
        __Mo: void;
    };
    type A = "a" & {
        __A: void;
    };
    interface _Visitor<Result> {
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
