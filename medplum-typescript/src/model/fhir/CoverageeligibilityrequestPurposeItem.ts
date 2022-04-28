export type CoverageeligibilityrequestPurposeItem =
    | CoverageeligibilityrequestPurposeItem.Benefits
    | CoverageeligibilityrequestPurposeItem.Discovery
    | CoverageeligibilityrequestPurposeItem.Validation;

export const CoverageeligibilityrequestPurposeItem = {
    Benefits: "benefits" as CoverageeligibilityrequestPurposeItem.Benefits,
    Discovery: "discovery" as CoverageeligibilityrequestPurposeItem.Discovery,
    Validation: "validation" as CoverageeligibilityrequestPurposeItem.Validation,

    _visit: <Result>(value: CoverageeligibilityrequestPurposeItem, visitor: CoverageeligibilityrequestPurposeItem._Visitor<Result>): Result => {
        switch (value) {
            case CoverageeligibilityrequestPurposeItem.Benefits: return visitor.benefits();
            case CoverageeligibilityrequestPurposeItem.Discovery: return visitor.discovery();
            case CoverageeligibilityrequestPurposeItem.Validation: return visitor.validation();
            default: return visitor._unknown();
        }
    },
};

export declare namespace CoverageeligibilityrequestPurposeItem {
    export type Benefits = "benefits" & {
        __Benefits: void,
    };
    export type Discovery = "discovery" & {
        __Discovery: void,
    };
    export type Validation = "validation" & {
        __Validation: void,
    };

    export interface _Visitor<Result> {
        benefits: () => Result;
        discovery: () => Result;
        validation: () => Result;
        _unknown: () => Result;
    }
}
