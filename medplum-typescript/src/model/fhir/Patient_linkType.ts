export type Patient_linkType =
    | Patient_linkType.Replaces
    | Patient_linkType.Refer
    | Patient_linkType.Seealso;

export const Patient_linkType = {
    Replaces: "replaces" as Patient_linkType.Replaces,
    Refer: "refer" as Patient_linkType.Refer,
    Seealso: "seealso" as Patient_linkType.Seealso,

    _visit: <Result>(value: Patient_linkType, visitor: Patient_linkType._Visitor<Result>): Result => {
        switch (value) {
            case Patient_linkType.Replaces: return visitor.replaces();
            case Patient_linkType.Refer: return visitor.refer();
            case Patient_linkType.Seealso: return visitor.seealso();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Patient_linkType {
    export type Replaces = "replaces" & {
        __Replaces: void,
    };
    export type Refer = "refer" & {
        __Refer: void,
    };
    export type Seealso = "seealso" & {
        __Seealso: void,
    };

    export interface _Visitor<Result> {
        replaces: () => Result;
        refer: () => Result;
        seealso: () => Result;
        _unknown: () => Result;
    }
}
