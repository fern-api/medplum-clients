export type Researchelementdefinition_characteristicStudyeffectivegroupmeasure =
    | Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Mean
    | Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Median;

export const Researchelementdefinition_characteristicStudyeffectivegroupmeasure = {
    Mean: "mean" as Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Mean,
    Median: "median" as Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Median,

    _visit: <Result>(value: Researchelementdefinition_characteristicStudyeffectivegroupmeasure, visitor: Researchelementdefinition_characteristicStudyeffectivegroupmeasure._Visitor<Result>): Result => {
        switch (value) {
            case Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Mean: return visitor.mean();
            case Researchelementdefinition_characteristicStudyeffectivegroupmeasure.Median: return visitor.median();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Researchelementdefinition_characteristicStudyeffectivegroupmeasure {
    export type Mean = "mean" & {
        __Mean: void,
    };
    export type Median = "median" & {
        __Median: void,
    };

    export interface _Visitor<Result> {
        mean: () => Result;
        median: () => Result;
        _unknown: () => Result;
    }
}
