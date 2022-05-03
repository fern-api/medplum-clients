"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Implementationguide_parameterCode = void 0;
exports.Implementationguide_parameterCode = {
    Apply: "apply",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Implementationguide_parameterCode.Apply:
                return visitor.apply();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Implementationguide_parameterCode.js.map