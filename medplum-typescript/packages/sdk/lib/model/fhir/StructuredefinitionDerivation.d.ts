export declare type StructuredefinitionDerivation = StructuredefinitionDerivation.Specialization | StructuredefinitionDerivation.Constraint;
export declare const StructuredefinitionDerivation: {
    Specialization: StructuredefinitionDerivation.Specialization;
    Constraint: StructuredefinitionDerivation.Constraint;
    _visit: <Result>(value: StructuredefinitionDerivation, visitor: StructuredefinitionDerivation._Visitor<Result>) => Result;
};
export declare namespace StructuredefinitionDerivation {
    type Specialization = "specialization" & {
        __Specialization: void;
    };
    type Constraint = "constraint" & {
        __Constraint: void;
    };
    interface _Visitor<Result> {
        specialization: () => Result;
        constraint: () => Result;
        _unknown: () => Result;
    }
}
