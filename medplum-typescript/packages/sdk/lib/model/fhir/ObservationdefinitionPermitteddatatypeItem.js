"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ObservationdefinitionPermitteddatatypeItem = void 0;
exports.ObservationdefinitionPermitteddatatypeItem = {
    Quantity: "Quantity",
    CodeableConcept: "CodeableConcept",
    String: "string",
    Boolean: "boolean",
    Integer: "integer",
    Range: "Range",
    Ratio: "Ratio",
    SampledData: "SampledData",
    Time: "time",
    DateTime: "dateTime",
    Period: "Period",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.ObservationdefinitionPermitteddatatypeItem.Quantity:
                return visitor.quantity();
            case exports.ObservationdefinitionPermitteddatatypeItem.CodeableConcept:
                return visitor.codeableConcept();
            case exports.ObservationdefinitionPermitteddatatypeItem.String:
                return visitor.string();
            case exports.ObservationdefinitionPermitteddatatypeItem.Boolean:
                return visitor.boolean();
            case exports.ObservationdefinitionPermitteddatatypeItem.Integer:
                return visitor.integer();
            case exports.ObservationdefinitionPermitteddatatypeItem.Range:
                return visitor.range();
            case exports.ObservationdefinitionPermitteddatatypeItem.Ratio:
                return visitor.ratio();
            case exports.ObservationdefinitionPermitteddatatypeItem.SampledData:
                return visitor.sampledData();
            case exports.ObservationdefinitionPermitteddatatypeItem.Time:
                return visitor.time();
            case exports.ObservationdefinitionPermitteddatatypeItem.DateTime:
                return visitor.dateTime();
            case exports.ObservationdefinitionPermitteddatatypeItem.Period:
                return visitor.period();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=ObservationdefinitionPermitteddatatypeItem.js.map