"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Plandefinition_relatedactionRelationship = void 0;
exports.Plandefinition_relatedactionRelationship = {
    Before: "before",
    Concurrent: "concurrent",
    After: "after",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Plandefinition_relatedactionRelationship.Before:
                return visitor.before();
            case exports.Plandefinition_relatedactionRelationship.Concurrent:
                return visitor.concurrent();
            case exports.Plandefinition_relatedactionRelationship.After:
                return visitor.after();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Plandefinition_relatedactionRelationship.js.map