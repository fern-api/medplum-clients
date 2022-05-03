"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Researchelementdefinition_characteristicStudyeffectivegroupmeasure = void 0;
exports.Researchelementdefinition_characteristicStudyeffectivegroupmeasure = {
    Mean: "mean",
    Median: "median",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Mean:
                return visitor.mean();
            case exports.Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Median:
                return visitor.median();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Researchelementdefinition_characteristicStudyeffectivegroupmeasure.js.map