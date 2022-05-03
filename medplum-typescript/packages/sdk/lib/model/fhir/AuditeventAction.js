"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AuditeventAction = void 0;
exports.AuditeventAction = {
    C: "C",
    R: "R",
    U: "U",
    D: "D",
    E: "E",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.AuditeventAction.C:
                return visitor.c();
            case exports.AuditeventAction.R:
                return visitor.r();
            case exports.AuditeventAction.U:
                return visitor.u();
            case exports.AuditeventAction.D:
                return visitor.d();
            case exports.AuditeventAction.E:
                return visitor.e();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=AuditeventAction.js.map