export type MessagedefinitionStatus =
    | MessagedefinitionStatus.Draft
    | MessagedefinitionStatus.Active
    | MessagedefinitionStatus.Retired;

export const MessagedefinitionStatus = {
    Draft: "draft" as MessagedefinitionStatus.Draft,
    Active: "active" as MessagedefinitionStatus.Active,
    Retired: "retired" as MessagedefinitionStatus.Retired,

    _visit: <Result>(
        value: MessagedefinitionStatus,
        visitor: MessagedefinitionStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case MessagedefinitionStatus.Draft:
                return visitor.draft();
            case MessagedefinitionStatus.Active:
                return visitor.active();
            case MessagedefinitionStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace MessagedefinitionStatus {
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
