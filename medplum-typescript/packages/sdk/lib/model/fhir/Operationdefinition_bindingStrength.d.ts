export declare type Operationdefinition_bindingStrength = Operationdefinition_bindingStrength.Required | Operationdefinition_bindingStrength.Extensible | Operationdefinition_bindingStrength.Preferred | Operationdefinition_bindingStrength.Example;
export declare const Operationdefinition_bindingStrength: {
    Required: Operationdefinition_bindingStrength.Required;
    Extensible: Operationdefinition_bindingStrength.Extensible;
    Preferred: Operationdefinition_bindingStrength.Preferred;
    Example: Operationdefinition_bindingStrength.Example;
    _visit: <Result>(value: Operationdefinition_bindingStrength, visitor: Operationdefinition_bindingStrength._Visitor<Result>) => Result;
};
export declare namespace Operationdefinition_bindingStrength {
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
