"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Bundle_requestMethod = void 0;
exports.Bundle_requestMethod = {
    Get: "GET",
    Head: "HEAD",
    Post: "POST",
    Put: "PUT",
    Delete: "DELETE",
    Patch: "PATCH",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Bundle_requestMethod.Get:
                return visitor.get();
            case exports.Bundle_requestMethod.Head:
                return visitor.head();
            case exports.Bundle_requestMethod.Post:
                return visitor.post();
            case exports.Bundle_requestMethod.Put:
                return visitor.put();
            case exports.Bundle_requestMethod.Delete:
                return visitor.delete();
            case exports.Bundle_requestMethod.Patch:
                return visitor.patch();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Bundle_requestMethod.js.map