export type ImplementationguideStatus =
    | ImplementationguideStatus.Draft
    | ImplementationguideStatus.Active
    | ImplementationguideStatus.Retired;

export const ImplementationguideStatus = {
    Draft: "draft" as ImplementationguideStatus.Draft,
    Active: "active" as ImplementationguideStatus.Active,
    Retired: "retired" as ImplementationguideStatus.Retired,

    _visit: <Result>(
        value: ImplementationguideStatus,
        visitor: ImplementationguideStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case ImplementationguideStatus.Draft:
                return visitor.draft();
            case ImplementationguideStatus.Active:
                return visitor.active();
            case ImplementationguideStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace ImplementationguideStatus {
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
