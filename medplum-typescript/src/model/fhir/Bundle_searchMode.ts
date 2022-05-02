export type Bundle_searchMode =
    | Bundle_searchMode.Match
    | Bundle_searchMode.Include
    | Bundle_searchMode.Outcome;

export const Bundle_searchMode = {
    Match: "match" as Bundle_searchMode.Match,
    Include: "include" as Bundle_searchMode.Include,
    Outcome: "outcome" as Bundle_searchMode.Outcome,

    _visit: <Result>(
        value: Bundle_searchMode,
        visitor: Bundle_searchMode._Visitor<Result>
    ): Result => {
        switch (value) {
            case Bundle_searchMode.Match:
                return visitor.match();
            case Bundle_searchMode.Include:
                return visitor.include();
            case Bundle_searchMode.Outcome:
                return visitor.outcome();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Bundle_searchMode {
    export type Match = "match" & {
        __Match: void;
    };
    export type Include = "include" & {
        __Include: void;
    };
    export type Outcome = "outcome" & {
        __Outcome: void;
    };

    export interface _Visitor<Result> {
        match: () => Result;
        include: () => Result;
        outcome: () => Result;
        _unknown: () => Result;
    }
}
