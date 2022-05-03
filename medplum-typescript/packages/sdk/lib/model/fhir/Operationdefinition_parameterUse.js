"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Operationdefinition_parameterUse = void 0;
exports.Operationdefinition_parameterUse = {
    In: "in",
    Out: "out",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Operationdefinition_parameterUse.In:
                return visitor.in();
            case exports.Operationdefinition_parameterUse.Out:
                return visitor.out();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Operationdefinition_parameterUse.js.map