export type Capabilitystatement_documentMode =
    | Capabilitystatement_documentMode.Producer
    | Capabilitystatement_documentMode.Consumer;

export const Capabilitystatement_documentMode = {
    Producer: "producer" as Capabilitystatement_documentMode.Producer,
    Consumer: "consumer" as Capabilitystatement_documentMode.Consumer,

    _visit: <Result>(
        value: Capabilitystatement_documentMode,
        visitor: Capabilitystatement_documentMode._Visitor<Result>
    ): Result => {
        switch (value) {
            case Capabilitystatement_documentMode.Producer:
                return visitor.producer();
            case Capabilitystatement_documentMode.Consumer:
                return visitor.consumer();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Capabilitystatement_documentMode {
    export type Producer = "producer" & {
        __Producer: void;
    };
    export type Consumer = "consumer" & {
        __Consumer: void;
    };

    export interface _Visitor<Result> {
        producer: () => Result;
        consumer: () => Result;
        _unknown: () => Result;
    }
}
