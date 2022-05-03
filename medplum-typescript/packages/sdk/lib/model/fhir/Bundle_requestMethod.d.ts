export declare type Bundle_requestMethod = Bundle_requestMethod.Get | Bundle_requestMethod.Head | Bundle_requestMethod.Post | Bundle_requestMethod.Put | Bundle_requestMethod.Delete | Bundle_requestMethod.Patch;
export declare const Bundle_requestMethod: {
    Get: Bundle_requestMethod.Get;
    Head: Bundle_requestMethod.Head;
    Post: Bundle_requestMethod.Post;
    Put: Bundle_requestMethod.Put;
    Delete: Bundle_requestMethod.Delete;
    Patch: Bundle_requestMethod.Patch;
    _visit: <Result>(value: Bundle_requestMethod, visitor: Bundle_requestMethod._Visitor<Result>) => Result;
};
export declare namespace Bundle_requestMethod {
    type Get = "GET" & {
        __Get: void;
    };
    type Head = "HEAD" & {
        __Head: void;
    };
    type Post = "POST" & {
        __Post: void;
    };
    type Put = "PUT" & {
        __Put: void;
    };
    type Delete = "DELETE" & {
        __Delete: void;
    };
    type Patch = "PATCH" & {
        __Patch: void;
    };
    interface _Visitor<Result> {
        get: () => Result;
        head: () => Result;
        post: () => Result;
        put: () => Result;
        delete: () => Result;
        patch: () => Result;
        _unknown: () => Result;
    }
}
