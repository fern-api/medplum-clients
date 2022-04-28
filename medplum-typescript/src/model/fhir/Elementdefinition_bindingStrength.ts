export type Elementdefinition_bindingStrength =
    | Elementdefinition_bindingStrength.Required
    | Elementdefinition_bindingStrength.Extensible
    | Elementdefinition_bindingStrength.Preferred
    | Elementdefinition_bindingStrength.Example;

export const Elementdefinition_bindingStrength = {
    Required: "required" as Elementdefinition_bindingStrength.Required,
    Extensible: "extensible" as Elementdefinition_bindingStrength.Extensible,
    Preferred: "preferred" as Elementdefinition_bindingStrength.Preferred,
    Example: "example" as Elementdefinition_bindingStrength.Example,

    _visit: <Result>(value: Elementdefinition_bindingStrength, visitor: Elementdefinition_bindingStrength._Visitor<Result>): Result => {
        switch (value) {
            case Elementdefinition_bindingStrength.Required: return visitor.required();
            case Elementdefinition_bindingStrength.Extensible: return visitor.extensible();
            case Elementdefinition_bindingStrength.Preferred: return visitor.preferred();
            case Elementdefinition_bindingStrength.Example: return visitor.example();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Elementdefinition_bindingStrength {
    export type Required = "required" & {
        __Required: void,
    };
    export type Extensible = "extensible" & {
        __Extensible: void,
    };
    export type Preferred = "preferred" & {
        __Preferred: void,
    };
    export type Example = "example" & {
        __Example: void,
    };

    export interface _Visitor<Result> {
        required: () => Result;
        extensible: () => Result;
        preferred: () => Result;
        example: () => Result;
        _unknown: () => Result;
    }
}
