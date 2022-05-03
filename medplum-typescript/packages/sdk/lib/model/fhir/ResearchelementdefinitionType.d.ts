export declare type ResearchelementdefinitionType = ResearchelementdefinitionType.Population | ResearchelementdefinitionType.Exposure | ResearchelementdefinitionType.Outcome;
export declare const ResearchelementdefinitionType: {
    Population: ResearchelementdefinitionType.Population;
    Exposure: ResearchelementdefinitionType.Exposure;
    Outcome: ResearchelementdefinitionType.Outcome;
    _visit: <Result>(value: ResearchelementdefinitionType, visitor: ResearchelementdefinitionType._Visitor<Result>) => Result;
};
export declare namespace ResearchelementdefinitionType {
    type Population = "population" & {
        __Population: void;
    };
    type Exposure = "exposure" & {
        __Exposure: void;
    };
    type Outcome = "outcome" & {
        __Outcome: void;
    };
    interface _Visitor<Result> {
        population: () => Result;
        exposure: () => Result;
        outcome: () => Result;
        _unknown: () => Result;
    }
}
