export type ObservationdefinitionPermitteddatatypeItem =
    | ObservationdefinitionPermitteddatatypeItem.Quantity
    | ObservationdefinitionPermitteddatatypeItem.CodeableConcept
    | ObservationdefinitionPermitteddatatypeItem.String
    | ObservationdefinitionPermitteddatatypeItem.Boolean
    | ObservationdefinitionPermitteddatatypeItem.Integer
    | ObservationdefinitionPermitteddatatypeItem.Range
    | ObservationdefinitionPermitteddatatypeItem.Ratio
    | ObservationdefinitionPermitteddatatypeItem.SampledData
    | ObservationdefinitionPermitteddatatypeItem.Time
    | ObservationdefinitionPermitteddatatypeItem.DateTime
    | ObservationdefinitionPermitteddatatypeItem.Period;

export const ObservationdefinitionPermitteddatatypeItem = {
    Quantity: "Quantity" as ObservationdefinitionPermitteddatatypeItem.Quantity,
    CodeableConcept: "CodeableConcept" as ObservationdefinitionPermitteddatatypeItem.CodeableConcept,
    String: "string" as ObservationdefinitionPermitteddatatypeItem.String,
    Boolean: "boolean" as ObservationdefinitionPermitteddatatypeItem.Boolean,
    Integer: "integer" as ObservationdefinitionPermitteddatatypeItem.Integer,
    Range: "Range" as ObservationdefinitionPermitteddatatypeItem.Range,
    Ratio: "Ratio" as ObservationdefinitionPermitteddatatypeItem.Ratio,
    SampledData: "SampledData" as ObservationdefinitionPermitteddatatypeItem.SampledData,
    Time: "time" as ObservationdefinitionPermitteddatatypeItem.Time,
    DateTime: "dateTime" as ObservationdefinitionPermitteddatatypeItem.DateTime,
    Period: "Period" as ObservationdefinitionPermitteddatatypeItem.Period,

    _visit: <Result>(value: ObservationdefinitionPermitteddatatypeItem, visitor: ObservationdefinitionPermitteddatatypeItem._Visitor<Result>): Result => {
        switch (value) {
            case ObservationdefinitionPermitteddatatypeItem.Quantity: return visitor.quantity();
            case ObservationdefinitionPermitteddatatypeItem.CodeableConcept: return visitor.codeableConcept();
            case ObservationdefinitionPermitteddatatypeItem.String: return visitor.string();
            case ObservationdefinitionPermitteddatatypeItem.Boolean: return visitor.boolean();
            case ObservationdefinitionPermitteddatatypeItem.Integer: return visitor.integer();
            case ObservationdefinitionPermitteddatatypeItem.Range: return visitor.range();
            case ObservationdefinitionPermitteddatatypeItem.Ratio: return visitor.ratio();
            case ObservationdefinitionPermitteddatatypeItem.SampledData: return visitor.sampledData();
            case ObservationdefinitionPermitteddatatypeItem.Time: return visitor.time();
            case ObservationdefinitionPermitteddatatypeItem.DateTime: return visitor.dateTime();
            case ObservationdefinitionPermitteddatatypeItem.Period: return visitor.period();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ObservationdefinitionPermitteddatatypeItem {
    export type Quantity = "Quantity" & {
        __Quantity: void,
    };
    export type CodeableConcept = "CodeableConcept" & {
        __CodeableConcept: void,
    };
    export type String = "string" & {
        __String: void,
    };
    export type Boolean = "boolean" & {
        __Boolean: void,
    };
    export type Integer = "integer" & {
        __Integer: void,
    };
    export type Range = "Range" & {
        __Range: void,
    };
    export type Ratio = "Ratio" & {
        __Ratio: void,
    };
    export type SampledData = "SampledData" & {
        __SampledData: void,
    };
    export type Time = "time" & {
        __Time: void,
    };
    export type DateTime = "dateTime" & {
        __DateTime: void,
    };
    export type Period = "Period" & {
        __Period: void,
    };

    export interface _Visitor<Result> {
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
