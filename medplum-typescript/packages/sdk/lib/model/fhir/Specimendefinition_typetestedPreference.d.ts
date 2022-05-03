export declare type Specimendefinition_typetestedPreference = Specimendefinition_typetestedPreference.Preferred | Specimendefinition_typetestedPreference.Alternate;
export declare const Specimendefinition_typetestedPreference: {
    Preferred: Specimendefinition_typetestedPreference.Preferred;
    Alternate: Specimendefinition_typetestedPreference.Alternate;
    _visit: <Result>(value: Specimendefinition_typetestedPreference, visitor: Specimendefinition_typetestedPreference._Visitor<Result>) => Result;
};
export declare namespace Specimendefinition_typetestedPreference {
    type Preferred = "preferred" & {
        __Preferred: void;
    };
    type Alternate = "alternate" & {
        __Alternate: void;
    };
    interface _Visitor<Result> {
        preferred: () => Result;
        alternate: () => Result;
        _unknown: () => Result;
    }
}
