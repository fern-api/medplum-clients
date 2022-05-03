export declare type ResearchsubjectStatus = ResearchsubjectStatus.Candidate | ResearchsubjectStatus.Eligible | ResearchsubjectStatus.Ineligible | ResearchsubjectStatus.Screening | ResearchsubjectStatus.Withdrawn;
export declare const ResearchsubjectStatus: {
    Candidate: ResearchsubjectStatus.Candidate;
    Eligible: ResearchsubjectStatus.Eligible;
    Ineligible: ResearchsubjectStatus.Ineligible;
    Screening: ResearchsubjectStatus.Screening;
    Withdrawn: ResearchsubjectStatus.Withdrawn;
    _visit: <Result>(value: ResearchsubjectStatus, visitor: ResearchsubjectStatus._Visitor<Result>) => Result;
};
export declare namespace ResearchsubjectStatus {
    type Candidate = "candidate" & {
        __Candidate: void;
    };
    type Eligible = "eligible" & {
        __Eligible: void;
    };
    type Ineligible = "ineligible" & {
        __Ineligible: void;
    };
    type Screening = "screening" & {
        __Screening: void;
    };
    type Withdrawn = "withdrawn" & {
        __Withdrawn: void;
    };
    interface _Visitor<Result> {
        candidate: () => Result;
        eligible: () => Result;
        ineligible: () => Result;
        screening: () => Result;
        withdrawn: () => Result;
        _unknown: () => Result;
    }
}
