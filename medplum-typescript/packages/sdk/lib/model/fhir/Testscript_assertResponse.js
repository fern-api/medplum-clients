"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Testscript_assertResponse = void 0;
exports.Testscript_assertResponse = {
    Okay: "okay",
    Created: "created",
    NoContent: "noContent",
    NotModified: "notModified",
    Bad: "bad",
    Forbidden: "forbidden",
    NotFound: "notFound",
    MethodNotAllowed: "methodNotAllowed",
    Conflict: "conflict",
    Gone: "gone",
    PreconditionFailed: "preconditionFailed",
    Unprocessable: "unprocessable",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Testscript_assertResponse.Okay:
                return visitor.okay();
            case exports.Testscript_assertResponse.Created:
                return visitor.created();
            case exports.Testscript_assertResponse.NoContent:
                return visitor.noContent();
            case exports.Testscript_assertResponse.NotModified:
                return visitor.notModified();
            case exports.Testscript_assertResponse.Bad:
                return visitor.bad();
            case exports.Testscript_assertResponse.Forbidden:
                return visitor.forbidden();
            case exports.Testscript_assertResponse.NotFound:
                return visitor.notFound();
            case exports.Testscript_assertResponse.MethodNotAllowed:
                return visitor.methodNotAllowed();
            case exports.Testscript_assertResponse.Conflict:
                return visitor.conflict();
            case exports.Testscript_assertResponse.Gone:
                return visitor.gone();
            case exports.Testscript_assertResponse.PreconditionFailed:
                return visitor.preconditionFailed();
            case exports.Testscript_assertResponse.Unprocessable:
                return visitor.unprocessable();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Testscript_assertResponse.js.map