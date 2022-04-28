export type Plandefinition_actionRequiredbehavior =
    | Plandefinition_actionRequiredbehavior.Must
    | Plandefinition_actionRequiredbehavior.Could;

export const Plandefinition_actionRequiredbehavior = {
    Must: "must" as Plandefinition_actionRequiredbehavior.Must,
    Could: "could" as Plandefinition_actionRequiredbehavior.Could,

    _visit: <Result>(value: Plandefinition_actionRequiredbehavior, visitor: Plandefinition_actionRequiredbehavior._Visitor<Result>): Result => {
        switch (value) {
            case Plandefinition_actionRequiredbehavior.Must: return visitor.must();
            case Plandefinition_actionRequiredbehavior.Could: return visitor.could();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Plandefinition_actionRequiredbehavior {
    export type Must = "must" & {
        __Must: void,
    };
    export type Could = "could" & {
        __Could: void,
    };

    export interface _Visitor<Result> {
        must: () => Result;
        could: () => Result;
        _unknown: () => Result;
    }
}
