export declare type ExamplescenarioStatus = ExamplescenarioStatus.Draft | ExamplescenarioStatus.Active | ExamplescenarioStatus.Retired;
export declare const ExamplescenarioStatus: {
    Draft: ExamplescenarioStatus.Draft;
    Active: ExamplescenarioStatus.Active;
    Retired: ExamplescenarioStatus.Retired;
    _visit: <Result>(value: ExamplescenarioStatus, visitor: ExamplescenarioStatus._Visitor<Result>) => Result;
};
export declare namespace ExamplescenarioStatus {
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
