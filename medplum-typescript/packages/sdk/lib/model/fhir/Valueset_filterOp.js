"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Valueset_filterOp = void 0;
exports.Valueset_filterOp = {
    Regex: "regex",
    In: "in",
    Generalizes: "generalizes",
    Exists: "exists",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Valueset_filterOp.Regex:
                return visitor.regex();
            case exports.Valueset_filterOp.In:
                return visitor.in();
            case exports.Valueset_filterOp.Generalizes:
                return visitor.generalizes();
            case exports.Valueset_filterOp.Exists:
                return visitor.exists();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Valueset_filterOp.js.map