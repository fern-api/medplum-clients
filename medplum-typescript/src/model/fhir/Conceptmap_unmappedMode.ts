export type Conceptmap_unmappedMode =
    | Conceptmap_unmappedMode.Provided
    | Conceptmap_unmappedMode.Fixed;

export const Conceptmap_unmappedMode = {
    Provided: "provided" as Conceptmap_unmappedMode.Provided,
    Fixed: "fixed" as Conceptmap_unmappedMode.Fixed,

    _visit: <Result>(value: Conceptmap_unmappedMode, visitor: Conceptmap_unmappedMode._Visitor<Result>): Result => {
        switch (value) {
            case Conceptmap_unmappedMode.Provided: return visitor.provided();
            case Conceptmap_unmappedMode.Fixed: return visitor.fixed();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Conceptmap_unmappedMode {
    export type Provided = "provided" & {
        __Provided: void,
    };
    export type Fixed = "fixed" & {
        __Fixed: void,
    };

    export interface _Visitor<Result> {
        provided: () => Result;
        fixed: () => Result;
        _unknown: () => Result;
    }
}
