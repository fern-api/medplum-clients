"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.TaskIntent = void 0;
exports.TaskIntent = {
    Proposal: "proposal",
    Plan: "plan",
    Order: "order",
    Option: "option",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.TaskIntent.Proposal:
                return visitor.proposal();
            case exports.TaskIntent.Plan:
                return visitor.plan();
            case exports.TaskIntent.Order:
                return visitor.order();
            case exports.TaskIntent.Option:
                return visitor.option();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=TaskIntent.js.map