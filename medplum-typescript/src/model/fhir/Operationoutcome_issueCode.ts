export type Operationoutcome_issueCode =
    | Operationoutcome_issueCode.Invalid
    | Operationoutcome_issueCode.Structure
    | Operationoutcome_issueCode.Required
    | Operationoutcome_issueCode.Value
    | Operationoutcome_issueCode.Invariant
    | Operationoutcome_issueCode.Security
    | Operationoutcome_issueCode.Login
    | Operationoutcome_issueCode.Expired
    | Operationoutcome_issueCode.Forbidden
    | Operationoutcome_issueCode.Suppressed
    | Operationoutcome_issueCode.Processing
    | Operationoutcome_issueCode.Duplicate
    | Operationoutcome_issueCode.Deleted
    | Operationoutcome_issueCode.Extension
    | Operationoutcome_issueCode.Conflict
    | Operationoutcome_issueCode.Transient
    | Operationoutcome_issueCode.Exception
    | Operationoutcome_issueCode.Timeout
    | Operationoutcome_issueCode.Incomplete
    | Operationoutcome_issueCode.Throttled
    | Operationoutcome_issueCode.Informational;

export const Operationoutcome_issueCode = {
    Invalid: "invalid" as Operationoutcome_issueCode.Invalid,
    Structure: "structure" as Operationoutcome_issueCode.Structure,
    Required: "required" as Operationoutcome_issueCode.Required,
    Value: "value" as Operationoutcome_issueCode.Value,
    Invariant: "invariant" as Operationoutcome_issueCode.Invariant,
    Security: "security" as Operationoutcome_issueCode.Security,
    Login: "login" as Operationoutcome_issueCode.Login,
    Expired: "expired" as Operationoutcome_issueCode.Expired,
    Forbidden: "forbidden" as Operationoutcome_issueCode.Forbidden,
    Suppressed: "suppressed" as Operationoutcome_issueCode.Suppressed,
    Processing: "processing" as Operationoutcome_issueCode.Processing,
    Duplicate: "duplicate" as Operationoutcome_issueCode.Duplicate,
    Deleted: "deleted" as Operationoutcome_issueCode.Deleted,
    Extension: "extension" as Operationoutcome_issueCode.Extension,
    Conflict: "conflict" as Operationoutcome_issueCode.Conflict,
    Transient: "transient" as Operationoutcome_issueCode.Transient,
    Exception: "exception" as Operationoutcome_issueCode.Exception,
    Timeout: "timeout" as Operationoutcome_issueCode.Timeout,
    Incomplete: "incomplete" as Operationoutcome_issueCode.Incomplete,
    Throttled: "throttled" as Operationoutcome_issueCode.Throttled,
    Informational: "informational" as Operationoutcome_issueCode.Informational,

    _visit: <Result>(
        value: Operationoutcome_issueCode,
        visitor: Operationoutcome_issueCode._Visitor<Result>
    ): Result => {
        switch (value) {
            case Operationoutcome_issueCode.Invalid:
                return visitor.invalid();
            case Operationoutcome_issueCode.Structure:
                return visitor.structure();
            case Operationoutcome_issueCode.Required:
                return visitor.required();
            case Operationoutcome_issueCode.Value:
                return visitor.value();
            case Operationoutcome_issueCode.Invariant:
                return visitor.invariant();
            case Operationoutcome_issueCode.Security:
                return visitor.security();
            case Operationoutcome_issueCode.Login:
                return visitor.login();
            case Operationoutcome_issueCode.Expired:
                return visitor.expired();
            case Operationoutcome_issueCode.Forbidden:
                return visitor.forbidden();
            case Operationoutcome_issueCode.Suppressed:
                return visitor.suppressed();
            case Operationoutcome_issueCode.Processing:
                return visitor.processing();
            case Operationoutcome_issueCode.Duplicate:
                return visitor.duplicate();
            case Operationoutcome_issueCode.Deleted:
                return visitor.deleted();
            case Operationoutcome_issueCode.Extension:
                return visitor.extension();
            case Operationoutcome_issueCode.Conflict:
                return visitor.conflict();
            case Operationoutcome_issueCode.Transient:
                return visitor.transient();
            case Operationoutcome_issueCode.Exception:
                return visitor.exception();
            case Operationoutcome_issueCode.Timeout:
                return visitor.timeout();
            case Operationoutcome_issueCode.Incomplete:
                return visitor.incomplete();
            case Operationoutcome_issueCode.Throttled:
                return visitor.throttled();
            case Operationoutcome_issueCode.Informational:
                return visitor.informational();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Operationoutcome_issueCode {
    export type Invalid = "invalid" & {
        __Invalid: void;
    };
    export type Structure = "structure" & {
        __Structure: void;
    };
    export type Required = "required" & {
        __Required: void;
    };
    export type Value = "value" & {
        __Value: void;
    };
    export type Invariant = "invariant" & {
        __Invariant: void;
    };
    export type Security = "security" & {
        __Security: void;
    };
    export type Login = "login" & {
        __Login: void;
    };
    export type Expired = "expired" & {
        __Expired: void;
    };
    export type Forbidden = "forbidden" & {
        __Forbidden: void;
    };
    export type Suppressed = "suppressed" & {
        __Suppressed: void;
    };
    export type Processing = "processing" & {
        __Processing: void;
    };
    export type Duplicate = "duplicate" & {
        __Duplicate: void;
    };
    export type Deleted = "deleted" & {
        __Deleted: void;
    };
    export type Extension = "extension" & {
        __Extension: void;
    };
    export type Conflict = "conflict" & {
        __Conflict: void;
    };
    export type Transient = "transient" & {
        __Transient: void;
    };
    export type Exception = "exception" & {
        __Exception: void;
    };
    export type Timeout = "timeout" & {
        __Timeout: void;
    };
    export type Incomplete = "incomplete" & {
        __Incomplete: void;
    };
    export type Throttled = "throttled" & {
        __Throttled: void;
    };
    export type Informational = "informational" & {
        __Informational: void;
    };

    export interface _Visitor<Result> {
        invalid: () => Result;
        structure: () => Result;
        required: () => Result;
        value: () => Result;
        invariant: () => Result;
        security: () => Result;
        login: () => Result;
        expired: () => Result;
        forbidden: () => Result;
        suppressed: () => Result;
        processing: () => Result;
        duplicate: () => Result;
        deleted: () => Result;
        extension: () => Result;
        conflict: () => Result;
        transient: () => Result;
        exception: () => Result;
        timeout: () => Result;
        incomplete: () => Result;
        throttled: () => Result;
        informational: () => Result;
        _unknown: () => Result;
    }
}
