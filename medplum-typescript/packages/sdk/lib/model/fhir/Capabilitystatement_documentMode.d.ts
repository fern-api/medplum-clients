export declare type Capabilitystatement_documentMode = Capabilitystatement_documentMode.Producer | Capabilitystatement_documentMode.Consumer;
export declare const Capabilitystatement_documentMode: {
    Producer: Capabilitystatement_documentMode.Producer;
    Consumer: Capabilitystatement_documentMode.Consumer;
    _visit: <Result>(value: Capabilitystatement_documentMode, visitor: Capabilitystatement_documentMode._Visitor<Result>) => Result;
};
export declare namespace Capabilitystatement_documentMode {
    type Producer = "producer" & {
        __Producer: void;
    };
    type Consumer = "consumer" & {
        __Consumer: void;
    };
    interface _Visitor<Result> {
        producer: () => Result;
        consumer: () => Result;
        _unknown: () => Result;
    }
}
