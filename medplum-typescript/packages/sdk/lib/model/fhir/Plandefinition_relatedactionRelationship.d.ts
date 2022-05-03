export declare type Plandefinition_relatedactionRelationship = Plandefinition_relatedactionRelationship.Before | Plandefinition_relatedactionRelationship.Concurrent | Plandefinition_relatedactionRelationship.After;
export declare const Plandefinition_relatedactionRelationship: {
    Before: Plandefinition_relatedactionRelationship.Before;
    Concurrent: Plandefinition_relatedactionRelationship.Concurrent;
    After: Plandefinition_relatedactionRelationship.After;
    _visit: <Result>(value: Plandefinition_relatedactionRelationship, visitor: Plandefinition_relatedactionRelationship._Visitor<Result>) => Result;
};
export declare namespace Plandefinition_relatedactionRelationship {
    type Before = "before" & {
        __Before: void;
    };
    type Concurrent = "concurrent" & {
        __Concurrent: void;
    };
    type After = "after" & {
        __After: void;
    };
    interface _Visitor<Result> {
        before: () => Result;
        concurrent: () => Result;
        after: () => Result;
        _unknown: () => Result;
    }
}
