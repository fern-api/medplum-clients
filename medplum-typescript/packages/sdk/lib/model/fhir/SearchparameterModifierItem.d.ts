export declare type SearchparameterModifierItem = SearchparameterModifierItem.Missing | SearchparameterModifierItem.Exact | SearchparameterModifierItem.Contains | SearchparameterModifierItem.Not | SearchparameterModifierItem.Text | SearchparameterModifierItem.In | SearchparameterModifierItem.Below | SearchparameterModifierItem.Above | SearchparameterModifierItem.Type | SearchparameterModifierItem.Identifier | SearchparameterModifierItem.OfType;
export declare const SearchparameterModifierItem: {
    Missing: SearchparameterModifierItem.Missing;
    Exact: SearchparameterModifierItem.Exact;
    Contains: SearchparameterModifierItem.Contains;
    Not: SearchparameterModifierItem.Not;
    Text: SearchparameterModifierItem.Text;
    In: SearchparameterModifierItem.In;
    Below: SearchparameterModifierItem.Below;
    Above: SearchparameterModifierItem.Above;
    Type: SearchparameterModifierItem.Type;
    Identifier: SearchparameterModifierItem.Identifier;
    OfType: SearchparameterModifierItem.OfType;
    _visit: <Result>(value: SearchparameterModifierItem, visitor: SearchparameterModifierItem._Visitor<Result>) => Result;
};
export declare namespace SearchparameterModifierItem {
    type Missing = "missing" & {
        __Missing: void;
    };
    type Exact = "exact" & {
        __Exact: void;
    };
    type Contains = "contains" & {
        __Contains: void;
    };
    type Not = "not" & {
        __Not: void;
    };
    type Text = "text" & {
        __Text: void;
    };
    type In = "in" & {
        __In: void;
    };
    type Below = "below" & {
        __Below: void;
    };
    type Above = "above" & {
        __Above: void;
    };
    type Type = "type" & {
        __Type: void;
    };
    type Identifier = "identifier" & {
        __Identifier: void;
    };
    type OfType = "ofType" & {
        __OfType: void;
    };
    interface _Visitor<Result> {
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
