export declare type Codesystem_propertyType = Codesystem_propertyType.Code | Codesystem_propertyType.Coding | Codesystem_propertyType.String | Codesystem_propertyType.Integer | Codesystem_propertyType.Boolean | Codesystem_propertyType.DateTime | Codesystem_propertyType.Decimal;
export declare const Codesystem_propertyType: {
    Code: Codesystem_propertyType.Code;
    Coding: Codesystem_propertyType.Coding;
    String: Codesystem_propertyType.String;
    Integer: Codesystem_propertyType.Integer;
    Boolean: Codesystem_propertyType.Boolean;
    DateTime: Codesystem_propertyType.DateTime;
    Decimal: Codesystem_propertyType.Decimal;
    _visit: <Result>(value: Codesystem_propertyType, visitor: Codesystem_propertyType._Visitor<Result>) => Result;
};
export declare namespace Codesystem_propertyType {
    type Code = "code" & {
        __Code: void;
    };
    type Coding = "Coding" & {
        __Coding: void;
    };
    type String = "string" & {
        __String: void;
    };
    type Integer = "integer" & {
        __Integer: void;
    };
    type Boolean = "boolean" & {
        __Boolean: void;
    };
    type DateTime = "dateTime" & {
        __DateTime: void;
    };
    type Decimal = "decimal" & {
        __Decimal: void;
    };
    interface _Visitor<Result> {
        code: () => Result;
        coding: () => Result;
        string: () => Result;
        integer: () => Result;
        boolean: () => Result;
        dateTime: () => Result;
        decimal: () => Result;
        _unknown: () => Result;
    }
}
