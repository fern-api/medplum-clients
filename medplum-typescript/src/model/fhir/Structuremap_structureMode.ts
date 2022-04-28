export type Structuremap_structureMode =
    | Structuremap_structureMode.Source
    | Structuremap_structureMode.Queried
    | Structuremap_structureMode.Target
    | Structuremap_structureMode.Produced;

export const Structuremap_structureMode = {
    Source: "source" as Structuremap_structureMode.Source,
    Queried: "queried" as Structuremap_structureMode.Queried,
    Target: "target" as Structuremap_structureMode.Target,
    Produced: "produced" as Structuremap_structureMode.Produced,

    _visit: <Result>(value: Structuremap_structureMode, visitor: Structuremap_structureMode._Visitor<Result>): Result => {
        switch (value) {
            case Structuremap_structureMode.Source: return visitor.source();
            case Structuremap_structureMode.Queried: return visitor.queried();
            case Structuremap_structureMode.Target: return visitor.target();
            case Structuremap_structureMode.Produced: return visitor.produced();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Structuremap_structureMode {
    export type Source = "source" & {
        __Source: void,
    };
    export type Queried = "queried" & {
        __Queried: void,
    };
    export type Target = "target" & {
        __Target: void,
    };
    export type Produced = "produced" & {
        __Produced: void,
    };

    export interface _Visitor<Result> {
        source: () => Result;
        queried: () => Result;
        target: () => Result;
        produced: () => Result;
        _unknown: () => Result;
    }
}
