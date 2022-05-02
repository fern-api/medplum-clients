export type Documentreference_relatestoCode =
    | Documentreference_relatestoCode.Replaces
    | Documentreference_relatestoCode.Transforms
    | Documentreference_relatestoCode.Signs
    | Documentreference_relatestoCode.Appends;

export const Documentreference_relatestoCode = {
    Replaces: "replaces" as Documentreference_relatestoCode.Replaces,
    Transforms: "transforms" as Documentreference_relatestoCode.Transforms,
    Signs: "signs" as Documentreference_relatestoCode.Signs,
    Appends: "appends" as Documentreference_relatestoCode.Appends,

    _visit: <Result>(
        value: Documentreference_relatestoCode,
        visitor: Documentreference_relatestoCode._Visitor<Result>
    ): Result => {
        switch (value) {
            case Documentreference_relatestoCode.Replaces:
                return visitor.replaces();
            case Documentreference_relatestoCode.Transforms:
                return visitor.transforms();
            case Documentreference_relatestoCode.Signs:
                return visitor.signs();
            case Documentreference_relatestoCode.Appends:
                return visitor.appends();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Documentreference_relatestoCode {
    export type Replaces = "replaces" & {
        __Replaces: void;
    };
    export type Transforms = "transforms" & {
        __Transforms: void;
    };
    export type Signs = "signs" & {
        __Signs: void;
    };
    export type Appends = "appends" & {
        __Appends: void;
    };

    export interface _Visitor<Result> {
        replaces: () => Result;
        transforms: () => Result;
        signs: () => Result;
        appends: () => Result;
        _unknown: () => Result;
    }
}
