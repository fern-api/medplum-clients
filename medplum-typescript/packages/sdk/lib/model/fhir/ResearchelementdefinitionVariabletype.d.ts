export declare type ResearchelementdefinitionVariabletype = ResearchelementdefinitionVariabletype.Dichotomous | ResearchelementdefinitionVariabletype.Continuous | ResearchelementdefinitionVariabletype.Descriptive;
export declare const ResearchelementdefinitionVariabletype: {
    Dichotomous: ResearchelementdefinitionVariabletype.Dichotomous;
    Continuous: ResearchelementdefinitionVariabletype.Continuous;
    Descriptive: ResearchelementdefinitionVariabletype.Descriptive;
    _visit: <Result>(value: ResearchelementdefinitionVariabletype, visitor: ResearchelementdefinitionVariabletype._Visitor<Result>) => Result;
};
export declare namespace ResearchelementdefinitionVariabletype {
    type Dichotomous = "dichotomous" & {
        __Dichotomous: void;
    };
    type Continuous = "continuous" & {
        __Continuous: void;
    };
    type Descriptive = "descriptive" & {
        __Descriptive: void;
    };
    interface _Visitor<Result> {
        dichotomous: () => Result;
        continuous: () => Result;
        descriptive: () => Result;
        _unknown: () => Result;
    }
}
