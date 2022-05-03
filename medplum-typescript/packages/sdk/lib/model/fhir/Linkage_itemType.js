"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Linkage_itemType = void 0;
exports.Linkage_itemType = {
    Source: "source",
    Alternate: "alternate",
    Historical: "historical",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Linkage_itemType.Source:
                return visitor.source();
            case exports.Linkage_itemType.Alternate:
                return visitor.alternate();
            case exports.Linkage_itemType.Historical:
                return visitor.historical();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Linkage_itemType.js.map