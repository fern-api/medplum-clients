export declare type SearchparameterType = SearchparameterType.Number | SearchparameterType.Date | SearchparameterType.String | SearchparameterType.Token | SearchparameterType.Reference | SearchparameterType.Composite | SearchparameterType.Quantity | SearchparameterType.Uri | SearchparameterType.Special;
export declare const SearchparameterType: {
    Number: SearchparameterType.Number;
    Date: SearchparameterType.Date;
    String: SearchparameterType.String;
    Token: SearchparameterType.Token;
    Reference: SearchparameterType.Reference;
    Composite: SearchparameterType.Composite;
    Quantity: SearchparameterType.Quantity;
    Uri: SearchparameterType.Uri;
    Special: SearchparameterType.Special;
    _visit: <Result>(value: SearchparameterType, visitor: SearchparameterType._Visitor<Result>) => Result;
};
export declare namespace SearchparameterType {
    type Number = "number" & {
        __Number: void;
    };
    type Date = "date" & {
        __Date: void;
    };
    type String = "string" & {
        __String: void;
    };
    type Token = "token" & {
        __Token: void;
    };
    type Reference = "reference" & {
        __Reference: void;
    };
    type Composite = "composite" & {
        __Composite: void;
    };
    type Quantity = "quantity" & {
        __Quantity: void;
    };
    type Uri = "uri" & {
        __Uri: void;
    };
    type Special = "special" & {
        __Special: void;
    };
    interface _Visitor<Result> {
        number: () => Result;
        date: () => Result;
        string: () => Result;
        token: () => Result;
        reference: () => Result;
        composite: () => Result;
        quantity: () => Result;
        uri: () => Result;
        special: () => Result;
        _unknown: () => Result;
    }
}
