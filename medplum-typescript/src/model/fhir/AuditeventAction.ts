export type AuditeventAction =
    | AuditeventAction.C
    | AuditeventAction.R
    | AuditeventAction.U
    | AuditeventAction.D
    | AuditeventAction.E;

export const AuditeventAction = {
    C: "C" as AuditeventAction.C,
    R: "R" as AuditeventAction.R,
    U: "U" as AuditeventAction.U,
    D: "D" as AuditeventAction.D,
    E: "E" as AuditeventAction.E,

    _visit: <Result>(
        value: AuditeventAction,
        visitor: AuditeventAction._Visitor<Result>
    ): Result => {
        switch (value) {
            case AuditeventAction.C:
                return visitor.c();
            case AuditeventAction.R:
                return visitor.r();
            case AuditeventAction.U:
                return visitor.u();
            case AuditeventAction.D:
                return visitor.d();
            case AuditeventAction.E:
                return visitor.e();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace AuditeventAction {
    export type C = "C" & {
        __C: void;
    };
    export type R = "R" & {
        __R: void;
    };
    export type U = "U" & {
        __U: void;
    };
    export type D = "D" & {
        __D: void;
    };
    export type E = "E" & {
        __E: void;
    };

    export interface _Visitor<Result> {
        c: () => Result;
        r: () => Result;
        u: () => Result;
        d: () => Result;
        e: () => Result;
        _unknown: () => Result;
    }
}
