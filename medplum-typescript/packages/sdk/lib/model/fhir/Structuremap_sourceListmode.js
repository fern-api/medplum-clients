"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Structuremap_sourceListmode = void 0;
exports.Structuremap_sourceListmode = {
    First: "first",
    Last: "last",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Structuremap_sourceListmode.First:
                return visitor.first();
            case exports.Structuremap_sourceListmode.Last:
                return visitor.last();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Structuremap_sourceListmode.js.map