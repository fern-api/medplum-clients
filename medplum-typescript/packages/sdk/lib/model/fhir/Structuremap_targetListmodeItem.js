"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Structuremap_targetListmodeItem = void 0;
exports.Structuremap_targetListmodeItem = {
    First: "first",
    Share: "share",
    Last: "last",
    Collate: "collate",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Structuremap_targetListmodeItem.First:
                return visitor.first();
            case exports.Structuremap_targetListmodeItem.Share:
                return visitor.share();
            case exports.Structuremap_targetListmodeItem.Last:
                return visitor.last();
            case exports.Structuremap_targetListmodeItem.Collate:
                return visitor.collate();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Structuremap_targetListmodeItem.js.map