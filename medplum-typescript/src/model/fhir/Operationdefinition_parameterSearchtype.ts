export type Operationdefinition_parameterSearchtype =
    | Operationdefinition_parameterSearchtype.Number
    | Operationdefinition_parameterSearchtype.Date
    | Operationdefinition_parameterSearchtype.String
    | Operationdefinition_parameterSearchtype.Token
    | Operationdefinition_parameterSearchtype.Reference
    | Operationdefinition_parameterSearchtype.Composite
    | Operationdefinition_parameterSearchtype.Quantity
    | Operationdefinition_parameterSearchtype.Uri
    | Operationdefinition_parameterSearchtype.Special;

export const Operationdefinition_parameterSearchtype = {
    Number: "number" as Operationdefinition_parameterSearchtype.Number,
    Date: "date" as Operationdefinition_parameterSearchtype.Date,
    String: "string" as Operationdefinition_parameterSearchtype.String,
    Token: "token" as Operationdefinition_parameterSearchtype.Token,
    Reference: "reference" as Operationdefinition_parameterSearchtype.Reference,
    Composite: "composite" as Operationdefinition_parameterSearchtype.Composite,
    Quantity: "quantity" as Operationdefinition_parameterSearchtype.Quantity,
    Uri: "uri" as Operationdefinition_parameterSearchtype.Uri,
    Special: "special" as Operationdefinition_parameterSearchtype.Special,

    _visit: <Result>(
        value: Operationdefinition_parameterSearchtype,
        visitor: Operationdefinition_parameterSearchtype._Visitor<Result>
    ): Result => {
        switch (value) {
            case Operationdefinition_parameterSearchtype.Number:
                return visitor.number();
            case Operationdefinition_parameterSearchtype.Date:
                return visitor.date();
            case Operationdefinition_parameterSearchtype.String:
                return visitor.string();
            case Operationdefinition_parameterSearchtype.Token:
                return visitor.token();
            case Operationdefinition_parameterSearchtype.Reference:
                return visitor.reference();
            case Operationdefinition_parameterSearchtype.Composite:
                return visitor.composite();
            case Operationdefinition_parameterSearchtype.Quantity:
                return visitor.quantity();
            case Operationdefinition_parameterSearchtype.Uri:
                return visitor.uri();
            case Operationdefinition_parameterSearchtype.Special:
                return visitor.special();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Operationdefinition_parameterSearchtype {
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
