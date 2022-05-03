export type Testscript_assertRequestmethod =
    | Testscript_assertRequestmethod.Delete
    | Testscript_assertRequestmethod.Get
    | Testscript_assertRequestmethod.Options
    | Testscript_assertRequestmethod.Patch
    | Testscript_assertRequestmethod.Post
    | Testscript_assertRequestmethod.Put
    | Testscript_assertRequestmethod.Head;

export const Testscript_assertRequestmethod = {
    Delete: "delete" as Testscript_assertRequestmethod.Delete,
    Get: "get" as Testscript_assertRequestmethod.Get,
    Options: "options" as Testscript_assertRequestmethod.Options,
    Patch: "patch" as Testscript_assertRequestmethod.Patch,
    Post: "post" as Testscript_assertRequestmethod.Post,
    Put: "put" as Testscript_assertRequestmethod.Put,
    Head: "head" as Testscript_assertRequestmethod.Head,

    _visit: <Result>(
        value: Testscript_assertRequestmethod,
        visitor: Testscript_assertRequestmethod._Visitor<Result>
    ): Result => {
        switch (value) {
            case Testscript_assertRequestmethod.Delete:
                return visitor.delete();
            case Testscript_assertRequestmethod.Get:
                return visitor.get();
            case Testscript_assertRequestmethod.Options:
                return visitor.options();
            case Testscript_assertRequestmethod.Patch:
                return visitor.patch();
            case Testscript_assertRequestmethod.Post:
                return visitor.post();
            case Testscript_assertRequestmethod.Put:
                return visitor.put();
            case Testscript_assertRequestmethod.Head:
                return visitor.head();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Testscript_assertRequestmethod {
    export type Delete = "delete" & {
        __Delete: void;
    };
    export type Get = "get" & {
        __Get: void;
    };
    export type Options = "options" & {
        __Options: void;
    };
    export type Patch = "patch" & {
        __Patch: void;
    };
    export type Post = "post" & {
        __Post: void;
    };
    export type Put = "put" & {
        __Put: void;
    };
    export type Head = "head" & {
        __Head: void;
    };

    export interface _Visitor<Result> {
        delete: () => Result;
        get: () => Result;
        options: () => Result;
        patch: () => Result;
        post: () => Result;
        put: () => Result;
        head: () => Result;
        _unknown: () => Result;
    }
}
