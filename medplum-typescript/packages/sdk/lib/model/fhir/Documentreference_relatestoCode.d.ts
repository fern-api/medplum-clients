export declare type Documentreference_relatestoCode = Documentreference_relatestoCode.Replaces | Documentreference_relatestoCode.Transforms | Documentreference_relatestoCode.Signs | Documentreference_relatestoCode.Appends;
export declare const Documentreference_relatestoCode: {
    Replaces: Documentreference_relatestoCode.Replaces;
    Transforms: Documentreference_relatestoCode.Transforms;
    Signs: Documentreference_relatestoCode.Signs;
    Appends: Documentreference_relatestoCode.Appends;
    _visit: <Result>(value: Documentreference_relatestoCode, visitor: Documentreference_relatestoCode._Visitor<Result>) => Result;
};
export declare namespace Documentreference_relatestoCode {
    type Replaces = "replaces" & {
        __Replaces: void;
    };
    type Transforms = "transforms" & {
        __Transforms: void;
    };
    type Signs = "signs" & {
        __Signs: void;
    };
    type Appends = "appends" & {
        __Appends: void;
    };
    interface _Visitor<Result> {
        replaces: () => Result;
        transforms: () => Result;
        signs: () => Result;
        appends: () => Result;
        _unknown: () => Result;
    }
}
