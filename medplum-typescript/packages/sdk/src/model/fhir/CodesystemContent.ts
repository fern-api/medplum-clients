export type CodesystemContent =
    | CodesystemContent.Example
    | CodesystemContent.Fragment
    | CodesystemContent.Complete
    | CodesystemContent.Supplement;

export const CodesystemContent = {
    Example: "example" as CodesystemContent.Example,
    Fragment: "fragment" as CodesystemContent.Fragment,
    Complete: "complete" as CodesystemContent.Complete,
    Supplement: "supplement" as CodesystemContent.Supplement,

    _visit: <Result>(
        value: CodesystemContent,
        visitor: CodesystemContent._Visitor<Result>
    ): Result => {
        switch (value) {
            case CodesystemContent.Example:
                return visitor.example();
            case CodesystemContent.Fragment:
                return visitor.fragment();
            case CodesystemContent.Complete:
                return visitor.complete();
            case CodesystemContent.Supplement:
                return visitor.supplement();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace CodesystemContent {
    export type Example = "example" & {
        __Example: void;
    };
    export type Fragment = "fragment" & {
        __Fragment: void;
    };
    export type Complete = "complete" & {
        __Complete: void;
    };
    export type Supplement = "supplement" & {
        __Supplement: void;
    };

    export interface _Visitor<Result> {
        example: () => Result;
        fragment: () => Result;
        complete: () => Result;
        supplement: () => Result;
        _unknown: () => Result;
    }
}
