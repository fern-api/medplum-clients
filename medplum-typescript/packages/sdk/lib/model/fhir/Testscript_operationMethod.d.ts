export declare type Testscript_operationMethod = Testscript_operationMethod.Delete | Testscript_operationMethod.Get | Testscript_operationMethod.Options | Testscript_operationMethod.Patch | Testscript_operationMethod.Post | Testscript_operationMethod.Put | Testscript_operationMethod.Head;
export declare const Testscript_operationMethod: {
    Delete: Testscript_operationMethod.Delete;
    Get: Testscript_operationMethod.Get;
    Options: Testscript_operationMethod.Options;
    Patch: Testscript_operationMethod.Patch;
    Post: Testscript_operationMethod.Post;
    Put: Testscript_operationMethod.Put;
    Head: Testscript_operationMethod.Head;
    _visit: <Result>(value: Testscript_operationMethod, visitor: Testscript_operationMethod._Visitor<Result>) => Result;
};
export declare namespace Testscript_operationMethod {
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
