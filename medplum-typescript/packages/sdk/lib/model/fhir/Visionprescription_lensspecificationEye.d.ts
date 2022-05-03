export declare type Visionprescription_lensspecificationEye = Visionprescription_lensspecificationEye.Right | Visionprescription_lensspecificationEye.Left;
export declare const Visionprescription_lensspecificationEye: {
    Right: Visionprescription_lensspecificationEye.Right;
    Left: Visionprescription_lensspecificationEye.Left;
    _visit: <Result>(value: Visionprescription_lensspecificationEye, visitor: Visionprescription_lensspecificationEye._Visitor<Result>) => Result;
};
export declare namespace Visionprescription_lensspecificationEye {
    type Right = "right" & {
        __Right: void;
    };
    type Left = "left" & {
        __Left: void;
    };
    interface _Visitor<Result> {
        right: () => Result;
        left: () => Result;
        _unknown: () => Result;
    }
}
