export declare type Implementationguide_parameterCode = Implementationguide_parameterCode.Apply;
export declare const Implementationguide_parameterCode: {
    Apply: Implementationguide_parameterCode.Apply;
    _visit: <Result>(value: Implementationguide_parameterCode, visitor: Implementationguide_parameterCode._Visitor<Result>) => Result;
};
export declare namespace Implementationguide_parameterCode {
    type Apply = "apply" & {
        __Apply: void;
    };
    interface _Visitor<Result> {
        apply: () => Result;
        _unknown: () => Result;
    }
}
