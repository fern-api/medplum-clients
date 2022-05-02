export type Timing_repeatWhenItem =
    | Timing_repeatWhenItem.Morn
    | Timing_repeatWhenItem.Noon
    | Timing_repeatWhenItem.Aft
    | Timing_repeatWhenItem.Eve
    | Timing_repeatWhenItem.Night
    | Timing_repeatWhenItem.Phs
    | Timing_repeatWhenItem.Hs
    | Timing_repeatWhenItem.Wake
    | Timing_repeatWhenItem.C
    | Timing_repeatWhenItem.Cm
    | Timing_repeatWhenItem.Cd
    | Timing_repeatWhenItem.Cv
    | Timing_repeatWhenItem.Ac
    | Timing_repeatWhenItem.Acm
    | Timing_repeatWhenItem.Acd
    | Timing_repeatWhenItem.Acv
    | Timing_repeatWhenItem.Pc
    | Timing_repeatWhenItem.Pcm
    | Timing_repeatWhenItem.Pcd
    | Timing_repeatWhenItem.Pcv;

export const Timing_repeatWhenItem = {
    Morn: "MORN" as Timing_repeatWhenItem.Morn,
    Noon: "NOON" as Timing_repeatWhenItem.Noon,
    Aft: "AFT" as Timing_repeatWhenItem.Aft,
    Eve: "EVE" as Timing_repeatWhenItem.Eve,
    Night: "NIGHT" as Timing_repeatWhenItem.Night,
    Phs: "PHS" as Timing_repeatWhenItem.Phs,
    Hs: "HS" as Timing_repeatWhenItem.Hs,
    Wake: "WAKE" as Timing_repeatWhenItem.Wake,
    C: "C" as Timing_repeatWhenItem.C,
    Cm: "CM" as Timing_repeatWhenItem.Cm,
    Cd: "CD" as Timing_repeatWhenItem.Cd,
    Cv: "CV" as Timing_repeatWhenItem.Cv,
    Ac: "AC" as Timing_repeatWhenItem.Ac,
    Acm: "ACM" as Timing_repeatWhenItem.Acm,
    Acd: "ACD" as Timing_repeatWhenItem.Acd,
    Acv: "ACV" as Timing_repeatWhenItem.Acv,
    Pc: "PC" as Timing_repeatWhenItem.Pc,
    Pcm: "PCM" as Timing_repeatWhenItem.Pcm,
    Pcd: "PCD" as Timing_repeatWhenItem.Pcd,
    Pcv: "PCV" as Timing_repeatWhenItem.Pcv,

    _visit: <Result>(
        value: Timing_repeatWhenItem,
        visitor: Timing_repeatWhenItem._Visitor<Result>
    ): Result => {
        switch (value) {
            case Timing_repeatWhenItem.Morn:
                return visitor.morn();
            case Timing_repeatWhenItem.Noon:
                return visitor.noon();
            case Timing_repeatWhenItem.Aft:
                return visitor.aft();
            case Timing_repeatWhenItem.Eve:
                return visitor.eve();
            case Timing_repeatWhenItem.Night:
                return visitor.night();
            case Timing_repeatWhenItem.Phs:
                return visitor.phs();
            case Timing_repeatWhenItem.Hs:
                return visitor.hs();
            case Timing_repeatWhenItem.Wake:
                return visitor.wake();
            case Timing_repeatWhenItem.C:
                return visitor.c();
            case Timing_repeatWhenItem.Cm:
                return visitor.cm();
            case Timing_repeatWhenItem.Cd:
                return visitor.cd();
            case Timing_repeatWhenItem.Cv:
                return visitor.cv();
            case Timing_repeatWhenItem.Ac:
                return visitor.ac();
            case Timing_repeatWhenItem.Acm:
                return visitor.acm();
            case Timing_repeatWhenItem.Acd:
                return visitor.acd();
            case Timing_repeatWhenItem.Acv:
                return visitor.acv();
            case Timing_repeatWhenItem.Pc:
                return visitor.pc();
            case Timing_repeatWhenItem.Pcm:
                return visitor.pcm();
            case Timing_repeatWhenItem.Pcd:
                return visitor.pcd();
            case Timing_repeatWhenItem.Pcv:
                return visitor.pcv();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Timing_repeatWhenItem {
    export type Morn = "MORN" & {
        __Morn: void;
    };
    export type Noon = "NOON" & {
        __Noon: void;
    };
    export type Aft = "AFT" & {
        __Aft: void;
    };
    export type Eve = "EVE" & {
        __Eve: void;
    };
    export type Night = "NIGHT" & {
        __Night: void;
    };
    export type Phs = "PHS" & {
        __Phs: void;
    };
    export type Hs = "HS" & {
        __Hs: void;
    };
    export type Wake = "WAKE" & {
        __Wake: void;
    };
    export type C = "C" & {
        __C: void;
    };
    export type Cm = "CM" & {
        __Cm: void;
    };
    export type Cd = "CD" & {
        __Cd: void;
    };
    export type Cv = "CV" & {
        __Cv: void;
    };
    export type Ac = "AC" & {
        __Ac: void;
    };
    export type Acm = "ACM" & {
        __Acm: void;
    };
    export type Acd = "ACD" & {
        __Acd: void;
    };
    export type Acv = "ACV" & {
        __Acv: void;
    };
    export type Pc = "PC" & {
        __Pc: void;
    };
    export type Pcm = "PCM" & {
        __Pcm: void;
    };
    export type Pcd = "PCD" & {
        __Pcd: void;
    };
    export type Pcv = "PCV" & {
        __Pcv: void;
    };

    export interface _Visitor<Result> {
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
