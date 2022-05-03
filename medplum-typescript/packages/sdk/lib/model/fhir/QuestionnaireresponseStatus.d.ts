export declare type QuestionnaireresponseStatus = QuestionnaireresponseStatus.Completed | QuestionnaireresponseStatus.Amended | QuestionnaireresponseStatus.Stopped;
export declare const QuestionnaireresponseStatus: {
    Completed: QuestionnaireresponseStatus.Completed;
    Amended: QuestionnaireresponseStatus.Amended;
    Stopped: QuestionnaireresponseStatus.Stopped;
    _visit: <Result>(value: QuestionnaireresponseStatus, visitor: QuestionnaireresponseStatus._Visitor<Result>) => Result;
};
export declare namespace QuestionnaireresponseStatus {
    type Completed = "completed" & {
        __Completed: void;
    };
    type Amended = "amended" & {
        __Amended: void;
    };
    type Stopped = "stopped" & {
        __Stopped: void;
    };
    interface _Visitor<Result> {
        completed: () => Result;
        amended: () => Result;
        stopped: () => Result;
        _unknown: () => Result;
    }
}
