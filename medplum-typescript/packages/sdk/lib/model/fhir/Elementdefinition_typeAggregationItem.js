"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Elementdefinition_typeAggregationItem = void 0;
exports.Elementdefinition_typeAggregationItem = {
    Contained: "contained",
    Referenced: "referenced",
    Bundled: "bundled",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Elementdefinition_typeAggregationItem.Contained:
                return visitor.contained();
            case exports.Elementdefinition_typeAggregationItem.Referenced:
                return visitor.referenced();
            case exports.Elementdefinition_typeAggregationItem.Bundled:
                return visitor.bundled();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Elementdefinition_typeAggregationItem.js.map