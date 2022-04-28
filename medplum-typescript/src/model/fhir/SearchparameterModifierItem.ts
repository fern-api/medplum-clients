export type SearchparameterModifierItem =
    | SearchparameterModifierItem.Missing
    | SearchparameterModifierItem.Exact
    | SearchparameterModifierItem.Contains
    | SearchparameterModifierItem.Not
    | SearchparameterModifierItem.Text
    | SearchparameterModifierItem.In
    | SearchparameterModifierItem.Below
    | SearchparameterModifierItem.Above
    | SearchparameterModifierItem.Type
    | SearchparameterModifierItem.Identifier
    | SearchparameterModifierItem.OfType;

export const SearchparameterModifierItem = {
    Missing: "missing" as SearchparameterModifierItem.Missing,
    Exact: "exact" as SearchparameterModifierItem.Exact,
    Contains: "contains" as SearchparameterModifierItem.Contains,
    Not: "not" as SearchparameterModifierItem.Not,
    Text: "text" as SearchparameterModifierItem.Text,
    In: "in" as SearchparameterModifierItem.In,
    Below: "below" as SearchparameterModifierItem.Below,
    Above: "above" as SearchparameterModifierItem.Above,
    Type: "type" as SearchparameterModifierItem.Type,
    Identifier: "identifier" as SearchparameterModifierItem.Identifier,
    OfType: "ofType" as SearchparameterModifierItem.OfType,

    _visit: <Result>(value: SearchparameterModifierItem, visitor: SearchparameterModifierItem._Visitor<Result>): Result => {
        switch (value) {
            case SearchparameterModifierItem.Missing: return visitor.missing();
            case SearchparameterModifierItem.Exact: return visitor.exact();
            case SearchparameterModifierItem.Contains: return visitor.contains();
            case SearchparameterModifierItem.Not: return visitor.not();
            case SearchparameterModifierItem.Text: return visitor.text();
            case SearchparameterModifierItem.In: return visitor.in();
            case SearchparameterModifierItem.Below: return visitor.below();
            case SearchparameterModifierItem.Above: return visitor.above();
            case SearchparameterModifierItem.Type: return visitor.type();
            case SearchparameterModifierItem.Identifier: return visitor.identifier();
            case SearchparameterModifierItem.OfType: return visitor.ofType();
            default: return visitor._unknown();
        }
    },
};

export declare namespace SearchparameterModifierItem {
    export type Missing = "missing" & {
        __Missing: void,
    };
    export type Exact = "exact" & {
        __Exact: void,
    };
    export type Contains = "contains" & {
        __Contains: void,
    };
    export type Not = "not" & {
        __Not: void,
    };
    export type Text = "text" & {
        __Text: void,
    };
    export type In = "in" & {
        __In: void,
    };
    export type Below = "below" & {
        __Below: void,
    };
    export type Above = "above" & {
        __Above: void,
    };
    export type Type = "type" & {
        __Type: void,
    };
    export type Identifier = "identifier" & {
        __Identifier: void,
    };
    export type OfType = "ofType" & {
        __OfType: void,
    };

    export interface _Visitor<Result> {
        missing: () => Result;
        exact: () => Result;
        contains: () => Result;
        not: () => Result;
        text: () => Result;
        in: () => Result;
        below: () => Result;
        above: () => Result;
        type: () => Result;
        identifier: () => Result;
        ofType: () => Result;
        _unknown: () => Result;
    }
}
