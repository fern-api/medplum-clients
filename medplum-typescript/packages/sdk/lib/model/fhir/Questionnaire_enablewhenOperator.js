"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Questionnaire_enablewhenOperator = void 0;
exports.Questionnaire_enablewhenOperator = {
    Exists: "exists",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Questionnaire_enablewhenOperator.Exists:
                return visitor.exists();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Questionnaire_enablewhenOperator.js.map