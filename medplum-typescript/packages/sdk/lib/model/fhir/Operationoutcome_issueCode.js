"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Operationoutcome_issueCode = void 0;
exports.Operationoutcome_issueCode = {
    Invalid: "invalid",
    Structure: "structure",
    Required: "required",
    Value: "value",
    Invariant: "invariant",
    Security: "security",
    Login: "login",
    Expired: "expired",
    Forbidden: "forbidden",
    Suppressed: "suppressed",
    Processing: "processing",
    Duplicate: "duplicate",
    Deleted: "deleted",
    Extension: "extension",
    Conflict: "conflict",
    Transient: "transient",
    Exception: "exception",
    Timeout: "timeout",
    Incomplete: "incomplete",
    Throttled: "throttled",
    Informational: "informational",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Operationoutcome_issueCode.Invalid:
                return visitor.invalid();
            case exports.Operationoutcome_issueCode.Structure:
                return visitor.structure();
            case exports.Operationoutcome_issueCode.Required:
                return visitor.required();
            case exports.Operationoutcome_issueCode.Value:
                return visitor.value();
            case exports.Operationoutcome_issueCode.Invariant:
                return visitor.invariant();
            case exports.Operationoutcome_issueCode.Security:
                return visitor.security();
            case exports.Operationoutcome_issueCode.Login:
                return visitor.login();
            case exports.Operationoutcome_issueCode.Expired:
                return visitor.expired();
            case exports.Operationoutcome_issueCode.Forbidden:
                return visitor.forbidden();
            case exports.Operationoutcome_issueCode.Suppressed:
                return visitor.suppressed();
            case exports.Operationoutcome_issueCode.Processing:
                return visitor.processing();
            case exports.Operationoutcome_issueCode.Duplicate:
                return visitor.duplicate();
            case exports.Operationoutcome_issueCode.Deleted:
                return visitor.deleted();
            case exports.Operationoutcome_issueCode.Extension:
                return visitor.extension();
            case exports.Operationoutcome_issueCode.Conflict:
                return visitor.conflict();
            case exports.Operationoutcome_issueCode.Transient:
                return visitor.transient();
            case exports.Operationoutcome_issueCode.Exception:
                return visitor.exception();
            case exports.Operationoutcome_issueCode.Timeout:
                return visitor.timeout();
            case exports.Operationoutcome_issueCode.Incomplete:
                return visitor.incomplete();
            case exports.Operationoutcome_issueCode.Throttled:
                return visitor.throttled();
            case exports.Operationoutcome_issueCode.Informational:
                return visitor.informational();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Operationoutcome_issueCode.js.map