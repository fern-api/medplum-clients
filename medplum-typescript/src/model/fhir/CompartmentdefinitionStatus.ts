export type CompartmentdefinitionStatus =
    | CompartmentdefinitionStatus.Draft
    | CompartmentdefinitionStatus.Active
    | CompartmentdefinitionStatus.Retired;

export const CompartmentdefinitionStatus = {
    Draft: "draft" as CompartmentdefinitionStatus.Draft,
    Active: "active" as CompartmentdefinitionStatus.Active,
    Retired: "retired" as CompartmentdefinitionStatus.Retired,

    _visit: <Result>(
        value: CompartmentdefinitionStatus,
        visitor: CompartmentdefinitionStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case CompartmentdefinitionStatus.Draft:
                return visitor.draft();
            case CompartmentdefinitionStatus.Active:
                return visitor.active();
            case CompartmentdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace CompartmentdefinitionStatus {
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
