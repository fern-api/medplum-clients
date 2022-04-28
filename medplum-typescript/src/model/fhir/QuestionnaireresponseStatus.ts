export type QuestionnaireresponseStatus =
    | QuestionnaireresponseStatus.Completed
    | QuestionnaireresponseStatus.Amended
    | QuestionnaireresponseStatus.Stopped;

export const QuestionnaireresponseStatus = {
    Completed: "completed" as QuestionnaireresponseStatus.Completed,
    Amended: "amended" as QuestionnaireresponseStatus.Amended,
    Stopped: "stopped" as QuestionnaireresponseStatus.Stopped,

    _visit: <Result>(value: QuestionnaireresponseStatus, visitor: QuestionnaireresponseStatus._Visitor<Result>): Result => {
        switch (value) {
            case QuestionnaireresponseStatus.Completed: return visitor.completed();
            case QuestionnaireresponseStatus.Amended: return visitor.amended();
            case QuestionnaireresponseStatus.Stopped: return visitor.stopped();
            default: return visitor._unknown();
        }
    },
};

export declare namespace QuestionnaireresponseStatus {
    export type Completed = "completed" & {
        __Completed: void,
    };
    export type Amended = "amended" & {
        __Amended: void,
    };
    export type Stopped = "stopped" & {
        __Stopped: void,
    };

    export interface _Visitor<Result> {
        completed: () => Result;
        amended: () => Result;
        stopped: () => Result;
        _unknown: () => Result;
    }
}
