export type ResearchelementdefinitionType =
    | ResearchelementdefinitionType.Population
    | ResearchelementdefinitionType.Exposure
    | ResearchelementdefinitionType.Outcome;

export const ResearchelementdefinitionType = {
    Population: "population" as ResearchelementdefinitionType.Population,
    Exposure: "exposure" as ResearchelementdefinitionType.Exposure,
    Outcome: "outcome" as ResearchelementdefinitionType.Outcome,

    _visit: <Result>(value: ResearchelementdefinitionType, visitor: ResearchelementdefinitionType._Visitor<Result>): Result => {
        switch (value) {
            case ResearchelementdefinitionType.Population: return visitor.population();
            case ResearchelementdefinitionType.Exposure: return visitor.exposure();
            case ResearchelementdefinitionType.Outcome: return visitor.outcome();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ResearchelementdefinitionType {
    export type Population = "population" & {
        __Population: void,
    };
    export type Exposure = "exposure" & {
        __Exposure: void,
    };
    export type Outcome = "outcome" & {
        __Outcome: void,
    };

    export interface _Visitor<Result> {
        population: () => Result;
        exposure: () => Result;
        outcome: () => Result;
        _unknown: () => Result;
    }
}
