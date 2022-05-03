"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AllergyintoleranceType = void 0;
exports.AllergyintoleranceType = {
    Allergy: "allergy",
    Intolerance: "intolerance",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.AllergyintoleranceType.Allergy:
                return visitor.allergy();
            case exports.AllergyintoleranceType.Intolerance:
                return visitor.intolerance();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=AllergyintoleranceType.js.map