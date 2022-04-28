export type Elementdefinition_slicingRules =
    | Elementdefinition_slicingRules.Closed
    | Elementdefinition_slicingRules.Open
    | Elementdefinition_slicingRules.OpenAtEnd;

export const Elementdefinition_slicingRules = {
    Closed: "closed" as Elementdefinition_slicingRules.Closed,
    Open: "open" as Elementdefinition_slicingRules.Open,
    OpenAtEnd: "openAtEnd" as Elementdefinition_slicingRules.OpenAtEnd,

    _visit: <Result>(value: Elementdefinition_slicingRules, visitor: Elementdefinition_slicingRules._Visitor<Result>): Result => {
        switch (value) {
            case Elementdefinition_slicingRules.Closed: return visitor.closed();
            case Elementdefinition_slicingRules.Open: return visitor.open();
            case Elementdefinition_slicingRules.OpenAtEnd: return visitor.openAtEnd();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Elementdefinition_slicingRules {
    export type Closed = "closed" & {
        __Closed: void,
    };
    export type Open = "open" & {
        __Open: void,
    };
    export type OpenAtEnd = "openAtEnd" & {
        __OpenAtEnd: void,
    };

    export interface _Visitor<Result> {
        closed: () => Result;
        open: () => Result;
        openAtEnd: () => Result;
        _unknown: () => Result;
    }
}
