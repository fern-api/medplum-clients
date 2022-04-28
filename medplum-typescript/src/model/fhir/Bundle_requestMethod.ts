export type Bundle_requestMethod =
    | Bundle_requestMethod.Get
    | Bundle_requestMethod.Head
    | Bundle_requestMethod.Post
    | Bundle_requestMethod.Put
    | Bundle_requestMethod.Delete
    | Bundle_requestMethod.Patch;

export const Bundle_requestMethod = {
    Get: "GET" as Bundle_requestMethod.Get,
    Head: "HEAD" as Bundle_requestMethod.Head,
    Post: "POST" as Bundle_requestMethod.Post,
    Put: "PUT" as Bundle_requestMethod.Put,
    Delete: "DELETE" as Bundle_requestMethod.Delete,
    Patch: "PATCH" as Bundle_requestMethod.Patch,

    _visit: <Result>(value: Bundle_requestMethod, visitor: Bundle_requestMethod._Visitor<Result>): Result => {
        switch (value) {
            case Bundle_requestMethod.Get: return visitor.get();
            case Bundle_requestMethod.Head: return visitor.head();
            case Bundle_requestMethod.Post: return visitor.post();
            case Bundle_requestMethod.Put: return visitor.put();
            case Bundle_requestMethod.Delete: return visitor.delete();
            case Bundle_requestMethod.Patch: return visitor.patch();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Bundle_requestMethod {
    export type Get = "GET" & {
        __Get: void,
    };
    export type Head = "HEAD" & {
        __Head: void,
    };
    export type Post = "POST" & {
        __Post: void,
    };
    export type Put = "PUT" & {
        __Put: void,
    };
    export type Delete = "DELETE" & {
        __Delete: void,
    };
    export type Patch = "PATCH" & {
        __Patch: void,
    };

    export interface _Visitor<Result> {
        get: () => Result;
        head: () => Result;
        post: () => Result;
        put: () => Result;
        delete: () => Result;
        patch: () => Result;
        _unknown: () => Result;
    }
}
