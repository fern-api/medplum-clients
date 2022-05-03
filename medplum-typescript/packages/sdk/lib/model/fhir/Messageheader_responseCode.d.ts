export declare type Messageheader_responseCode = Messageheader_responseCode.Ok;
export declare const Messageheader_responseCode: {
    Ok: Messageheader_responseCode.Ok;
    _visit: <Result>(value: Messageheader_responseCode, visitor: Messageheader_responseCode._Visitor<Result>) => Result;
};
export declare namespace Messageheader_responseCode {
    type Ok = "ok" & {
        __Ok: void;
    };
    interface _Visitor<Result> {
        ok: () => Result;
        _unknown: () => Result;
    }
}
