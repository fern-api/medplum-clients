export declare type Elementdefinition_bindingStrength = Elementdefinition_bindingStrength.Required | Elementdefinition_bindingStrength.Extensible | Elementdefinition_bindingStrength.Preferred | Elementdefinition_bindingStrength.Example;
export declare const Elementdefinition_bindingStrength: {
    Required: Elementdefinition_bindingStrength.Required;
    Extensible: Elementdefinition_bindingStrength.Extensible;
    Preferred: Elementdefinition_bindingStrength.Preferred;
    Example: Elementdefinition_bindingStrength.Example;
    _visit: <Result>(value: Elementdefinition_bindingStrength, visitor: Elementdefinition_bindingStrength._Visitor<Result>) => Result;
};
export declare namespace Elementdefinition_bindingStrength {
    type Required = "required" & {
        __Required: void;
    };
    type Extensible = "extensible" & {
        __Extensible: void;
    };
    type Preferred = "preferred" & {
        __Preferred: void;
    };
    type Example = "example" & {
        __Example: void;
    };
    interface _Visitor<Result> {
        required: () => Result;
        extensible: () => Result;
        preferred: () => Result;
        example: () => Result;
        _unknown: () => Result;
    }
}
