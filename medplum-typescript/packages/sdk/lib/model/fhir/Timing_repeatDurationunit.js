"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Timing_repeatDurationunit = void 0;
exports.Timing_repeatDurationunit = {
    S: "s",
    Min: "min",
    H: "h",
    D: "d",
    Wk: "wk",
    Mo: "mo",
    A: "a",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Timing_repeatDurationunit.S:
                return visitor.s();
            case exports.Timing_repeatDurationunit.Min:
                return visitor.min();
            case exports.Timing_repeatDurationunit.H:
                return visitor.h();
            case exports.Timing_repeatDurationunit.D:
                return visitor.d();
            case exports.Timing_repeatDurationunit.Wk:
                return visitor.wk();
            case exports.Timing_repeatDurationunit.Mo:
                return visitor.mo();
            case exports.Timing_repeatDurationunit.A:
                return visitor.a();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Timing_repeatDurationunit.js.map