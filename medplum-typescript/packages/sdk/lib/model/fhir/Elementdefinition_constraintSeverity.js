"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Elementdefinition_constraintSeverity = void 0;
exports.Elementdefinition_constraintSeverity = {
    Error: "error",
    Warning: "warning",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Elementdefinition_constraintSeverity.Error:
                return visitor.error();
            case exports.Elementdefinition_constraintSeverity.Warning:
                return visitor.warning();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Elementdefinition_constraintSeverity.js.map