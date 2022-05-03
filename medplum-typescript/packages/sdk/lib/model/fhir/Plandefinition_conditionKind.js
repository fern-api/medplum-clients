"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Plandefinition_conditionKind = void 0;
exports.Plandefinition_conditionKind = {
    Applicability: "applicability",
    Start: "start",
    Stop: "stop",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Plandefinition_conditionKind.Applicability:
                return visitor.applicability();
            case exports.Plandefinition_conditionKind.Start:
                return visitor.start();
            case exports.Plandefinition_conditionKind.Stop:
                return visitor.stop();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Plandefinition_conditionKind.js.map