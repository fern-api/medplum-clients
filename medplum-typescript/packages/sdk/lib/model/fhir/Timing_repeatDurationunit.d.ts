export declare type Timing_repeatDurationunit = Timing_repeatDurationunit.S | Timing_repeatDurationunit.Min | Timing_repeatDurationunit.H | Timing_repeatDurationunit.D | Timing_repeatDurationunit.Wk | Timing_repeatDurationunit.Mo | Timing_repeatDurationunit.A;
export declare const Timing_repeatDurationunit: {
    S: Timing_repeatDurationunit.S;
    Min: Timing_repeatDurationunit.Min;
    H: Timing_repeatDurationunit.H;
    D: Timing_repeatDurationunit.D;
    Wk: Timing_repeatDurationunit.Wk;
    Mo: Timing_repeatDurationunit.Mo;
    A: Timing_repeatDurationunit.A;
    _visit: <Result>(value: Timing_repeatDurationunit, visitor: Timing_repeatDurationunit._Visitor<Result>) => Result;
};
export declare namespace Timing_repeatDurationunit {
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
