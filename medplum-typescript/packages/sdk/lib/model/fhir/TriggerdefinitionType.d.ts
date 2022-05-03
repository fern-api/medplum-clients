export declare type TriggerdefinitionType = TriggerdefinitionType.Periodic;
export declare const TriggerdefinitionType: {
    Periodic: TriggerdefinitionType.Periodic;
    _visit: <Result>(value: TriggerdefinitionType, visitor: TriggerdefinitionType._Visitor<Result>) => Result;
};
export declare namespace TriggerdefinitionType {
    type Periodic = "periodic" & {
        __Periodic: void;
    };
    interface _Visitor<Result> {
        periodic: () => Result;
        _unknown: () => Result;
    }
}
