export type Capabilitystatement_searchparamType =
    | Capabilitystatement_searchparamType.Number
    | Capabilitystatement_searchparamType.Date
    | Capabilitystatement_searchparamType.String
    | Capabilitystatement_searchparamType.Token
    | Capabilitystatement_searchparamType.Reference
    | Capabilitystatement_searchparamType.Composite
    | Capabilitystatement_searchparamType.Quantity
    | Capabilitystatement_searchparamType.Uri
    | Capabilitystatement_searchparamType.Special;

export const Capabilitystatement_searchparamType = {
    Number: "number" as Capabilitystatement_searchparamType.Number,
    Date: "date" as Capabilitystatement_searchparamType.Date,
    String: "string" as Capabilitystatement_searchparamType.String,
    Token: "token" as Capabilitystatement_searchparamType.Token,
    Reference: "reference" as Capabilitystatement_searchparamType.Reference,
    Composite: "composite" as Capabilitystatement_searchparamType.Composite,
    Quantity: "quantity" as Capabilitystatement_searchparamType.Quantity,
    Uri: "uri" as Capabilitystatement_searchparamType.Uri,
    Special: "special" as Capabilitystatement_searchparamType.Special,

    _visit: <Result>(
        value: Capabilitystatement_searchparamType,
        visitor: Capabilitystatement_searchparamType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Capabilitystatement_searchparamType.Number:
                return visitor.number();
            case Capabilitystatement_searchparamType.Date:
                return visitor.date();
            case Capabilitystatement_searchparamType.String:
                return visitor.string();
            case Capabilitystatement_searchparamType.Token:
                return visitor.token();
            case Capabilitystatement_searchparamType.Reference:
                return visitor.reference();
            case Capabilitystatement_searchparamType.Composite:
                return visitor.composite();
            case Capabilitystatement_searchparamType.Quantity:
                return visitor.quantity();
            case Capabilitystatement_searchparamType.Uri:
                return visitor.uri();
            case Capabilitystatement_searchparamType.Special:
                return visitor.special();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Capabilitystatement_searchparamType {
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
