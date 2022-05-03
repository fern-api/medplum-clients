export declare type TerminologycapabilitiesCodesearch = TerminologycapabilitiesCodesearch.Explicit | TerminologycapabilitiesCodesearch.All;
export declare const TerminologycapabilitiesCodesearch: {
    Explicit: TerminologycapabilitiesCodesearch.Explicit;
    All: TerminologycapabilitiesCodesearch.All;
    _visit: <Result>(value: TerminologycapabilitiesCodesearch, visitor: TerminologycapabilitiesCodesearch._Visitor<Result>) => Result;
};
export declare namespace TerminologycapabilitiesCodesearch {
    type Explicit = "explicit" & {
        __Explicit: void;
    };
    type All = "all" & {
        __All: void;
    };
    interface _Visitor<Result> {
        explicit: () => Result;
        all: () => Result;
        _unknown: () => Result;
    }
}
