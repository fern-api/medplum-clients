export type QuestionnaireStatus =
    | QuestionnaireStatus.Draft
    | QuestionnaireStatus.Active
    | QuestionnaireStatus.Retired;

export const QuestionnaireStatus = {
    Draft: "draft" as QuestionnaireStatus.Draft,
    Active: "active" as QuestionnaireStatus.Active,
    Retired: "retired" as QuestionnaireStatus.Retired,

    _visit: <Result>(
        value: QuestionnaireStatus,
        visitor: QuestionnaireStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case QuestionnaireStatus.Draft:
                return visitor.draft();
            case QuestionnaireStatus.Active:
                return visitor.active();
            case QuestionnaireStatus.Retired:
                return visitor.retired();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace QuestionnaireStatus {
    export type Draft = "draft" & {
        __Draft: void;
    };
    export type Active = "active" & {
        __Active: void;
    };
    export type Retired = "retired" & {
        __Retired: void;
    };

    export interface _Visitor<Result> {
        draft: () => Result;
        active: () => Result;
        retired: () => Result;
        _unknown: () => Result;
    }
}
