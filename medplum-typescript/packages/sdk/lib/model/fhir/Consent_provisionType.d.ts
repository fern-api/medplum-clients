export declare type Consent_provisionType = Consent_provisionType.Deny | Consent_provisionType.Permit;
export declare const Consent_provisionType: {
    Deny: Consent_provisionType.Deny;
    Permit: Consent_provisionType.Permit;
    _visit: <Result>(value: Consent_provisionType, visitor: Consent_provisionType._Visitor<Result>) => Result;
};
export declare namespace Consent_provisionType {
    type Deny = "deny" & {
        __Deny: void;
    };
    type Permit = "permit" & {
        __Permit: void;
    };
    interface _Visitor<Result> {
        deny: () => Result;
        permit: () => Result;
        _unknown: () => Result;
    }
}
