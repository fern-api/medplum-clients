export type Visionprescription_lensspecificationEye =
    | Visionprescription_lensspecificationEye.Right
    | Visionprescription_lensspecificationEye.Left;

export const Visionprescription_lensspecificationEye = {
    Right: "right" as Visionprescription_lensspecificationEye.Right,
    Left: "left" as Visionprescription_lensspecificationEye.Left,

    _visit: <Result>(
        value: Visionprescription_lensspecificationEye,
        visitor: Visionprescription_lensspecificationEye._Visitor<Result>
    ): Result => {
        switch (value) {
            case Visionprescription_lensspecificationEye.Right:
                return visitor.right();
            case Visionprescription_lensspecificationEye.Left:
                return visitor.left();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Visionprescription_lensspecificationEye {
    export type Right = "right" & {
        __Right: void;
    };
    export type Left = "left" & {
        __Left: void;
    };

    export interface _Visitor<Result> {
        right: () => Result;
        left: () => Result;
        _unknown: () => Result;
    }
}
