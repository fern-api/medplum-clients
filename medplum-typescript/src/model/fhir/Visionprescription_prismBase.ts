export type Visionprescription_prismBase =
    | Visionprescription_prismBase.Up
    | Visionprescription_prismBase.Down
    | Visionprescription_prismBase.In
    | Visionprescription_prismBase.Out;

export const Visionprescription_prismBase = {
    Up: "up" as Visionprescription_prismBase.Up,
    Down: "down" as Visionprescription_prismBase.Down,
    In: "in" as Visionprescription_prismBase.In,
    Out: "out" as Visionprescription_prismBase.Out,

    _visit: <Result>(value: Visionprescription_prismBase, visitor: Visionprescription_prismBase._Visitor<Result>): Result => {
        switch (value) {
            case Visionprescription_prismBase.Up: return visitor.up();
            case Visionprescription_prismBase.Down: return visitor.down();
            case Visionprescription_prismBase.In: return visitor.in();
            case Visionprescription_prismBase.Out: return visitor.out();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Visionprescription_prismBase {
    export type Up = "up" & {
        __Up: void,
    };
    export type Down = "down" & {
        __Down: void,
    };
    export type In = "in" & {
        __In: void,
    };
    export type Out = "out" & {
        __Out: void,
    };

    export interface _Visitor<Result> {
        up: () => Result;
        down: () => Result;
        in: () => Result;
        out: () => Result;
        _unknown: () => Result;
    }
}
