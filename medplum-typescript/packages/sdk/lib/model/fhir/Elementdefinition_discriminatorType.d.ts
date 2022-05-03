export declare type Elementdefinition_discriminatorType = Elementdefinition_discriminatorType.Value | Elementdefinition_discriminatorType.Exists | Elementdefinition_discriminatorType.Pattern | Elementdefinition_discriminatorType.Type | Elementdefinition_discriminatorType.Profile;
export declare const Elementdefinition_discriminatorType: {
    Value: Elementdefinition_discriminatorType.Value;
    Exists: Elementdefinition_discriminatorType.Exists;
    Pattern: Elementdefinition_discriminatorType.Pattern;
    Type: Elementdefinition_discriminatorType.Type;
    Profile: Elementdefinition_discriminatorType.Profile;
    _visit: <Result>(value: Elementdefinition_discriminatorType, visitor: Elementdefinition_discriminatorType._Visitor<Result>) => Result;
};
export declare namespace Elementdefinition_discriminatorType {
    type Value = "value" & {
        __Value: void;
    };
    type Exists = "exists" & {
        __Exists: void;
    };
    type Pattern = "pattern" & {
        __Pattern: void;
    };
    type Type = "type" & {
        __Type: void;
    };
    type Profile = "profile" & {
        __Profile: void;
    };
    interface _Visitor<Result> {
        value: () => Result;
        exists: () => Result;
        pattern: () => Result;
        type: () => Result;
        profile: () => Result;
        _unknown: () => Result;
    }
}
