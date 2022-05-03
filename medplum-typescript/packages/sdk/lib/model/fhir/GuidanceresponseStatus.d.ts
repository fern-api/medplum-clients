export declare type GuidanceresponseStatus = GuidanceresponseStatus.Success | GuidanceresponseStatus.Failure;
export declare const GuidanceresponseStatus: {
    Success: GuidanceresponseStatus.Success;
    Failure: GuidanceresponseStatus.Failure;
    _visit: <Result>(value: GuidanceresponseStatus, visitor: GuidanceresponseStatus._Visitor<Result>) => Result;
};
export declare namespace GuidanceresponseStatus {
    type Success = "success" & {
        __Success: void;
    };
    type Failure = "failure" & {
        __Failure: void;
    };
    interface _Visitor<Result> {
        success: () => Result;
        failure: () => Result;
        _unknown: () => Result;
    }
}
