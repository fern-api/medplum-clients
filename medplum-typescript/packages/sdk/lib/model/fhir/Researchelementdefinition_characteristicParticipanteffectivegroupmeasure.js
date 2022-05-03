"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Researchelementdefinition_characteristicParticipanteffectivegroupmeasure = void 0;
exports.Researchelementdefinition_characteristicParticipanteffectivegroupmeasure = {
    Mean: "mean",
    Median: "median",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Mean:
                return visitor.mean();
            case exports.Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Median:
                return visitor.median();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.js.map