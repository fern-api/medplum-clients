export type ContributorType =
    | ContributorType.Author
    | ContributorType.Editor
    | ContributorType.Reviewer
    | ContributorType.Endorser;

export const ContributorType = {
    Author: "author" as ContributorType.Author,
    Editor: "editor" as ContributorType.Editor,
    Reviewer: "reviewer" as ContributorType.Reviewer,
    Endorser: "endorser" as ContributorType.Endorser,

    _visit: <Result>(value: ContributorType, visitor: ContributorType._Visitor<Result>): Result => {
        switch (value) {
            case ContributorType.Author: return visitor.author();
            case ContributorType.Editor: return visitor.editor();
            case ContributorType.Reviewer: return visitor.reviewer();
            case ContributorType.Endorser: return visitor.endorser();
            default: return visitor._unknown();
        }
    },
};

export declare namespace ContributorType {
    export type Author = "author" & {
        __Author: void,
    };
    export type Editor = "editor" & {
        __Editor: void,
    };
    export type Reviewer = "reviewer" & {
        __Reviewer: void,
    };
    export type Endorser = "endorser" & {
        __Endorser: void,
    };

    export interface _Visitor<Result> {
        author: () => Result;
        editor: () => Result;
        reviewer: () => Result;
        endorser: () => Result;
        _unknown: () => Result;
    }
}
