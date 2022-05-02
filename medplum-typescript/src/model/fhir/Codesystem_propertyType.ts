export type Codesystem_propertyType =
    | Codesystem_propertyType.Code
    | Codesystem_propertyType.Coding
    | Codesystem_propertyType.String
    | Codesystem_propertyType.Integer
    | Codesystem_propertyType.Boolean
    | Codesystem_propertyType.DateTime
    | Codesystem_propertyType.Decimal;

export const Codesystem_propertyType = {
    Code: "code" as Codesystem_propertyType.Code,
    Coding: "Coding" as Codesystem_propertyType.Coding,
    String: "string" as Codesystem_propertyType.String,
    Integer: "integer" as Codesystem_propertyType.Integer,
    Boolean: "boolean" as Codesystem_propertyType.Boolean,
    DateTime: "dateTime" as Codesystem_propertyType.DateTime,
    Decimal: "decimal" as Codesystem_propertyType.Decimal,

    _visit: <Result>(
        value: Codesystem_propertyType,
        visitor: Codesystem_propertyType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Codesystem_propertyType.Code:
                return visitor.code();
            case Codesystem_propertyType.Coding:
                return visitor.coding();
            case Codesystem_propertyType.String:
                return visitor.string();
            case Codesystem_propertyType.Integer:
                return visitor.integer();
            case Codesystem_propertyType.Boolean:
                return visitor.boolean();
            case Codesystem_propertyType.DateTime:
                return visitor.dateTime();
            case Codesystem_propertyType.Decimal:
                return visitor.decimal();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Codesystem_propertyType {
    export type Code = "code" & {
        __Code: void;
    };
    export type Coding = "Coding" & {
        __Coding: void;
    };
    export type String = "string" & {
        __String: void;
    };
    export type Integer = "integer" & {
        __Integer: void;
    };
    export type Boolean = "boolean" & {
        __Boolean: void;
    };
    export type DateTime = "dateTime" & {
        __DateTime: void;
    };
    export type Decimal = "decimal" & {
        __Decimal: void;
    };

    export interface _Visitor<Result> {
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
