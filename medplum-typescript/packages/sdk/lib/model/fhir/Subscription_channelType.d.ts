export declare type Subscription_channelType = Subscription_channelType.Websocket | Subscription_channelType.Email | Subscription_channelType.Sms | Subscription_channelType.Message;
export declare const Subscription_channelType: {
    Websocket: Subscription_channelType.Websocket;
    Email: Subscription_channelType.Email;
    Sms: Subscription_channelType.Sms;
    Message: Subscription_channelType.Message;
    _visit: <Result>(value: Subscription_channelType, visitor: Subscription_channelType._Visitor<Result>) => Result;
};
export declare namespace Subscription_channelType {
    type Websocket = "websocket" & {
        __Websocket: void;
    };
    type Email = "email" & {
        __Email: void;
    };
    type Sms = "sms" & {
        __Sms: void;
    };
    type Message = "message" & {
        __Message: void;
    };
    interface _Visitor<Result> {
        websocket: () => Result;
        email: () => Result;
        sms: () => Result;
        message: () => Result;
        _unknown: () => Result;
    }
}
