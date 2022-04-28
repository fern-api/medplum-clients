export type Specimendefinition_typetestedPreference =
    | Specimendefinition_typetestedPreference.Preferred
    | Specimendefinition_typetestedPreference.Alternate;

export const Specimendefinition_typetestedPreference = {
    Preferred: "preferred" as Specimendefinition_typetestedPreference.Preferred,
    Alternate: "alternate" as Specimendefinition_typetestedPreference.Alternate,

    _visit: <Result>(value: Specimendefinition_typetestedPreference, visitor: Specimendefinition_typetestedPreference._Visitor<Result>): Result => {
        switch (value) {
            case Specimendefinition_typetestedPreference.Preferred: return visitor.preferred();
            case Specimendefinition_typetestedPreference.Alternate: return visitor.alternate();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Specimendefinition_typetestedPreference {
    export type Preferred = "preferred" & {
        __Preferred: void,
    };
    export type Alternate = "alternate" & {
        __Alternate: void,
    };

    export interface _Visitor<Result> {
        preferred: () => Result;
        alternate: () => Result;
        _unknown: () => Result;
    }
}
