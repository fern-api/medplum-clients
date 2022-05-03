export type Evidencevariable_characteristicGroupmeasure =
    | Evidencevariable_characteristicGroupmeasure.Mean
    | Evidencevariable_characteristicGroupmeasure.Median;

export const Evidencevariable_characteristicGroupmeasure = {
    Mean: "mean" as Evidencevariable_characteristicGroupmeasure.Mean,
    Median: "median" as Evidencevariable_characteristicGroupmeasure.Median,

    _visit: <Result>(
        value: Evidencevariable_characteristicGroupmeasure,
        visitor: Evidencevariable_characteristicGroupmeasure._Visitor<Result>
    ): Result => {
        switch (value) {
            case Evidencevariable_characteristicGroupmeasure.Mean:
                return visitor.mean();
            case Evidencevariable_characteristicGroupmeasure.Median:
                return visitor.median();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Evidencevariable_characteristicGroupmeasure {
    export type Mean = "mean" & {
        __Mean: void;
    };
    export type Median = "median" & {
        __Median: void;
    };

    export interface _Visitor<Result> {
        mean: () => Result;
        median: () => Result;
        _unknown: () => Result;
    }
}
