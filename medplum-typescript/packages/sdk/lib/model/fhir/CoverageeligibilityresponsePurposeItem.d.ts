export declare type CoverageeligibilityresponsePurposeItem = CoverageeligibilityresponsePurposeItem.Benefits | CoverageeligibilityresponsePurposeItem.Discovery | CoverageeligibilityresponsePurposeItem.Validation;
export declare const CoverageeligibilityresponsePurposeItem: {
    Benefits: CoverageeligibilityresponsePurposeItem.Benefits;
    Discovery: CoverageeligibilityresponsePurposeItem.Discovery;
    Validation: CoverageeligibilityresponsePurposeItem.Validation;
    _visit: <Result>(value: CoverageeligibilityresponsePurposeItem, visitor: CoverageeligibilityresponsePurposeItem._Visitor<Result>) => Result;
};
export declare namespace CoverageeligibilityresponsePurposeItem {
    type Benefits = "benefits" & {
        __Benefits: void;
    };
    type Discovery = "discovery" & {
        __Discovery: void;
    };
    type Validation = "validation" & {
        __Validation: void;
    };
    interface _Visitor<Result> {
        benefits: () => Result;
        discovery: () => Result;
        validation: () => Result;
        _unknown: () => Result;
    }
}
