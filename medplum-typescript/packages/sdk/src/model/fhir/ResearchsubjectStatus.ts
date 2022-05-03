export type ResearchsubjectStatus =
    | ResearchsubjectStatus.Candidate
    | ResearchsubjectStatus.Eligible
    | ResearchsubjectStatus.Ineligible
    | ResearchsubjectStatus.Screening
    | ResearchsubjectStatus.Withdrawn;

export const ResearchsubjectStatus = {
    Candidate: "candidate" as ResearchsubjectStatus.Candidate,
    Eligible: "eligible" as ResearchsubjectStatus.Eligible,
    Ineligible: "ineligible" as ResearchsubjectStatus.Ineligible,
    Screening: "screening" as ResearchsubjectStatus.Screening,
    Withdrawn: "withdrawn" as ResearchsubjectStatus.Withdrawn,

    _visit: <Result>(
        value: ResearchsubjectStatus,
        visitor: ResearchsubjectStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case ResearchsubjectStatus.Candidate:
                return visitor.candidate();
            case ResearchsubjectStatus.Eligible:
                return visitor.eligible();
            case ResearchsubjectStatus.Ineligible:
                return visitor.ineligible();
            case ResearchsubjectStatus.Screening:
                return visitor.screening();
            case ResearchsubjectStatus.Withdrawn:
                return visitor.withdrawn();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace ResearchsubjectStatus {
    export type Candidate = "candidate" & {
        __Candidate: void;
    };
    export type Eligible = "eligible" & {
        __Eligible: void;
    };
    export type Ineligible = "ineligible" & {
        __Ineligible: void;
    };
    export type Screening = "screening" & {
        __Screening: void;
    };
    export type Withdrawn = "withdrawn" & {
        __Withdrawn: void;
    };

    export interface _Visitor<Result> {
        candidate: () => Result;
        eligible: () => Result;
        ineligible: () => Result;
        screening: () => Result;
        withdrawn: () => Result;
        _unknown: () => Result;
    }
}
