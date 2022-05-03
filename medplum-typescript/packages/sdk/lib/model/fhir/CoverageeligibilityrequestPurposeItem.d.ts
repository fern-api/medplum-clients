export declare type CoverageeligibilityrequestPurposeItem = CoverageeligibilityrequestPurposeItem.Benefits | CoverageeligibilityrequestPurposeItem.Discovery | CoverageeligibilityrequestPurposeItem.Validation;
export declare const CoverageeligibilityrequestPurposeItem: {
    Benefits: CoverageeligibilityrequestPurposeItem.Benefits;
    Discovery: CoverageeligibilityrequestPurposeItem.Discovery;
    Validation: CoverageeligibilityrequestPurposeItem.Validation;
    _visit: <Result>(value: CoverageeligibilityrequestPurposeItem, visitor: CoverageeligibilityrequestPurposeItem._Visitor<Result>) => Result;
};
export declare namespace CoverageeligibilityrequestPurposeItem {
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
