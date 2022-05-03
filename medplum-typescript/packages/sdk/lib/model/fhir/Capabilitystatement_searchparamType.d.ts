export declare type Capabilitystatement_searchparamType = Capabilitystatement_searchparamType.Number | Capabilitystatement_searchparamType.Date | Capabilitystatement_searchparamType.String | Capabilitystatement_searchparamType.Token | Capabilitystatement_searchparamType.Reference | Capabilitystatement_searchparamType.Composite | Capabilitystatement_searchparamType.Quantity | Capabilitystatement_searchparamType.Uri | Capabilitystatement_searchparamType.Special;
export declare const Capabilitystatement_searchparamType: {
    Number: Capabilitystatement_searchparamType.Number;
    Date: Capabilitystatement_searchparamType.Date;
    String: Capabilitystatement_searchparamType.String;
    Token: Capabilitystatement_searchparamType.Token;
    Reference: Capabilitystatement_searchparamType.Reference;
    Composite: Capabilitystatement_searchparamType.Composite;
    Quantity: Capabilitystatement_searchparamType.Quantity;
    Uri: Capabilitystatement_searchparamType.Uri;
    Special: Capabilitystatement_searchparamType.Special;
    _visit: <Result>(value: Capabilitystatement_searchparamType, visitor: Capabilitystatement_searchparamType._Visitor<Result>) => Result;
};
export declare namespace Capabilitystatement_searchparamType {
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
