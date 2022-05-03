"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.StructuredefinitionKind = void 0;
exports.StructuredefinitionKind = {
    Resource: "resource",
    Logical: "logical",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.StructuredefinitionKind.Resource:
                return visitor.resource();
            case exports.StructuredefinitionKind.Logical:
                return visitor.logical();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=StructuredefinitionKind.js.map