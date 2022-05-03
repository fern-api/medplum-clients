"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Timing_repeatPeriodunit = void 0;
exports.Timing_repeatPeriodunit = {
    S: "s",
    Min: "min",
    H: "h",
    D: "d",
    Wk: "wk",
    Mo: "mo",
    A: "a",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Timing_repeatPeriodunit.S:
                return visitor.s();
            case exports.Timing_repeatPeriodunit.Min:
                return visitor.min();
            case exports.Timing_repeatPeriodunit.H:
                return visitor.h();
            case exports.Timing_repeatPeriodunit.D:
                return visitor.d();
            case exports.Timing_repeatPeriodunit.Wk:
                return visitor.wk();
            case exports.Timing_repeatPeriodunit.Mo:
                return visitor.mo();
            case exports.Timing_repeatPeriodunit.A:
                return visitor.a();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Timing_repeatPeriodunit.js.map