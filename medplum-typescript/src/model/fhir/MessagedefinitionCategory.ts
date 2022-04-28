export type MessagedefinitionCategory =
    | MessagedefinitionCategory.Consequence
    | MessagedefinitionCategory.Currency
    | MessagedefinitionCategory.Notification;

export const MessagedefinitionCategory = {
    Consequence: "consequence" as MessagedefinitionCategory.Consequence,
    Currency: "currency" as MessagedefinitionCategory.Currency,
    Notification: "notification" as MessagedefinitionCategory.Notification,

    _visit: <Result>(value: MessagedefinitionCategory, visitor: MessagedefinitionCategory._Visitor<Result>): Result => {
        switch (value) {
            case MessagedefinitionCategory.Consequence: return visitor.consequence();
            case MessagedefinitionCategory.Currency: return visitor.currency();
            case MessagedefinitionCategory.Notification: return visitor.notification();
            default: return visitor._unknown();
        }
    },
};

export declare namespace MessagedefinitionCategory {
    export type Consequence = "consequence" & {
        __Consequence: void,
    };
    export type Currency = "currency" & {
        __Currency: void,
    };
    export type Notification = "notification" & {
        __Notification: void,
    };

    export interface _Visitor<Result> {
        consequence: () => Result;
        currency: () => Result;
        notification: () => Result;
        _unknown: () => Result;
    }
}
