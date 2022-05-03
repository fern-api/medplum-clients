export declare type TestscriptStatus = TestscriptStatus.Draft | TestscriptStatus.Active | TestscriptStatus.Retired;
export declare const TestscriptStatus: {
    Draft: TestscriptStatus.Draft;
    Active: TestscriptStatus.Active;
    Retired: TestscriptStatus.Retired;
    _visit: <Result>(value: TestscriptStatus, visitor: TestscriptStatus._Visitor<Result>) => Result;
};
export declare namespace TestscriptStatus {
    type Draft = "draft" & {
        __Draft: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Retired = "retired" & {
        __Retired: void;
    };
    interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
