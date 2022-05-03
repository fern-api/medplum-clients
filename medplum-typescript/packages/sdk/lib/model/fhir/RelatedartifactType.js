"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.RelatedartifactType = void 0;
exports.RelatedartifactType = {
    Documentation: "documentation",
    Justification: "justification",
    Citation: "citation",
    Predecessor: "predecessor",
    Successor: "successor",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.RelatedartifactType.Documentation:
                return visitor.documentation();
            case exports.RelatedartifactType.Justification:
                return visitor.justification();
            case exports.RelatedartifactType.Citation:
                return visitor.citation();
            case exports.RelatedartifactType.Predecessor:
                return visitor.predecessor();
            case exports.RelatedartifactType.Successor:
                return visitor.successor();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=RelatedartifactType.js.map