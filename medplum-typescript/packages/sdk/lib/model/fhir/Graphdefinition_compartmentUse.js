"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Graphdefinition_compartmentUse = void 0;
exports.Graphdefinition_compartmentUse = {
    Condition: "condition",
    Requirement: "requirement",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Graphdefinition_compartmentUse.Condition:
                return visitor.condition();
            case exports.Graphdefinition_compartmentUse.Requirement:
                return visitor.requirement();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Graphdefinition_compartmentUse.js.map