export declare type Researchelementdefinition_characteristicParticipanteffectivegroupmeasure = Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Mean | Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Median;
export declare const Researchelementdefinition_characteristicParticipanteffectivegroupmeasure: {
    Mean: Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Mean;
    Median: Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Median;
    _visit: <Result>(value: Researchelementdefinition_characteristicParticipanteffectivegroupmeasure, visitor: Researchelementdefinition_characteristicParticipanteffectivegroupmeasure._Visitor<Result>) => Result;
};
export declare namespace Researchelementdefinition_characteristicParticipanteffectivegroupmeasure {
    type Mean = "mean" & {
        __Mean: void;
    };
    type Median = "median" & {
        __Median: void;
    };
    interface _Visitor<Result> {
        mean: () => Result;
        median: () => Result;
        _unknown: () => Result;
    }
}
