export declare type MeasurereportType = MeasurereportType.Individual | MeasurereportType.Summary;
export declare const MeasurereportType: {
    Individual: MeasurereportType.Individual;
    Summary: MeasurereportType.Summary;
    _visit: <Result>(value: MeasurereportType, visitor: MeasurereportType._Visitor<Result>) => Result;
};
export declare namespace MeasurereportType {
    type Individual = "individual" & {
        __Individual: void;
    };
    type Summary = "summary" & {
        __Summary: void;
    };
    interface _Visitor<Result> {
        individual: () => Result;
        summary: () => Result;
        _unknown: () => Result;
    }
}
