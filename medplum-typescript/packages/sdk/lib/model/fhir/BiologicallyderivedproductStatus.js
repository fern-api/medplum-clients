"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BiologicallyderivedproductStatus = void 0;
exports.BiologicallyderivedproductStatus = {
    Available: "available",
    Unavailable: "unavailable",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.BiologicallyderivedproductStatus.Available:
                return visitor.available();
            case exports.BiologicallyderivedproductStatus.Unavailable:
                return visitor.unavailable();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=BiologicallyderivedproductStatus.js.map