export declare type Testscript_assertDirection = Testscript_assertDirection.Response | Testscript_assertDirection.Request;
export declare const Testscript_assertDirection: {
    Response: Testscript_assertDirection.Response;
    Request: Testscript_assertDirection.Request;
    _visit: <Result>(value: Testscript_assertDirection, visitor: Testscript_assertDirection._Visitor<Result>) => Result;
};
export declare namespace Testscript_assertDirection {
    type Response = "response" & {
        __Response: void;
    };
    type Request = "request" & {
        __Request: void;
    };
    interface _Visitor<Result> {
        response: () => Result;
        request: () => Result;
        _unknown: () => Result;
    }
}
