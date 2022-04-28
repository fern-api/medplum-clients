export type MeasurereportType =
    | MeasurereportType.Individual
    | MeasurereportType.Summary;

export const MeasurereportType = {
    Individual: "individual" as MeasurereportType.Individual,
    Summary: "summary" as MeasurereportType.Summary,

    _visit: <Result>(value: MeasurereportType, visitor: MeasurereportType._Visitor<Result>): Result => {
        switch (value) {
            case MeasurereportType.Individual: return visitor.individual();
            case MeasurereportType.Summary: return visitor.summary();
            default: return visitor._unknown();
        }
    },
};

export declare namespace MeasurereportType {
    export type Individual = "individual" & {
        __Individual: void,
    };
    export type Summary = "summary" & {
        __Summary: void,
    };

    export interface _Visitor<Result> {
        individual: () => Result;
        summary: () => Result;
        _unknown: () => Result;
    }
}
