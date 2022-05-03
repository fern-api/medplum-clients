"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Testscript_operationMethod = void 0;
exports.Testscript_operationMethod = {
    Delete: "delete",
    Get: "get",
    Options: "options",
    Patch: "patch",
    Post: "post",
    Put: "put",
    Head: "head",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Testscript_operationMethod.Delete:
                return visitor.delete();
            case exports.Testscript_operationMethod.Get:
                return visitor.get();
            case exports.Testscript_operationMethod.Options:
                return visitor.options();
            case exports.Testscript_operationMethod.Patch:
                return visitor.patch();
            case exports.Testscript_operationMethod.Post:
                return visitor.post();
            case exports.Testscript_operationMethod.Put:
                return visitor.put();
            case exports.Testscript_operationMethod.Head:
                return visitor.head();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Testscript_operationMethod.js.map