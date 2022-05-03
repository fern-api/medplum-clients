export type Operationdefinition_bindingStrength =
    | Operationdefinition_bindingStrength.Required
    | Operationdefinition_bindingStrength.Extensible
    | Operationdefinition_bindingStrength.Preferred
    | Operationdefinition_bindingStrength.Example;

export const Operationdefinition_bindingStrength = {
    Required: "required" as Operationdefinition_bindingStrength.Required,
    Extensible: "extensible" as Operationdefinition_bindingStrength.Extensible,
    Preferred: "preferred" as Operationdefinition_bindingStrength.Preferred,
    Example: "example" as Operationdefinition_bindingStrength.Example,

    _visit: <Result>(
        value: Operationdefinition_bindingStrength,
        visitor: Operationdefinition_bindingStrength._Visitor<Result>
    ): Result => {
        switch (value) {
            case Operationdefinition_bindingStrength.Required:
                return visitor.required();
            case Operationdefinition_bindingStrength.Extensible:
                return visitor.extensible();
            case Operationdefinition_bindingStrength.Preferred:
                return visitor.preferred();
            case Operationdefinition_bindingStrength.Example:
                return visitor.example();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Operationdefinition_bindingStrength {
    export type Required = "required" & {
        __Required: void;
    };
    export type Extensible = "extensible" & {
        __Extensible: void;
    };
    export type Preferred = "preferred" & {
        __Preferred: void;
    };
    export type Example = "example" & {
        __Example: void;
    };

    export interface _Visitor<Result> {
        required: () => Result;
        extensible: () => Result;
        preferred: () => Result;
        example: () => Result;
        _unknown: () => Result;
    }
}
