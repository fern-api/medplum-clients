export declare type Timing_repeatWhenItem = Timing_repeatWhenItem.Morn | Timing_repeatWhenItem.Noon | Timing_repeatWhenItem.Aft | Timing_repeatWhenItem.Eve | Timing_repeatWhenItem.Night | Timing_repeatWhenItem.Phs | Timing_repeatWhenItem.Hs | Timing_repeatWhenItem.Wake | Timing_repeatWhenItem.C | Timing_repeatWhenItem.Cm | Timing_repeatWhenItem.Cd | Timing_repeatWhenItem.Cv | Timing_repeatWhenItem.Ac | Timing_repeatWhenItem.Acm | Timing_repeatWhenItem.Acd | Timing_repeatWhenItem.Acv | Timing_repeatWhenItem.Pc | Timing_repeatWhenItem.Pcm | Timing_repeatWhenItem.Pcd | Timing_repeatWhenItem.Pcv;
export declare const Timing_repeatWhenItem: {
    Morn: Timing_repeatWhenItem.Morn;
    Noon: Timing_repeatWhenItem.Noon;
    Aft: Timing_repeatWhenItem.Aft;
    Eve: Timing_repeatWhenItem.Eve;
    Night: Timing_repeatWhenItem.Night;
    Phs: Timing_repeatWhenItem.Phs;
    Hs: Timing_repeatWhenItem.Hs;
    Wake: Timing_repeatWhenItem.Wake;
    C: Timing_repeatWhenItem.C;
    Cm: Timing_repeatWhenItem.Cm;
    Cd: Timing_repeatWhenItem.Cd;
    Cv: Timing_repeatWhenItem.Cv;
    Ac: Timing_repeatWhenItem.Ac;
    Acm: Timing_repeatWhenItem.Acm;
    Acd: Timing_repeatWhenItem.Acd;
    Acv: Timing_repeatWhenItem.Acv;
    Pc: Timing_repeatWhenItem.Pc;
    Pcm: Timing_repeatWhenItem.Pcm;
    Pcd: Timing_repeatWhenItem.Pcd;
    Pcv: Timing_repeatWhenItem.Pcv;
    _visit: <Result>(value: Timing_repeatWhenItem, visitor: Timing_repeatWhenItem._Visitor<Result>) => Result;
};
export declare namespace Timing_repeatWhenItem {
    type Morn = "MORN" & {
        __Morn: void;
    };
    type Noon = "NOON" & {
        __Noon: void;
    };
    type Aft = "AFT" & {
        __Aft: void;
    };
    type Eve = "EVE" & {
        __Eve: void;
    };
    type Night = "NIGHT" & {
        __Night: void;
    };
    type Phs = "PHS" & {
        __Phs: void;
    };
    type Hs = "HS" & {
        __Hs: void;
    };
    type Wake = "WAKE" & {
        __Wake: void;
    };
    type C = "C" & {
        __C: void;
    };
    type Cm = "CM" & {
        __Cm: void;
    };
    type Cd = "CD" & {
        __Cd: void;
    };
    type Cv = "CV" & {
        __Cv: void;
    };
    type Ac = "AC" & {
        __Ac: void;
    };
    type Acm = "ACM" & {
        __Acm: void;
    };
    type Acd = "ACD" & {
        __Acd: void;
    };
    type Acv = "ACV" & {
        __Acv: void;
    };
    type Pc = "PC" & {
        __Pc: void;
    };
    type Pcm = "PCM" & {
        __Pcm: void;
    };
    type Pcd = "PCD" & {
        __Pcd: void;
    };
    type Pcv = "PCV" & {
        __Pcv: void;
    };
    interface _Visitor<Result> {
        morn: () => Result;
        noon: () => Result;
        aft: () => Result;
        eve: () => Result;
        night: () => Result;
        phs: () => Result;
        hs: () => Result;
        wake: () => Result;
        c: () => Result;
        cm: () => Result;
        cd: () => Result;
        cv: () => Result;
        ac: () => Result;
        acm: () => Result;
        acd: () => Result;
        acv: () => Result;
        pc: () => Result;
        pcm: () => Result;
        pcd: () => Result;
        pcv: () => Result;
        _unknown: () => Result;
    }
}
