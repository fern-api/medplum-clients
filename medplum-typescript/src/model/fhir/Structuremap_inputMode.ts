export type Structuremap_inputMode =
    | Structuremap_inputMode.Source
    | Structuremap_inputMode.Target;

export const Structuremap_inputMode = {
    Source: "source" as Structuremap_inputMode.Source,
    Target: "target" as Structuremap_inputMode.Target,

    _visit: <Result>(value: Structuremap_inputMode, visitor: Structuremap_inputMode._Visitor<Result>): Result => {
        switch (value) {
            case Structuremap_inputMode.Source: return visitor.source();
            case Structuremap_inputMode.Target: return visitor.target();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Structuremap_inputMode {
    export type Source = "source" & {
        __Source: void,
    };
    export type Target = "target" & {
        __Target: void,
    };

    export interface _Visitor<Result> {
        source: () => Result;
        target: () => Result;
        _unknown: () => Result;
    }
}
