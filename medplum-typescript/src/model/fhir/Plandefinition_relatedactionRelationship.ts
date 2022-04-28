export type Plandefinition_relatedactionRelationship =
    | Plandefinition_relatedactionRelationship.Before
    | Plandefinition_relatedactionRelationship.Concurrent
    | Plandefinition_relatedactionRelationship.After;

export const Plandefinition_relatedactionRelationship = {
    Before: "before" as Plandefinition_relatedactionRelationship.Before,
    Concurrent: "concurrent" as Plandefinition_relatedactionRelationship.Concurrent,
    After: "after" as Plandefinition_relatedactionRelationship.After,

    _visit: <Result>(value: Plandefinition_relatedactionRelationship, visitor: Plandefinition_relatedactionRelationship._Visitor<Result>): Result => {
        switch (value) {
            case Plandefinition_relatedactionRelationship.Before: return visitor.before();
            case Plandefinition_relatedactionRelationship.Concurrent: return visitor.concurrent();
            case Plandefinition_relatedactionRelationship.After: return visitor.after();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Plandefinition_relatedactionRelationship {
    export type Before = "before" & {
        __Before: void,
    };
    export type Concurrent = "concurrent" & {
        __Concurrent: void,
    };
    export type After = "after" & {
        __After: void,
    };

    export interface _Visitor<Result> {
        before: () => Result;
        concurrent: () => Result;
        after: () => Result;
        _unknown: () => Result;
    }
}
