export declare type SpecimenStatus = SpecimenStatus.Available | SpecimenStatus.Unavailable | SpecimenStatus.Unsatisfactory;
export declare const SpecimenStatus: {
    Available: SpecimenStatus.Available;
    Unavailable: SpecimenStatus.Unavailable;
    Unsatisfactory: SpecimenStatus.Unsatisfactory;
    _visit: <Result>(value: SpecimenStatus, visitor: SpecimenStatus._Visitor<Result>) => Result;
};
export declare namespace SpecimenStatus {
    type Available = "available" & {
        __Available: void;
    };
    type Unavailable = "unavailable" & {
        __Unavailable: void;
    };
    type Unsatisfactory = "unsatisfactory" & {
        __Unsatisfactory: void;
    };
    interface _Visitor<Result> {
        available: () => Result;
        unavailable: () => Result;
        unsatisfactory: () => Result;
        _unknown: () => Result;
    }
}
