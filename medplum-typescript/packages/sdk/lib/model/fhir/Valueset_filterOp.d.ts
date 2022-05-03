export declare type Valueset_filterOp = Valueset_filterOp.Regex | Valueset_filterOp.In | Valueset_filterOp.Generalizes | Valueset_filterOp.Exists;
export declare const Valueset_filterOp: {
    Regex: Valueset_filterOp.Regex;
    In: Valueset_filterOp.In;
    Generalizes: Valueset_filterOp.Generalizes;
    Exists: Valueset_filterOp.Exists;
    _visit: <Result>(value: Valueset_filterOp, visitor: Valueset_filterOp._Visitor<Result>) => Result;
};
export declare namespace Valueset_filterOp {
    type Regex = "regex" & {
        __Regex: void;
    };
    type In = "in" & {
        __In: void;
    };
    type Generalizes = "generalizes" & {
        __Generalizes: void;
    };
    type Exists = "exists" & {
        __Exists: void;
    };
    interface _Visitor<Result> {
        regex: () => Result;
        in: () => Result;
        generalizes: () => Result;
        exists: () => Result;
        _unknown: () => Result;
    }
}
