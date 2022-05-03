export declare type Conceptmap_unmappedMode = Conceptmap_unmappedMode.Provided | Conceptmap_unmappedMode.Fixed;
export declare const Conceptmap_unmappedMode: {
    Provided: Conceptmap_unmappedMode.Provided;
    Fixed: Conceptmap_unmappedMode.Fixed;
    _visit: <Result>(value: Conceptmap_unmappedMode, visitor: Conceptmap_unmappedMode._Visitor<Result>) => Result;
};
export declare namespace Conceptmap_unmappedMode {
    type Provided = "provided" & {
        __Provided: void;
    };
    type Fixed = "fixed" & {
        __Fixed: void;
    };
    interface _Visitor<Result> {
        provided: () => Result;
        fixed: () => Result;
        _unknown: () => Result;
    }
}
