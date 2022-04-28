export type Testscript_assertDirection =
    | Testscript_assertDirection.Response
    | Testscript_assertDirection.Request;

export const Testscript_assertDirection = {
    Response: "response" as Testscript_assertDirection.Response,
    Request: "request" as Testscript_assertDirection.Request,

    _visit: <Result>(value: Testscript_assertDirection, visitor: Testscript_assertDirection._Visitor<Result>): Result => {
        switch (value) {
            case Testscript_assertDirection.Response: return visitor.response();
            case Testscript_assertDirection.Request: return visitor.request();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Testscript_assertDirection {
    export type Response = "response" & {
        __Response: void,
    };
    export type Request = "request" & {
        __Request: void,
    };

    export interface _Visitor<Result> {
        response: () => Result;
        request: () => Result;
        _unknown: () => Result;
    }
}
