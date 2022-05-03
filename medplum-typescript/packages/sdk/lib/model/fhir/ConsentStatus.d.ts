export declare type ConsentStatus = ConsentStatus.Draft | ConsentStatus.Proposed | ConsentStatus.Active | ConsentStatus.Rejected | ConsentStatus.Inactive;
export declare const ConsentStatus: {
    Draft: ConsentStatus.Draft;
    Proposed: ConsentStatus.Proposed;
    Active: ConsentStatus.Active;
    Rejected: ConsentStatus.Rejected;
    Inactive: ConsentStatus.Inactive;
    _visit: <Result>(value: ConsentStatus, visitor: ConsentStatus._Visitor<Result>) => Result;
};
export declare namespace ConsentStatus {
    type Draft = "draft" & {
        __Draft: void;
    };
    type Proposed = "proposed" & {
        __Proposed: void;
    };
    type Active = "active" & {
        __Active: void;
    };
    type Rejected = "rejected" & {
        __Rejected: void;
    };
    type Inactive = "inactive" & {
        __Inactive: void;
    };
    interface _Visitor<Result> {
        draft: () => Result;
        proposed: () => Result;
        active: () => Result;
        rejected: () => Result;
        inactive: () => Result;
        _unknown: () => Result;
    }
}
