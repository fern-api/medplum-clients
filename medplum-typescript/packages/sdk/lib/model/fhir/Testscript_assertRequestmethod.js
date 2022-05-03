"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Testscript_assertRequestmethod = void 0;
exports.Testscript_assertRequestmethod = {
    Delete: "delete",
    Get: "get",
    Options: "options",
    Patch: "patch",
    Post: "post",
    Put: "put",
    Head: "head",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Testscript_assertRequestmethod.Delete:
                return visitor.delete();
            case exports.Testscript_assertRequestmethod.Get:
                return visitor.get();
            case exports.Testscript_assertRequestmethod.Options:
                return visitor.options();
            case exports.Testscript_assertRequestmethod.Patch:
                return visitor.patch();
            case exports.Testscript_assertRequestmethod.Post:
                return visitor.post();
            case exports.Testscript_assertRequestmethod.Put:
                return visitor.put();
            case exports.Testscript_assertRequestmethod.Head:
                return visitor.head();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Testscript_assertRequestmethod.js.map