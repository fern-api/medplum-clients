export declare type ContributorType = ContributorType.Author | ContributorType.Editor | ContributorType.Reviewer | ContributorType.Endorser;
export declare const ContributorType: {
    Author: ContributorType.Author;
    Editor: ContributorType.Editor;
    Reviewer: ContributorType.Reviewer;
    Endorser: ContributorType.Endorser;
    _visit: <Result>(value: ContributorType, visitor: ContributorType._Visitor<Result>) => Result;
};
export declare namespace ContributorType {
    type Author = "author" & {
        __Author: void;
    };
    type Editor = "editor" & {
        __Editor: void;
    };
    type Reviewer = "reviewer" & {
        __Reviewer: void;
    };
    type Endorser = "endorser" & {
        __Endorser: void;
    };
    interface _Visitor<Result> {
        author: () => Result;
        editor: () => Result;
        reviewer: () => Result;
        endorser: () => Result;
        _unknown: () => Result;
    }
}
