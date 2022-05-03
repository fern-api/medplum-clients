"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Structuremap_inputMode = void 0;
exports.Structuremap_inputMode = {
    Source: "source",
    Target: "target",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Structuremap_inputMode.Source:
                return visitor.source();
            case exports.Structuremap_inputMode.Target:
                return visitor.target();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Structuremap_inputMode.js.map