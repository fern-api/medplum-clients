export type TerminologycapabilitiesCodesearch =
    | TerminologycapabilitiesCodesearch.Explicit
    | TerminologycapabilitiesCodesearch.All;

export const TerminologycapabilitiesCodesearch = {
    Explicit: "explicit" as TerminologycapabilitiesCodesearch.Explicit,
    All: "all" as TerminologycapabilitiesCodesearch.All,

    _visit: <Result>(value: TerminologycapabilitiesCodesearch, visitor: TerminologycapabilitiesCodesearch._Visitor<Result>): Result => {
        switch (value) {
            case TerminologycapabilitiesCodesearch.Explicit: return visitor.explicit();
            case TerminologycapabilitiesCodesearch.All: return visitor.all();
            default: return visitor._unknown();
        }
    },
};

export declare namespace TerminologycapabilitiesCodesearch {
    export type Explicit = "explicit" & {
        __Explicit: void,
    };
    export type All = "all" & {
        __All: void,
    };

    export interface _Visitor<Result> {
        explicit: () => Result;
        all: () => Result;
        _unknown: () => Result;
    }
}
