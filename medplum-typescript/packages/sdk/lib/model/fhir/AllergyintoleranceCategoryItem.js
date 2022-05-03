"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AllergyintoleranceCategoryItem = void 0;
exports.AllergyintoleranceCategoryItem = {
    Food: "food",
    Medication: "medication",
    Environment: "environment",
    Biologic: "biologic",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.AllergyintoleranceCategoryItem.Food:
                return visitor.food();
            case exports.AllergyintoleranceCategoryItem.Medication:
                return visitor.medication();
            case exports.AllergyintoleranceCategoryItem.Environment:
                return visitor.environment();
            case exports.AllergyintoleranceCategoryItem.Biologic:
                return visitor.biologic();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=AllergyintoleranceCategoryItem.js.map