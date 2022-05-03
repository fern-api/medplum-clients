export declare type Operationdefinition_parameterUse = Operationdefinition_parameterUse.In | Operationdefinition_parameterUse.Out;
export declare const Operationdefinition_parameterUse: {
    In: Operationdefinition_parameterUse.In;
    Out: Operationdefinition_parameterUse.Out;
    _visit: <Result>(value: Operationdefinition_parameterUse, visitor: Operationdefinition_parameterUse._Visitor<Result>) => Result;
};
export declare namespace Operationdefinition_parameterUse {
    type In = "in" & {
        __In: void;
    };
    type Out = "out" & {
        __Out: void;
    };
    interface _Visitor<Result> {
        in: () => Result;
        out: () => Result;
        _unknown: () => Result;
    }
}
