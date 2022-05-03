"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Evidencevariable_characteristicGroupmeasure = void 0;
exports.Evidencevariable_characteristicGroupmeasure = {
    Mean: "mean",
    Median: "median",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Evidencevariable_characteristicGroupmeasure.Mean:
                return visitor.mean();
            case exports.Evidencevariable_characteristicGroupmeasure.Median:
                return visitor.median();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Evidencevariable_characteristicGroupmeasure.js.map