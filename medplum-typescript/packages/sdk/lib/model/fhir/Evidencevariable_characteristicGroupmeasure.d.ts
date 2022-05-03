export declare type Evidencevariable_characteristicGroupmeasure = Evidencevariable_characteristicGroupmeasure.Mean | Evidencevariable_characteristicGroupmeasure.Median;
export declare const Evidencevariable_characteristicGroupmeasure: {
    Mean: Evidencevariable_characteristicGroupmeasure.Mean;
    Median: Evidencevariable_characteristicGroupmeasure.Median;
    _visit: <Result>(value: Evidencevariable_characteristicGroupmeasure, visitor: Evidencevariable_characteristicGroupmeasure._Visitor<Result>) => Result;
};
export declare namespace Evidencevariable_characteristicGroupmeasure {
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
