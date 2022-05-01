export type Subscription_channelType =
    | Subscription_channelType.Websocket
    | Subscription_channelType.Email
    | Subscription_channelType.Sms
    | Subscription_channelType.Message;

export const Subscription_channelType = {
    Websocket: "websocket" as Subscription_channelType.Websocket,
    Email: "email" as Subscription_channelType.Email,
    Sms: "sms" as Subscription_channelType.Sms,
    Message: "message" as Subscription_channelType.Message,

    _visit: <Result>(
        value: Subscription_channelType,
        visitor: Subscription_channelType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Subscription_channelType.Websocket:
                return visitor.websocket();
            case Subscription_channelType.Email:
                return visitor.email();
            case Subscription_channelType.Sms:
                return visitor.sms();
            case Subscription_channelType.Message:
                return visitor.message();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Subscription_channelType {
    export type Websocket = "websocket" & {
        __Websocket: void;
    };
    export type Email = "email" & {
        __Email: void;
    };
    export type Sms = "sms" & {
        __Sms: void;
    };
    export type Message = "message" & {
        __Message: void;
    };

    export interface _Visitor<Result> {
        websocket: () => Result;
        email: () => Result;
        sms: () => Result;
        message: () => Result;
        _unknown: () => Result;
    }
}
