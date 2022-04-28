export type Testscript_assertResponse =
    | Testscript_assertResponse.Okay
    | Testscript_assertResponse.Created
    | Testscript_assertResponse.NoContent
    | Testscript_assertResponse.NotModified
    | Testscript_assertResponse.Bad
    | Testscript_assertResponse.Forbidden
    | Testscript_assertResponse.NotFound
    | Testscript_assertResponse.MethodNotAllowed
    | Testscript_assertResponse.Conflict
    | Testscript_assertResponse.Gone
    | Testscript_assertResponse.PreconditionFailed
    | Testscript_assertResponse.Unprocessable;

export const Testscript_assertResponse = {
    Okay: "okay" as Testscript_assertResponse.Okay,
    Created: "created" as Testscript_assertResponse.Created,
    NoContent: "noContent" as Testscript_assertResponse.NoContent,
    NotModified: "notModified" as Testscript_assertResponse.NotModified,
    Bad: "bad" as Testscript_assertResponse.Bad,
    Forbidden: "forbidden" as Testscript_assertResponse.Forbidden,
    NotFound: "notFound" as Testscript_assertResponse.NotFound,
    MethodNotAllowed: "methodNotAllowed" as Testscript_assertResponse.MethodNotAllowed,
    Conflict: "conflict" as Testscript_assertResponse.Conflict,
    Gone: "gone" as Testscript_assertResponse.Gone,
    PreconditionFailed: "preconditionFailed" as Testscript_assertResponse.PreconditionFailed,
    Unprocessable: "unprocessable" as Testscript_assertResponse.Unprocessable,

    _visit: <Result>(value: Testscript_assertResponse, visitor: Testscript_assertResponse._Visitor<Result>): Result => {
        switch (value) {
            case Testscript_assertResponse.Okay: return visitor.okay();
            case Testscript_assertResponse.Created: return visitor.created();
            case Testscript_assertResponse.NoContent: return visitor.noContent();
            case Testscript_assertResponse.NotModified: return visitor.notModified();
            case Testscript_assertResponse.Bad: return visitor.bad();
            case Testscript_assertResponse.Forbidden: return visitor.forbidden();
            case Testscript_assertResponse.NotFound: return visitor.notFound();
            case Testscript_assertResponse.MethodNotAllowed: return visitor.methodNotAllowed();
            case Testscript_assertResponse.Conflict: return visitor.conflict();
            case Testscript_assertResponse.Gone: return visitor.gone();
            case Testscript_assertResponse.PreconditionFailed: return visitor.preconditionFailed();
            case Testscript_assertResponse.Unprocessable: return visitor.unprocessable();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Testscript_assertResponse {
    export type Okay = "okay" & {
        __Okay: void,
    };
    export type Created = "created" & {
        __Created: void,
    };
    export type NoContent = "noContent" & {
        __NoContent: void,
    };
    export type NotModified = "notModified" & {
        __NotModified: void,
    };
    export type Bad = "bad" & {
        __Bad: void,
    };
    export type Forbidden = "forbidden" & {
        __Forbidden: void,
    };
    export type NotFound = "notFound" & {
        __NotFound: void,
    };
    export type MethodNotAllowed = "methodNotAllowed" & {
        __MethodNotAllowed: void,
    };
    export type Conflict = "conflict" & {
        __Conflict: void,
    };
    export type Gone = "gone" & {
        __Gone: void,
    };
    export type PreconditionFailed = "preconditionFailed" & {
        __PreconditionFailed: void,
    };
    export type Unprocessable = "unprocessable" & {
        __Unprocessable: void,
    };

    export interface _Visitor<Result> {
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
