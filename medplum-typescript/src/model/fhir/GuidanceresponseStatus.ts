export type GuidanceresponseStatus =
    | GuidanceresponseStatus.Success
    | GuidanceresponseStatus.Failure;

export const GuidanceresponseStatus = {
    Success: "success" as GuidanceresponseStatus.Success,
    Failure: "failure" as GuidanceresponseStatus.Failure,

    _visit: <Result>(value: GuidanceresponseStatus, visitor: GuidanceresponseStatus._Visitor<Result>): Result => {
        switch (value) {
            case GuidanceresponseStatus.Success: return visitor.success();
            case GuidanceresponseStatus.Failure: return visitor.failure();
            default: return visitor._unknown();
        }
    },
};

export declare namespace GuidanceresponseStatus {
    export type Success = "success" & {
        __Success: void,
    };
    export type Failure = "failure" & {
        __Failure: void,
    };

    export interface _Visitor<Result> {
        success: () => Result;
        failure: () => Result;
        _unknown: () => Result;
    }
}
