export type Testscript_operationMethod =
    | Testscript_operationMethod.Delete
    | Testscript_operationMethod.Get
    | Testscript_operationMethod.Options
    | Testscript_operationMethod.Patch
    | Testscript_operationMethod.Post
    | Testscript_operationMethod.Put
    | Testscript_operationMethod.Head;

export const Testscript_operationMethod = {
    Delete: "delete" as Testscript_operationMethod.Delete,
    Get: "get" as Testscript_operationMethod.Get,
    Options: "options" as Testscript_operationMethod.Options,
    Patch: "patch" as Testscript_operationMethod.Patch,
    Post: "post" as Testscript_operationMethod.Post,
    Put: "put" as Testscript_operationMethod.Put,
    Head: "head" as Testscript_operationMethod.Head,

    _visit: <Result>(value: Testscript_operationMethod, visitor: Testscript_operationMethod._Visitor<Result>): Result => {
        switch (value) {
            case Testscript_operationMethod.Delete: return visitor.delete();
            case Testscript_operationMethod.Get: return visitor.get();
            case Testscript_operationMethod.Options: return visitor.options();
            case Testscript_operationMethod.Patch: return visitor.patch();
            case Testscript_operationMethod.Post: return visitor.post();
            case Testscript_operationMethod.Put: return visitor.put();
            case Testscript_operationMethod.Head: return visitor.head();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Testscript_operationMethod {
    export type Delete = "delete" & {
        __Delete: void,
    };
    export type Get = "get" & {
        __Get: void,
    };
    export type Options = "options" & {
        __Options: void,
    };
    export type Patch = "patch" & {
        __Patch: void,
    };
    export type Post = "post" & {
        __Post: void,
    };
    export type Put = "put" & {
        __Put: void,
    };
    export type Head = "head" & {
        __Head: void,
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
