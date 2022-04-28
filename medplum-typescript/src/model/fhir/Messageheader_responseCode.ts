export type Messageheader_responseCode =
    | Messageheader_responseCode.Ok;

export const Messageheader_responseCode = {
    Ok: "ok" as Messageheader_responseCode.Ok,

    _visit: <Result>(value: Messageheader_responseCode, visitor: Messageheader_responseCode._Visitor<Result>): Result => {
        switch (value) {
            case Messageheader_responseCode.Ok: return visitor.ok();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Messageheader_responseCode {
    export type Ok = "ok" & {
        __Ok: void,
    };

    export interface _Visitor<Result> {
        ok: () => Result;
        _unknown: () => Result;
    }
}
