export declare type Structuremap_structureMode = Structuremap_structureMode.Source | Structuremap_structureMode.Queried | Structuremap_structureMode.Target | Structuremap_structureMode.Produced;
export declare const Structuremap_structureMode: {
    Source: Structuremap_structureMode.Source;
    Queried: Structuremap_structureMode.Queried;
    Target: Structuremap_structureMode.Target;
    Produced: Structuremap_structureMode.Produced;
    _visit: <Result>(value: Structuremap_structureMode, visitor: Structuremap_structureMode._Visitor<Result>) => Result;
};
export declare namespace Structuremap_structureMode {
    type Source = "source" & {
        __Source: void;
    };
    type Queried = "queried" & {
        __Queried: void;
    };
    type Target = "target" & {
        __Target: void;
    };
    type Produced = "produced" & {
        __Produced: void;
    };
    interface _Visitor<Result> {
        source: () => Result;
        queried: () => Result;
        target: () => Result;
        produced: () => Result;
        _unknown: () => Result;
    }
}
