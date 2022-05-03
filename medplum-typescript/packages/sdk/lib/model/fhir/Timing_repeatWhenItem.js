"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Timing_repeatWhenItem = void 0;
exports.Timing_repeatWhenItem = {
    Morn: "MORN",
    Noon: "NOON",
    Aft: "AFT",
    Eve: "EVE",
    Night: "NIGHT",
    Phs: "PHS",
    Hs: "HS",
    Wake: "WAKE",
    C: "C",
    Cm: "CM",
    Cd: "CD",
    Cv: "CV",
    Ac: "AC",
    Acm: "ACM",
    Acd: "ACD",
    Acv: "ACV",
    Pc: "PC",
    Pcm: "PCM",
    Pcd: "PCD",
    Pcv: "PCV",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Timing_repeatWhenItem.Morn:
                return visitor.morn();
            case exports.Timing_repeatWhenItem.Noon:
                return visitor.noon();
            case exports.Timing_repeatWhenItem.Aft:
                return visitor.aft();
            case exports.Timing_repeatWhenItem.Eve:
                return visitor.eve();
            case exports.Timing_repeatWhenItem.Night:
                return visitor.night();
            case exports.Timing_repeatWhenItem.Phs:
                return visitor.phs();
            case exports.Timing_repeatWhenItem.Hs:
                return visitor.hs();
            case exports.Timing_repeatWhenItem.Wake:
                return visitor.wake();
            case exports.Timing_repeatWhenItem.C:
                return visitor.c();
            case exports.Timing_repeatWhenItem.Cm:
                return visitor.cm();
            case exports.Timing_repeatWhenItem.Cd:
                return visitor.cd();
            case exports.Timing_repeatWhenItem.Cv:
                return visitor.cv();
            case exports.Timing_repeatWhenItem.Ac:
                return visitor.ac();
            case exports.Timing_repeatWhenItem.Acm:
                return visitor.acm();
            case exports.Timing_repeatWhenItem.Acd:
                return visitor.acd();
            case exports.Timing_repeatWhenItem.Acv:
                return visitor.acv();
            case exports.Timing_repeatWhenItem.Pc:
                return visitor.pc();
            case exports.Timing_repeatWhenItem.Pcm:
                return visitor.pcm();
            case exports.Timing_repeatWhenItem.Pcd:
                return visitor.pcd();
            case exports.Timing_repeatWhenItem.Pcv:
                return visitor.pcv();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Timing_repeatWhenItem.js.map