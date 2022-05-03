export declare type CompositionStatus = CompositionStatus.Preliminary | CompositionStatus.Final | CompositionStatus.Amended;
export declare const CompositionStatus: {
    Preliminary: CompositionStatus.Preliminary;
    Final: CompositionStatus.Final;
    Amended: CompositionStatus.Amended;
    _visit: <Result>(value: CompositionStatus, visitor: CompositionStatus._Visitor<Result>) => Result;
};
export declare namespace CompositionStatus {
    type Preliminary = "preliminary" & {
        __Preliminary: void;
    };
    type Final = "final" & {
        __Final: void;
    };
    type Amended = "amended" & {
        __Amended: void;
    };
    interface _Visitor<Result> {
        preliminary: () => Result;
        final: () => Result;
        amended: () => Result;
        _unknown: () => Result;
    }
}
