"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ExplanationofbenefitStatus = void 0;
exports.ExplanationofbenefitStatus = {
    Active: "active",
    Cancelled: "cancelled",
    Draft: "draft",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ExplanationofbenefitStatus.Active:
                return visitor.active();
            case exports.ExplanationofbenefitStatus.Cancelled:
                return visitor.cancelled();
            case exports.ExplanationofbenefitStatus.Draft:
                return visitor.draft();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ExplanationofbenefitStatus.js.map