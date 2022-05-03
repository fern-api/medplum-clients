export declare type Visionprescription_prismBase = Visionprescription_prismBase.Up | Visionprescription_prismBase.Down | Visionprescription_prismBase.In | Visionprescription_prismBase.Out;
export declare const Visionprescription_prismBase: {
    Up: Visionprescription_prismBase.Up;
    Down: Visionprescription_prismBase.Down;
    In: Visionprescription_prismBase.In;
    Out: Visionprescription_prismBase.Out;
    _visit: <Result>(value: Visionprescription_prismBase, visitor: Visionprescription_prismBase._Visitor<Result>) => Result;
};
export declare namespace Visionprescription_prismBase {
    type Up = "up" & {
        __Up: void;
    };
    type Down = "down" & {
        __Down: void;
    };
    type In = "in" & {
        __In: void;
    };
    type Out = "out" & {
        __Out: void;
    };
    interface _Visitor<Result> {
        up: () => Result;
        down: () => Result;
        in: () => Result;
        out: () => Result;
        _unknown: () => Result;
    }
}
