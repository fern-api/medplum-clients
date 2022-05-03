"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Structuremap_structureMode = void 0;
exports.Structuremap_structureMode = {
    Source: "source",
    Queried: "queried",
    Target: "target",
    Produced: "produced",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Structuremap_structureMode.Source:
                return visitor.source();
            case exports.Structuremap_structureMode.Queried:
                return visitor.queried();
            case exports.Structuremap_structureMode.Target:
                return visitor.target();
            case exports.Structuremap_structureMode.Produced:
                return visitor.produced();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Structuremap_structureMode.js.map