export type Researchelementdefinition_characteristicParticipanteffectivegroupmeasure =
    | Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Mean
    | Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Median;

export const Researchelementdefinition_characteristicParticipanteffectivegroupmeasure = {
    Mean: "mean" as Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Mean,
    Median: "median" as Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Median,

    _visit: <Result>(value: Researchelementdefinition_characteristicParticipanteffectivegroupmeasure, visitor: Researchelementdefinition_characteristicParticipanteffectivegroupmeasure._Visitor<Result>): Result => {
        switch (value) {
            case Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Mean: return visitor.mean();
            case Researchelementdefinition_characteristicParticipanteffectivegroupmeasure.Median: return visitor.median();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Researchelementdefinition_characteristicParticipanteffectivegroupmeasure {
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
