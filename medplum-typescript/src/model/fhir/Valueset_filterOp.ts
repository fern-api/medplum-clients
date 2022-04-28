export type Valueset_filterOp =
    | Valueset_filterOp.Regex
    | Valueset_filterOp.In
    | Valueset_filterOp.Generalizes
    | Valueset_filterOp.Exists;

export const Valueset_filterOp = {
    Regex: "regex" as Valueset_filterOp.Regex,
    In: "in" as Valueset_filterOp.In,
    Generalizes: "generalizes" as Valueset_filterOp.Generalizes,
    Exists: "exists" as Valueset_filterOp.Exists,

    _visit: <Result>(value: Valueset_filterOp, visitor: Valueset_filterOp._Visitor<Result>): Result => {
        switch (value) {
            case Valueset_filterOp.Regex: return visitor.regex();
            case Valueset_filterOp.In: return visitor.in();
            case Valueset_filterOp.Generalizes: return visitor.generalizes();
            case Valueset_filterOp.Exists: return visitor.exists();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Valueset_filterOp {
    export type Regex = "regex" & {
        __Regex: void,
    };
    export type In = "in" & {
        __In: void,
    };
    export type Generalizes = "generalizes" & {
        __Generalizes: void,
    };
    export type Exists = "exists" & {
        __Exists: void,
    };

    export interface _Visitor<Result> {
        regex: () => Result;
        in: () => Result;
        generalizes: () => Result;
        exists: () => Result;
        _unknown: () => Result;
    }
}
