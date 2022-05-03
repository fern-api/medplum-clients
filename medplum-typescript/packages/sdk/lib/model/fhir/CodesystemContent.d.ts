export declare type CodesystemContent = CodesystemContent.Example | CodesystemContent.Fragment | CodesystemContent.Complete | CodesystemContent.Supplement;
export declare const CodesystemContent: {
    Example: CodesystemContent.Example;
    Fragment: CodesystemContent.Fragment;
    Complete: CodesystemContent.Complete;
    Supplement: CodesystemContent.Supplement;
    _visit: <Result>(value: CodesystemContent, visitor: CodesystemContent._Visitor<Result>) => Result;
};
export declare namespace CodesystemContent {
    type Example = "example" & {
        __Example: void;
    };
    type Fragment = "fragment" & {
        __Fragment: void;
    };
    type Complete = "complete" & {
        __Complete: void;
    };
    type Supplement = "supplement" & {
        __Supplement: void;
    };
    interface _Visitor<Result> {
        example: () => Result;
        fragment: () => Result;
        complete: () => Result;
        supplement: () => Result;
        _unknown: () => Result;
    }
}
