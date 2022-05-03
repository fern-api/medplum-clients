export declare type Testscript_assertResponse = Testscript_assertResponse.Okay | Testscript_assertResponse.Created | Testscript_assertResponse.NoContent | Testscript_assertResponse.NotModified | Testscript_assertResponse.Bad | Testscript_assertResponse.Forbidden | Testscript_assertResponse.NotFound | Testscript_assertResponse.MethodNotAllowed | Testscript_assertResponse.Conflict | Testscript_assertResponse.Gone | Testscript_assertResponse.PreconditionFailed | Testscript_assertResponse.Unprocessable;
export declare const Testscript_assertResponse: {
    Okay: Testscript_assertResponse.Okay;
    Created: Testscript_assertResponse.Created;
    NoContent: Testscript_assertResponse.NoContent;
    NotModified: Testscript_assertResponse.NotModified;
    Bad: Testscript_assertResponse.Bad;
    Forbidden: Testscript_assertResponse.Forbidden;
    NotFound: Testscript_assertResponse.NotFound;
    MethodNotAllowed: Testscript_assertResponse.MethodNotAllowed;
    Conflict: Testscript_assertResponse.Conflict;
    Gone: Testscript_assertResponse.Gone;
    PreconditionFailed: Testscript_assertResponse.PreconditionFailed;
    Unprocessable: Testscript_assertResponse.Unprocessable;
    _visit: <Result>(value: Testscript_assertResponse, visitor: Testscript_assertResponse._Visitor<Result>) => Result;
};
export declare namespace Testscript_assertResponse {
    type Okay = "okay" & {
        __Okay: void;
    };
    type Created = "created" & {
        __Created: void;
    };
    type NoContent = "noContent" & {
        __NoContent: void;
    };
    type NotModified = "notModified" & {
        __NotModified: void;
    };
    type Bad = "bad" & {
        __Bad: void;
    };
    type Forbidden = "forbidden" & {
        __Forbidden: void;
    };
    type NotFound = "notFound" & {
        __NotFound: void;
    };
    type MethodNotAllowed = "methodNotAllowed" & {
        __MethodNotAllowed: void;
    };
    type Conflict = "conflict" & {
        __Conflict: void;
    };
    type Gone = "gone" & {
        __Gone: void;
    };
    type PreconditionFailed = "preconditionFailed" & {
        __PreconditionFailed: void;
    };
    type Unprocessable = "unprocessable" & {
        __Unprocessable: void;
    };
    interface _Visitor<Result> {
        okay: () => Result;
        created: () => Result;
        noContent: () => Result;
        notModified: () => Result;
        bad: () => Result;
        forbidden: () => Result;
        notFound: () => Result;
        methodNotAllowed: () => Result;
        conflict: () => Result;
        gone: () => Result;
        preconditionFailed: () => Result;
        unprocessable: () => Result;
        _unknown: () => Result;
    }
}
