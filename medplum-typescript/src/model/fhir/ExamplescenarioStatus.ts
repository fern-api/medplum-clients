export type ExamplescenarioStatus =
    | ExamplescenarioStatus.Draft
    | ExamplescenarioStatus.Active
    | ExamplescenarioStatus.Retired;

export const ExamplescenarioStatus = {
    Draft: "draft" as ExamplescenarioStatus.Draft,
    Active: "active" as ExamplescenarioStatus.Active,
    Retired: "retired" as ExamplescenarioStatus.Retired,

    _visit: <Result>(value: ExamplescenarioStatus, visitor: ExamplescenarioStatus._Visitor<Result>): Result => {
        switch (value) {
            case ExamplescenarioStatus.Draft: return visitor.draft();
            case ExamplescenarioStatus.Active: return visitor.active();
            case ExamplescenarioStatus.Retired: return visitor.retired();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ExamplescenarioStatus {
    export type Draft = "draft" & {
        __Draft: void,
    };
    export type Active = "active" & {
        __Active: void,
    };
    export type Retired = "retired" & {
        __Retired: void,
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
