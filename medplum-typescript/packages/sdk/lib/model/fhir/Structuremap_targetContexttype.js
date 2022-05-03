"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Structuremap_targetContexttype = void 0;
exports.Structuremap_targetContexttype = {
    Type: "type",
    Variable: "variable",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Structuremap_targetContexttype.Type:
                return visitor.type();
            case exports.Structuremap_targetContexttype.Variable:
                return visitor.variable();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Structuremap_targetContexttype.js.map