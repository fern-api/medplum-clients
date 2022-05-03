export declare type Researchelementdefinition_characteristicStudyeffectivegroupmeasure = Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Mean | Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Median;
export declare const Researchelementdefinition_characteristicStudyeffectivegroupmeasure: {
    Mean: Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Mean;
    Median: Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Median;
    _visit: <Result>(value: Researchelementdefinition_characteristicStudyeffectivegroupmeasure, visitor: Researchelementdefinition_characteristicStudyeffectivegroupmeasure._Visitor<Result>) => Result;
};
export declare namespace Researchelementdefinition_characteristicStudyeffectivegroupmeasure {
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
