export declare type MessagedefinitionCategory = MessagedefinitionCategory.Consequence | MessagedefinitionCategory.Currency | MessagedefinitionCategory.Notification;
export declare const MessagedefinitionCategory: {
    Consequence: MessagedefinitionCategory.Consequence;
    Currency: MessagedefinitionCategory.Currency;
    Notification: MessagedefinitionCategory.Notification;
    _visit: <Result>(value: MessagedefinitionCategory, visitor: MessagedefinitionCategory._Visitor<Result>) => Result;
};
export declare namespace MessagedefinitionCategory {
    type Consequence = "consequence" & {
        __Consequence: void;
    };
    type Currency = "currency" & {
        __Currency: void;
    };
    type Notification = "notification" & {
        __Notification: void;
    };
    interface _Visitor<Result> {
        consequence: () => Result;
        currency: () => Result;
        notification: () => Result;
        _unknown: () => Result;
    }
}
