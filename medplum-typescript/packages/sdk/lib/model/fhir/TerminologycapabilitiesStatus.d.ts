export declare type TerminologycapabilitiesStatus = TerminologycapabilitiesStatus.Draft | TerminologycapabilitiesStatus.Active | TerminologycapabilitiesStatus.Retired;
export declare const TerminologycapabilitiesStatus: {
    Draft: TerminologycapabilitiesStatus.Draft;
    Active: TerminologycapabilitiesStatus.Active;
    Retired: TerminologycapabilitiesStatus.Retired;
    _visit: <Result>(value: TerminologycapabilitiesStatus, visitor: TerminologycapabilitiesStatus._Visitor<Result>) => Result;
};
export declare namespace TerminologycapabilitiesStatus {
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
