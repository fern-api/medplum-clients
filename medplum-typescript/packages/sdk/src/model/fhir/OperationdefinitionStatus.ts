export type OperationdefinitionStatus =
    | OperationdefinitionStatus.Draft
    | OperationdefinitionStatus.Active
    | OperationdefinitionStatus.Retired;

export const OperationdefinitionStatus = {
    Draft: "draft" as OperationdefinitionStatus.Draft,
    Active: "active" as OperationdefinitionStatus.Active,
    Retired: "retired" as OperationdefinitionStatus.Retired,

    _visit: <Result>(
        value: OperationdefinitionStatus,
        visitor: OperationdefinitionStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case OperationdefinitionStatus.Draft:
                return visitor.draft();
            case OperationdefinitionStatus.Active:
                return visitor.active();
            case OperationdefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace OperationdefinitionStatus {
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
