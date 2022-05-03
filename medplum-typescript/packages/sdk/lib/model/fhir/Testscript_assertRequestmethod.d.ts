export declare type Testscript_assertRequestmethod = Testscript_assertRequestmethod.Delete | Testscript_assertRequestmethod.Get | Testscript_assertRequestmethod.Options | Testscript_assertRequestmethod.Patch | Testscript_assertRequestmethod.Post | Testscript_assertRequestmethod.Put | Testscript_assertRequestmethod.Head;
export declare const Testscript_assertRequestmethod: {
    Delete: Testscript_assertRequestmethod.Delete;
    Get: Testscript_assertRequestmethod.Get;
    Options: Testscript_assertRequestmethod.Options;
    Patch: Testscript_assertRequestmethod.Patch;
    Post: Testscript_assertRequestmethod.Post;
    Put: Testscript_assertRequestmethod.Put;
    Head: Testscript_assertRequestmethod.Head;
    _visit: <Result>(value: Testscript_assertRequestmethod, visitor: Testscript_assertRequestmethod._Visitor<Result>) => Result;
};
export declare namespace Testscript_assertRequestmethod {
    type Delete = "delete" & {
        __Delete: void;
    };
    type Get = "get" & {
        __Get: void;
    };
    type Options = "options" & {
        __Options: void;
    };
    type Patch = "patch" & {
        __Patch: void;
    };
    type Post = "post" & {
        __Post: void;
    };
    type Put = "put" & {
        __Put: void;
    };
    type Head = "head" & {
        __Head: void;
    };
    interface _Visitor<Result> {
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
