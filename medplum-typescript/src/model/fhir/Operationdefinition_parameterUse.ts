export type Operationdefinition_parameterUse =
    | Operationdefinition_parameterUse.In
    | Operationdefinition_parameterUse.Out;

export const Operationdefinition_parameterUse = {
    In: "in" as Operationdefinition_parameterUse.In,
    Out: "out" as Operationdefinition_parameterUse.Out,

    _visit: <Result>(
        value: Operationdefinition_parameterUse,
        visitor: Operationdefinition_parameterUse._Visitor<Result>
    ): Result => {
        switch (value) {
            case Operationdefinition_parameterUse.In:
                return visitor.in();
            case Operationdefinition_parameterUse.Out:
                return visitor.out();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Operationdefinition_parameterUse {
    export type In = "in" & {
        __In: void;
    };
    export type Out = "out" & {
        __Out: void;
    };

    export interface _Visitor<Result> {
        in: () => Result;
        out: () => Result;
        _unknown: () => Result;
    }
}
