export type RelatedartifactType =
    | RelatedartifactType.Documentation
    | RelatedartifactType.Justification
    | RelatedartifactType.Citation
    | RelatedartifactType.Predecessor
    | RelatedartifactType.Successor;

export const RelatedartifactType = {
    Documentation: "documentation" as RelatedartifactType.Documentation,
    Justification: "justification" as RelatedartifactType.Justification,
    Citation: "citation" as RelatedartifactType.Citation,
    Predecessor: "predecessor" as RelatedartifactType.Predecessor,
    Successor: "successor" as RelatedartifactType.Successor,

    _visit: <Result>(
        value: RelatedartifactType,
        visitor: RelatedartifactType._Visitor<Result>
    ): Result => {
        switch (value) {
            case RelatedartifactType.Documentation:
                return visitor.documentation();
            case RelatedartifactType.Justification:
                return visitor.justification();
            case RelatedartifactType.Citation:
                return visitor.citation();
            case RelatedartifactType.Predecessor:
                return visitor.predecessor();
            case RelatedartifactType.Successor:
                return visitor.successor();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace RelatedartifactType {
    export type Documentation = "documentation" & {
        __Documentation: void;
    };
    export type Justification = "justification" & {
        __Justification: void;
    };
    export type Citation = "citation" & {
        __Citation: void;
    };
    export type Predecessor = "predecessor" & {
        __Predecessor: void;
    };
    export type Successor = "successor" & {
        __Successor: void;
    };

    export interface _Visitor<Result> {
        documentation: () => Result;
        justification: () => Result;
        citation: () => Result;
        predecessor: () => Result;
        successor: () => Result;
        _unknown: () => Result;
    }
}
