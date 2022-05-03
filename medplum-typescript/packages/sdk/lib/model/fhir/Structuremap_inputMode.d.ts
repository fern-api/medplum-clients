export declare type Structuremap_inputMode = Structuremap_inputMode.Source | Structuremap_inputMode.Target;
export declare const Structuremap_inputMode: {
    Source: Structuremap_inputMode.Source;
    Target: Structuremap_inputMode.Target;
    _visit: <Result>(value: Structuremap_inputMode, visitor: Structuremap_inputMode._Visitor<Result>) => Result;
};
export declare namespace Structuremap_inputMode {
    type Source = "source" & {
        __Source: void;
    };
    type Target = "target" & {
        __Target: void;
    };
    interface _Visitor<Result> {
        source: () => Result;
        target: () => Result;
        _unknown: () => Result;
    }
}
