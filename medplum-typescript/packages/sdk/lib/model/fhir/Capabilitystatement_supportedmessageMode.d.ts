export declare type Capabilitystatement_supportedmessageMode = Capabilitystatement_supportedmessageMode.Sender | Capabilitystatement_supportedmessageMode.Receiver;
export declare const Capabilitystatement_supportedmessageMode: {
    Sender: Capabilitystatement_supportedmessageMode.Sender;
    Receiver: Capabilitystatement_supportedmessageMode.Receiver;
    _visit: <Result>(value: Capabilitystatement_supportedmessageMode, visitor: Capabilitystatement_supportedmessageMode._Visitor<Result>) => Result;
};
export declare namespace Capabilitystatement_supportedmessageMode {
    type Sender = "sender" & {
        __Sender: void;
    };
    type Receiver = "receiver" & {
        __Receiver: void;
    };
    interface _Visitor<Result> {
        sender: () => Result;
        receiver: () => Result;
        _unknown: () => Result;
    }
}
