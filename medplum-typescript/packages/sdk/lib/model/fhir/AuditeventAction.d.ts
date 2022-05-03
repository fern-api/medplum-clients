export declare type AuditeventAction = AuditeventAction.C | AuditeventAction.R | AuditeventAction.U | AuditeventAction.D | AuditeventAction.E;
export declare const AuditeventAction: {
    C: AuditeventAction.C;
    R: AuditeventAction.R;
    U: AuditeventAction.U;
    D: AuditeventAction.D;
    E: AuditeventAction.E;
    _visit: <Result>(value: AuditeventAction, visitor: AuditeventAction._Visitor<Result>) => Result;
};
export declare namespace AuditeventAction {
    type C = "C" & {
        __C: void;
    };
    type R = "R" & {
        __R: void;
    };
    type U = "U" & {
        __U: void;
    };
    type D = "D" & {
        __D: void;
    };
    type E = "E" & {
        __E: void;
    };
    interface _Visitor<Result> {
        c: () => Result;
        r: () => Result;
        u: () => Result;
        d: () => Result;
        e: () => Result;
        _unknown: () => Result;
    }
}
