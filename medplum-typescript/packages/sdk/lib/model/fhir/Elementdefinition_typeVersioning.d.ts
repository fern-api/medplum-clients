export declare type Elementdefinition_typeVersioning = Elementdefinition_typeVersioning.Either | Elementdefinition_typeVersioning.Independent | Elementdefinition_typeVersioning.Specific;
export declare const Elementdefinition_typeVersioning: {
    Either: Elementdefinition_typeVersioning.Either;
    Independent: Elementdefinition_typeVersioning.Independent;
    Specific: Elementdefinition_typeVersioning.Specific;
    _visit: <Result>(value: Elementdefinition_typeVersioning, visitor: Elementdefinition_typeVersioning._Visitor<Result>) => Result;
};
export declare namespace Elementdefinition_typeVersioning {
    type Either = "either" & {
        __Either: void;
    };
    type Independent = "independent" & {
        __Independent: void;
    };
    type Specific = "specific" & {
        __Specific: void;
    };
    interface _Visitor<Result> {
        either: () => Result;
        independent: () => Result;
        specific: () => Result;
        _unknown: () => Result;
    }
}
