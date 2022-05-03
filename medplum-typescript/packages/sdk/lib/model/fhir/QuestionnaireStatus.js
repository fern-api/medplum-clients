"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.QuestionnaireStatus = void 0;
exports.QuestionnaireStatus = {
    Draft: "draft",
    Active: "active",
    Retired: "retired",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.QuestionnaireStatus.Draft:
                return visitor.draft();
            case exports.QuestionnaireStatus.Active:
                return visitor.active();
            case exports.QuestionnaireStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=QuestionnaireStatus.js.map