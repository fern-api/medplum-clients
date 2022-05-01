export type SpecimenStatus =
    | SpecimenStatus.Available
    | SpecimenStatus.Unavailable
    | SpecimenStatus.Unsatisfactory;

export const SpecimenStatus = {
    Available: "available" as SpecimenStatus.Available,
    Unavailable: "unavailable" as SpecimenStatus.Unavailable,
    Unsatisfactory: "unsatisfactory" as SpecimenStatus.Unsatisfactory,

    _visit: <Result>(
        value: SpecimenStatus,
        visitor: SpecimenStatus._Visitor<Result>
    ): Result => {
        switch (value) {
            case SpecimenStatus.Available:
                return visitor.available();
            case SpecimenStatus.Unavailable:
                return visitor.unavailable();
            case SpecimenStatus.Unsatisfactory:
                return visitor.unsatisfactory();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace SpecimenStatus {
    export type Available = "available" & {
        __Available: void;
    };
    export type Unavailable = "unavailable" & {
        __Unavailable: void;
    };
    export type Unsatisfactory = "unsatisfactory" & {
        __Unsatisfactory: void;
    };

    export interface _Visitor<Result> {
        available: () => Result;
        unavailable: () => Result;
        unsatisfactory: () => Result;
        _unknown: () => Result;
    }
}
