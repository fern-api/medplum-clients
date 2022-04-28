export type Elementdefinition_discriminatorType =
    | Elementdefinition_discriminatorType.Value
    | Elementdefinition_discriminatorType.Exists
    | Elementdefinition_discriminatorType.Pattern
    | Elementdefinition_discriminatorType.Type
    | Elementdefinition_discriminatorType.Profile;

export const Elementdefinition_discriminatorType = {
    Value: "value" as Elementdefinition_discriminatorType.Value,
    Exists: "exists" as Elementdefinition_discriminatorType.Exists,
    Pattern: "pattern" as Elementdefinition_discriminatorType.Pattern,
    Type: "type" as Elementdefinition_discriminatorType.Type,
    Profile: "profile" as Elementdefinition_discriminatorType.Profile,

    _visit: <Result>(value: Elementdefinition_discriminatorType, visitor: Elementdefinition_discriminatorType._Visitor<Result>): Result => {
        switch (value) {
            case Elementdefinition_discriminatorType.Value: return visitor.value();
            case Elementdefinition_discriminatorType.Exists: return visitor.exists();
            case Elementdefinition_discriminatorType.Pattern: return visitor.pattern();
            case Elementdefinition_discriminatorType.Type: return visitor.type();
            case Elementdefinition_discriminatorType.Profile: return visitor.profile();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Elementdefinition_discriminatorType {
    export type Value = "value" & {
        __Value: void,
    };
    export type Exists = "exists" & {
        __Exists: void,
    };
    export type Pattern = "pattern" & {
        __Pattern: void,
    };
    export type Type = "type" & {
        __Type: void,
    };
    export type Profile = "profile" & {
        __Profile: void,
    };

    export interface _Visitor<Result> {
        value: () => Result;
        exists: () => Result;
        pattern: () => Result;
        type: () => Result;
        profile: () => Result;
        _unknown: () => Result;
    }
}
