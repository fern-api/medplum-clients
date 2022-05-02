export type SearchparameterType =
    | SearchparameterType.Number
    | SearchparameterType.Date
    | SearchparameterType.String
    | SearchparameterType.Token
    | SearchparameterType.Reference
    | SearchparameterType.Composite
    | SearchparameterType.Quantity
    | SearchparameterType.Uri
    | SearchparameterType.Special;

export const SearchparameterType = {
    Number: "number" as SearchparameterType.Number,
    Date: "date" as SearchparameterType.Date,
    String: "string" as SearchparameterType.String,
    Token: "token" as SearchparameterType.Token,
    Reference: "reference" as SearchparameterType.Reference,
    Composite: "composite" as SearchparameterType.Composite,
    Quantity: "quantity" as SearchparameterType.Quantity,
    Uri: "uri" as SearchparameterType.Uri,
    Special: "special" as SearchparameterType.Special,

    _visit: <Result>(
        value: SearchparameterType,
        visitor: SearchparameterType._Visitor<Result>
    ): Result => {
        switch (value) {
            case SearchparameterType.Number:
                return visitor.number();
            case SearchparameterType.Date:
                return visitor.date();
            case SearchparameterType.String:
                return visitor.string();
            case SearchparameterType.Token:
                return visitor.token();
            case SearchparameterType.Reference:
                return visitor.reference();
            case SearchparameterType.Composite:
                return visitor.composite();
            case SearchparameterType.Quantity:
                return visitor.quantity();
            case SearchparameterType.Uri:
                return visitor.uri();
            case SearchparameterType.Special:
                return visitor.special();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace SearchparameterType {
    export type Number = "number" & {
        __Number: void;
    };
    export type Date = "date" & {
        __Date: void;
    };
    export type String = "string" & {
        __String: void;
    };
    export type Token = "token" & {
        __Token: void;
    };
    export type Reference = "reference" & {
        __Reference: void;
    };
    export type Composite = "composite" & {
        __Composite: void;
    };
    export type Quantity = "quantity" & {
        __Quantity: void;
    };
    export type Uri = "uri" & {
        __Uri: void;
    };
    export type Special = "special" & {
        __Special: void;
    };

    export interface _Visitor<Result> {
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
