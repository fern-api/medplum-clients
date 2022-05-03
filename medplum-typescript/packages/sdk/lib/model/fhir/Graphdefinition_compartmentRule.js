"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Graphdefinition_compartmentRule = void 0;
exports.Graphdefinition_compartmentRule = {
    Identical: "identical",
    Matching: "matching",
    Different: "different",
    Custom: "custom",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Graphdefinition_compartmentRule.Identical:
                return visitor.identical();
            case exports.Graphdefinition_compartmentRule.Matching:
                return visitor.matching();
            case exports.Graphdefinition_compartmentRule.Different:
                return visitor.different();
            case exports.Graphdefinition_compartmentRule.Custom:
                return visitor.custom();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Graphdefinition_compartmentRule.js.map