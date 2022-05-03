export declare type Operationdefinition_parameterSearchtype = Operationdefinition_parameterSearchtype.Number | Operationdefinition_parameterSearchtype.Date | Operationdefinition_parameterSearchtype.String | Operationdefinition_parameterSearchtype.Token | Operationdefinition_parameterSearchtype.Reference | Operationdefinition_parameterSearchtype.Composite | Operationdefinition_parameterSearchtype.Quantity | Operationdefinition_parameterSearchtype.Uri | Operationdefinition_parameterSearchtype.Special;
export declare const Operationdefinition_parameterSearchtype: {
    Number: Operationdefinition_parameterSearchtype.Number;
    Date: Operationdefinition_parameterSearchtype.Date;
    String: Operationdefinition_parameterSearchtype.String;
    Token: Operationdefinition_parameterSearchtype.Token;
    Reference: Operationdefinition_parameterSearchtype.Reference;
    Composite: Operationdefinition_parameterSearchtype.Composite;
    Quantity: Operationdefinition_parameterSearchtype.Quantity;
    Uri: Operationdefinition_parameterSearchtype.Uri;
    Special: Operationdefinition_parameterSearchtype.Special;
    _visit: <Result>(value: Operationdefinition_parameterSearchtype, visitor: Operationdefinition_parameterSearchtype._Visitor<Result>) => Result;
};
export declare namespace Operationdefinition_parameterSearchtype {
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
