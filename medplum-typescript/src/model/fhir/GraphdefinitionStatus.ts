export type GraphdefinitionStatus =
    | GraphdefinitionStatus.Draft
    | GraphdefinitionStatus.Active
    | GraphdefinitionStatus.Retired;

export const GraphdefinitionStatus = {
    Draft: "draft" as GraphdefinitionStatus.Draft,
    Active: "active" as GraphdefinitionStatus.Active,
    Retired: "retired" as GraphdefinitionStatus.Retired,

    _visit: <Result>(
        value: GraphdefinitionStatus,
        visitor: GraphdefinitionStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case GraphdefinitionStatus.Draft:
                return visitor.draft();
            case GraphdefinitionStatus.Active:
                return visitor.active();
            case GraphdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace GraphdefinitionStatus {
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
