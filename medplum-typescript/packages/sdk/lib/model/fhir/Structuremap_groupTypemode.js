"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Structuremap_groupTypemode = void 0;
exports.Structuremap_groupTypemode = {
    None: "none",
    Types: "types",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Structuremap_groupTypemode.None:
                return visitor.none();
            case exports.Structuremap_groupTypemode.Types:
                return visitor.types();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Structuremap_groupTypemode.js.map