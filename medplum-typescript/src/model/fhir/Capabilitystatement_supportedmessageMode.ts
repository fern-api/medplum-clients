export type Capabilitystatement_supportedmessageMode =
    | Capabilitystatement_supportedmessageMode.Sender
    | Capabilitystatement_supportedmessageMode.Receiver;

export const Capabilitystatement_supportedmessageMode = {
    Sender: "sender" as Capabilitystatement_supportedmessageMode.Sender,
    Receiver: "receiver" as Capabilitystatement_supportedmessageMode.Receiver,

    _visit: <Result>(
        value: Capabilitystatement_supportedmessageMode,
        visitor: Capabilitystatement_supportedmessageMode._Visitor<Result>
    ): Result => {
        switch (value) {
            case Capabilitystatement_supportedmessageMode.Sender:
                return visitor.sender();
            case Capabilitystatement_supportedmessageMode.Receiver:
                return visitor.receiver();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Capabilitystatement_supportedmessageMode {
    export type Sender = "sender" & {
        __Sender: void;
    };
    export type Receiver = "receiver" & {
        __Receiver: void;
    };

    export interface _Visitor<Result> {
        sender: () => Result;
        receiver: () => Result;
        _unknown: () => Result;
    }
}
