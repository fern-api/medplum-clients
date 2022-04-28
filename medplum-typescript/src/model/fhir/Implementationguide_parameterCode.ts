export type Implementationguide_parameterCode =
    | Implementationguide_parameterCode.Apply;

export const Implementationguide_parameterCode = {
    Apply: "apply" as Implementationguide_parameterCode.Apply,

    _visit: <Result>(value: Implementationguide_parameterCode, visitor: Implementationguide_parameterCode._Visitor<Result>): Result => {
        switch (value) {
            case Implementationguide_parameterCode.Apply: return visitor.apply();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Implementationguide_parameterCode {
    export type Apply = "apply" & {
        __Apply: void,
    };

    export interface _Visitor<Result> {
        apply: () => Result;
        _unknown: () => Result;
    }
}
