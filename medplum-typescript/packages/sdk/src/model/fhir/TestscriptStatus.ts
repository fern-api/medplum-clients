export type TestscriptStatus =
    | TestscriptStatus.Draft
    | TestscriptStatus.Active
    | TestscriptStatus.Retired;

export const TestscriptStatus = {
    Draft: "draft" as TestscriptStatus.Draft,
    Active: "active" as TestscriptStatus.Active,
    Retired: "retired" as TestscriptStatus.Retired,

    _visit: <Result>(
        value: TestscriptStatus,
        visitor: TestscriptStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case TestscriptStatus.Draft:
                return visitor.draft();
            case TestscriptStatus.Active:
                return visitor.active();
            case TestscriptStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace TestscriptStatus {
    export type Draft = "draft" & {
        __Draft: void;
    };
    export type Active = "active" & {
        __Active: void;
    };
    export type Retired = "retired" & {
        __Retired: void;
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
