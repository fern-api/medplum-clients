"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.AllergyintoleranceCriticality = void 0;
exports.AllergyintoleranceCriticality = {
    Low: "low",
    High: "high",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.AllergyintoleranceCriticality.Low:
                return visitor.low();
            case exports.AllergyintoleranceCriticality.High:
                return visitor.high();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=AllergyintoleranceCriticality.js.map