export declare type ObservationdefinitionPermitteddatatypeItem = ObservationdefinitionPermitteddatatypeItem.Quantity | ObservationdefinitionPermitteddatatypeItem.CodeableConcept | ObservationdefinitionPermitteddatatypeItem.String | ObservationdefinitionPermitteddatatypeItem.Boolean | ObservationdefinitionPermitteddatatypeItem.Integer | ObservationdefinitionPermitteddatatypeItem.Range | ObservationdefinitionPermitteddatatypeItem.Ratio | ObservationdefinitionPermitteddatatypeItem.SampledData | ObservationdefinitionPermitteddatatypeItem.Time | ObservationdefinitionPermitteddatatypeItem.DateTime | ObservationdefinitionPermitteddatatypeItem.Period;
export declare const ObservationdefinitionPermitteddatatypeItem: {
    Quantity: ObservationdefinitionPermitteddatatypeItem.Quantity;
    CodeableConcept: ObservationdefinitionPermitteddatatypeItem.CodeableConcept;
    String: ObservationdefinitionPermitteddatatypeItem.String;
    Boolean: ObservationdefinitionPermitteddatatypeItem.Boolean;
    Integer: ObservationdefinitionPermitteddatatypeItem.Integer;
    Range: ObservationdefinitionPermitteddatatypeItem.Range;
    Ratio: ObservationdefinitionPermitteddatatypeItem.Ratio;
    SampledData: ObservationdefinitionPermitteddatatypeItem.SampledData;
    Time: ObservationdefinitionPermitteddatatypeItem.Time;
    DateTime: ObservationdefinitionPermitteddatatypeItem.DateTime;
    Period: ObservationdefinitionPermitteddatatypeItem.Period;
    _visit: <Result>(value: ObservationdefinitionPermitteddatatypeItem, visitor: ObservationdefinitionPermitteddatatypeItem._Visitor<Result>) => Result;
};
export declare namespace ObservationdefinitionPermitteddatatypeItem {
    type Quantity = "Quantity" & {
        __Quantity: void;
    };
    type CodeableConcept = "CodeableConcept" & {
        __CodeableConcept: void;
    };
    type String = "string" & {
        __String: void;
    };
    type Boolean = "boolean" & {
        __Boolean: void;
    };
    type Integer = "integer" & {
        __Integer: void;
    };
    type Range = "Range" & {
        __Range: void;
    };
    type Ratio = "Ratio" & {
        __Ratio: void;
    };
    type SampledData = "SampledData" & {
        __SampledData: void;
    };
    type Time = "time" & {
        __Time: void;
    };
    type DateTime = "dateTime" & {
        __DateTime: void;
    };
    type Period = "Period" & {
        __Period: void;
    };
    interface _Visitor<Result> {
        quantity: () => Result;
        codeableConcept: () => Result;
        string: () => Result;
        boolean: () => Result;
        integer: () => Result;
        range: () => Result;
        ratio: () => Result;
        sampledData: () => Result;
        time: () => Result;
        dateTime: () => Result;
        period: () => Result;
        _unknown: () => Result;
    }
}
