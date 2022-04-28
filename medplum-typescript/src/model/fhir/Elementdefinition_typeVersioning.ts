export type Elementdefinition_typeVersioning =
    | Elementdefinition_typeVersioning.Either
    | Elementdefinition_typeVersioning.Independent
    | Elementdefinition_typeVersioning.Specific;

export const Elementdefinition_typeVersioning = {
    Either: "either" as Elementdefinition_typeVersioning.Either,
    Independent: "independent" as Elementdefinition_typeVersioning.Independent,
    Specific: "specific" as Elementdefinition_typeVersioning.Specific,

    _visit: <Result>(value: Elementdefinition_typeVersioning, visitor: Elementdefinition_typeVersioning._Visitor<Result>): Result => {
        switch (value) {
            case Elementdefinition_typeVersioning.Either: return visitor.either();
            case Elementdefinition_typeVersioning.Independent: return visitor.independent();
            case Elementdefinition_typeVersioning.Specific: return visitor.specific();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Elementdefinition_typeVersioning {
    export type Either = "either" & {
        __Either: void,
    };
    export type Independent = "independent" & {
        __Independent: void,
    };
    export type Specific = "specific" & {
        __Specific: void,
    };

    export interface _Visitor<Result> {
        either: () => Result;
        independent: () => Result;
        specific: () => Result;
        _unknown: () => Result;
    }
}
