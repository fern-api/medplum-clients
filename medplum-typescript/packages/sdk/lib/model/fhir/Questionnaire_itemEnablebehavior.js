"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Questionnaire_itemEnablebehavior = void 0;
exports.Questionnaire_itemEnablebehavior = {
    All: "all",
    Any: "any",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Questionnaire_itemEnablebehavior.All:
                return visitor.all();
            case exports.Questionnaire_itemEnablebehavior.Any:
                return visitor.any();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Questionnaire_itemEnablebehavior.js.map