export declare type RelatedartifactType = RelatedartifactType.Documentation | RelatedartifactType.Justification | RelatedartifactType.Citation | RelatedartifactType.Predecessor | RelatedartifactType.Successor;
export declare const RelatedartifactType: {
    Documentation: RelatedartifactType.Documentation;
    Justification: RelatedartifactType.Justification;
    Citation: RelatedartifactType.Citation;
    Predecessor: RelatedartifactType.Predecessor;
    Successor: RelatedartifactType.Successor;
    _visit: <Result>(value: RelatedartifactType, visitor: RelatedartifactType._Visitor<Result>) => Result;
};
export declare namespace RelatedartifactType {
    type Documentation = "documentation" & {
        __Documentation: void;
    };
    type Justification = "justification" & {
        __Justification: void;
    };
    type Citation = "citation" & {
        __Citation: void;
    };
    type Predecessor = "predecessor" & {
        __Predecessor: void;
    };
    type Successor = "successor" & {
        __Successor: void;
    };
    interface _Visitor<Result> {
        documentation: () => Result;
        justification: () => Result;
        citation: () => Result;
        predecessor: () => Result;
        successor: () => Result;
        _unknown: () => Result;
    }
}
