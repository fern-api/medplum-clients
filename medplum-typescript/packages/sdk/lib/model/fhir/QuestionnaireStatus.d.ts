export declare type QuestionnaireStatus = QuestionnaireStatus.Draft | QuestionnaireStatus.Active | QuestionnaireStatus.Retired;
export declare const QuestionnaireStatus: {
    Draft: QuestionnaireStatus.Draft;
    Active: QuestionnaireStatus.Active;
    Retired: QuestionnaireStatus.Retired;
    _visit: <Result>(value: QuestionnaireStatus, visitor: QuestionnaireStatus._Visitor<Result>) => Result;
};
export declare namespace QuestionnaireStatus {
    type Draft = "draft" & {
        __Draft: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Retired = "retired" & {
        __Retired: void;
    };
    interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
