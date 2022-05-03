"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Biologicallyderivedproduct_storageScale = void 0;
exports.Biologicallyderivedproduct_storageScale = {
    Farenheit: "farenheit",
    Celsius: "celsius",
    Kelvin: "kelvin",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Biologicallyderivedproduct_storageScale.Farenheit:
                return visitor.farenheit();
            case exports.Biologicallyderivedproduct_storageScale.Celsius:
                return visitor.celsius();
            case exports.Biologicallyderivedproduct_storageScale.Kelvin:
                return visitor.kelvin();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Biologicallyderivedproduct_storageScale.js.map