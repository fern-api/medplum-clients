export declare type Bundle_searchMode = Bundle_searchMode.Match | Bundle_searchMode.Include | Bundle_searchMode.Outcome;
export declare const Bundle_searchMode: {
    Match: Bundle_searchMode.Match;
    Include: Bundle_searchMode.Include;
    Outcome: Bundle_searchMode.Outcome;
    _visit: <Result>(value: Bundle_searchMode, visitor: Bundle_searchMode._Visitor<Result>) => Result;
};
export declare namespace Bundle_searchMode {
    type Match = "match" & {
        __Match: void;
    };
    type Include = "include" & {
        __Include: void;
    };
    type Outcome = "outcome" & {
        __Outcome: void;
    };
    interface _Visitor<Result> {
        match: () => Result;
        include: () => Result;
        outcome: () => Result;
        _unknown: () => Result;
    }
}
