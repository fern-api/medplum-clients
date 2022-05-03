export declare type Elementdefinition_slicingRules = Elementdefinition_slicingRules.Closed | Elementdefinition_slicingRules.Open | Elementdefinition_slicingRules.OpenAtEnd;
export declare const Elementdefinition_slicingRules: {
    Closed: Elementdefinition_slicingRules.Closed;
    Open: Elementdefinition_slicingRules.Open;
    OpenAtEnd: Elementdefinition_slicingRules.OpenAtEnd;
    _visit: <Result>(value: Elementdefinition_slicingRules, visitor: Elementdefinition_slicingRules._Visitor<Result>) => Result;
};
export declare namespace Elementdefinition_slicingRules {
    type Closed = "closed" & {
        __Closed: void;
    };
    type Open = "open" & {
        __Open: void;
    };
    type OpenAtEnd = "openAtEnd" & {
        __OpenAtEnd: void;
    };
    interface _Visitor<Result> {
        closed: () => Result;
        open: () => Result;
        openAtEnd: () => Result;
        _unknown: () => Result;
    }
}
