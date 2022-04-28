export type StructuredefinitionDerivation =
    | StructuredefinitionDerivation.Specialization
    | StructuredefinitionDerivation.Constraint;

export const StructuredefinitionDerivation = {
    Specialization: "specialization" as StructuredefinitionDerivation.Specialization,
    Constraint: "constraint" as StructuredefinitionDerivation.Constraint,

    _visit: <Result>(value: StructuredefinitionDerivation, visitor: StructuredefinitionDerivation._Visitor<Result>): Result => {
        switch (value) {
            case StructuredefinitionDerivation.Specialization: return visitor.specialization();
            case StructuredefinitionDerivation.Constraint: return visitor.constraint();
            default: return visitor._unknown();
        }
    },
};

export declare namespace StructuredefinitionDerivation {
    export type Specialization = "specialization" & {
        __Specialization: void,
    };
    export type Constraint = "constraint" & {
        __Constraint: void,
    };

    export interface _Visitor<Result> {
        specialization: () => Result;
        constraint: () => Result;
        _unknown: () => Result;
    }
}
