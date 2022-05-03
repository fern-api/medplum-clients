export declare type Operationoutcome_issueCode = Operationoutcome_issueCode.Invalid | Operationoutcome_issueCode.Structure | Operationoutcome_issueCode.Required | Operationoutcome_issueCode.Value | Operationoutcome_issueCode.Invariant | Operationoutcome_issueCode.Security | Operationoutcome_issueCode.Login | Operationoutcome_issueCode.Expired | Operationoutcome_issueCode.Forbidden | Operationoutcome_issueCode.Suppressed | Operationoutcome_issueCode.Processing | Operationoutcome_issueCode.Duplicate | Operationoutcome_issueCode.Deleted | Operationoutcome_issueCode.Extension | Operationoutcome_issueCode.Conflict | Operationoutcome_issueCode.Transient | Operationoutcome_issueCode.Exception | Operationoutcome_issueCode.Timeout | Operationoutcome_issueCode.Incomplete | Operationoutcome_issueCode.Throttled | Operationoutcome_issueCode.Informational;
export declare const Operationoutcome_issueCode: {
    Invalid: Operationoutcome_issueCode.Invalid;
    Structure: Operationoutcome_issueCode.Structure;
    Required: Operationoutcome_issueCode.Required;
    Value: Operationoutcome_issueCode.Value;
    Invariant: Operationoutcome_issueCode.Invariant;
    Security: Operationoutcome_issueCode.Security;
    Login: Operationoutcome_issueCode.Login;
    Expired: Operationoutcome_issueCode.Expired;
    Forbidden: Operationoutcome_issueCode.Forbidden;
    Suppressed: Operationoutcome_issueCode.Suppressed;
    Processing: Operationoutcome_issueCode.Processing;
    Duplicate: Operationoutcome_issueCode.Duplicate;
    Deleted: Operationoutcome_issueCode.Deleted;
    Extension: Operationoutcome_issueCode.Extension;
    Conflict: Operationoutcome_issueCode.Conflict;
    Transient: Operationoutcome_issueCode.Transient;
    Exception: Operationoutcome_issueCode.Exception;
    Timeout: Operationoutcome_issueCode.Timeout;
    Incomplete: Operationoutcome_issueCode.Incomplete;
    Throttled: Operationoutcome_issueCode.Throttled;
    Informational: Operationoutcome_issueCode.Informational;
    _visit: <Result>(value: Operationoutcome_issueCode, visitor: Operationoutcome_issueCode._Visitor<Result>) => Result;
};
export declare namespace Operationoutcome_issueCode {
    type Invalid = "invalid" & {
        __Invalid: void;
    };
    type Structure = "structure" & {
        __Structure: void;
    };
    type Required = "required" & {
        __Required: void;
    };
    type Value = "value" & {
        __Value: void;
    };
    type Invariant = "invariant" & {
        __Invariant: void;
    };
    type Security = "security" & {
        __Security: void;
    };
    type Login = "login" & {
        __Login: void;
    };
    type Expired = "expired" & {
        __Expired: void;
    };
    type Forbidden = "forbidden" & {
        __Forbidden: void;
    };
    type Suppressed = "suppressed" & {
        __Suppressed: void;
    };
    type Processing = "processing" & {
        __Processing: void;
    };
    type Duplicate = "duplicate" & {
        __Duplicate: void;
    };
    type Deleted = "deleted" & {
        __Deleted: void;
    };
    type Extension = "extension" & {
        __Extension: void;
    };
    type Conflict = "conflict" & {
        __Conflict: void;
    };
    type Transient = "transient" & {
        __Transient: void;
    };
    type Exception = "exception" & {
        __Exception: void;
    };
    type Timeout = "timeout" & {
        __Timeout: void;
    };
    type Incomplete = "incomplete" & {
        __Incomplete: void;
    };
    type Throttled = "throttled" & {
        __Throttled: void;
    };
    type Informational = "informational" & {
        __Informational: void;
    };
    interface _Visitor<Result> {
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
