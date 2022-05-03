export type CoverageeligibilityresponsePurposeItem =
    | CoverageeligibilityresponsePurposeItem.Benefits
    | CoverageeligibilityresponsePurposeItem.Discovery
    | CoverageeligibilityresponsePurposeItem.Validation;

export const CoverageeligibilityresponsePurposeItem = {
    Benefits: "benefits" as CoverageeligibilityresponsePurposeItem.Benefits,
    Discovery: "discovery" as CoverageeligibilityresponsePurposeItem.Discovery,
    Validation:
        "validation" as CoverageeligibilityresponsePurposeItem.Validation,

    _visit: <Result>(
        value: CoverageeligibilityresponsePurposeItem,
        visitor: CoverageeligibilityresponsePurposeItem._Visitor<Result>
    ): Result => {
        switch (value) {
            case CoverageeligibilityresponsePurposeItem.Benefits:
                return visitor.benefits();
            case CoverageeligibilityresponsePurposeItem.Discovery:
                return visitor.discovery();
            case CoverageeligibilityresponsePurposeItem.Validation:
                return visitor.validation();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace CoverageeligibilityresponsePurposeItem {
    export type Benefits = "benefits" & {
        __Benefits: void;
    };
    export type Discovery = "discovery" & {
        __Discovery: void;
    };
    export type Validation = "validation" & {
        __Validation: void;
    };

    export interface _Visitor<Result> {
        benefits: () => Result;
        discovery: () => Result;
        validation: () => Result;
        _unknown: () => Result;
    }
}
