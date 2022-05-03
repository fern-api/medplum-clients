export declare type Patient_linkType = Patient_linkType.Replaces | Patient_linkType.Refer | Patient_linkType.Seealso;
export declare const Patient_linkType: {
    Replaces: Patient_linkType.Replaces;
    Refer: Patient_linkType.Refer;
    Seealso: Patient_linkType.Seealso;
    _visit: <Result>(value: Patient_linkType, visitor: Patient_linkType._Visitor<Result>) => Result;
};
export declare namespace Patient_linkType {
    type Replaces = "replaces" & {
        __Replaces: void;
    };
    type Refer = "refer" & {
        __Refer: void;
    };
    type Seealso = "seealso" & {
        __Seealso: void;
    };
    interface _Visitor<Result> {
        replaces: () => Result;
        refer: () => Result;
        seealso: () => Result;
        _unknown: () => Result;
    }
}
