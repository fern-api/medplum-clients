export type ResearchelementdefinitionVariabletype =
    | ResearchelementdefinitionVariabletype.Dichotomous
    | ResearchelementdefinitionVariabletype.Continuous
    | ResearchelementdefinitionVariabletype.Descriptive;

export const ResearchelementdefinitionVariabletype = {
    Dichotomous:
        "dichotomous" as ResearchelementdefinitionVariabletype.Dichotomous,
    Continuous:
        "continuous" as ResearchelementdefinitionVariabletype.Continuous,
    Descriptive:
        "descriptive" as ResearchelementdefinitionVariabletype.Descriptive,

    _visit: <Result>(
        value: ResearchelementdefinitionVariabletype,
        visitor: ResearchelementdefinitionVariabletype._Visitor<Result>
    ): Result => {
        switch (value) {
            case ResearchelementdefinitionVariabletype.Dichotomous:
                return visitor.dichotomous();
            case ResearchelementdefinitionVariabletype.Continuous:
                return visitor.continuous();
            case ResearchelementdefinitionVariabletype.Descriptive:
                return visitor.descriptive();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace ResearchelementdefinitionVariabletype {
    export type Dichotomous = "dichotomous" & {
        __Dichotomous: void;
    };
    export type Continuous = "continuous" & {
        __Continuous: void;
    };
    export type Descriptive = "descriptive" & {
        __Descriptive: void;
    };

    export interface _Visitor<Result> {
        dichotomous: () => Result;
        continuous: () => Result;
        descriptive: () => Result;
        _unknown: () => Result;
    }
}
