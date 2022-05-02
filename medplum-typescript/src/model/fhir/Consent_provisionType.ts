export type Consent_provisionType =
    | Consent_provisionType.Deny
    | Consent_provisionType.Permit;

export const Consent_provisionType = {
    Deny: "deny" as Consent_provisionType.Deny,
    Permit: "permit" as Consent_provisionType.Permit,

    _visit: <Result>(
        value: Consent_provisionType,
        visitor: Consent_provisionType._Visitor<Result>
    ): Result => {
        switch (value) {
            case Consent_provisionType.Deny:
                return visitor.deny();
            case Consent_provisionType.Permit:
                return visitor.permit();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace Consent_provisionType {
    export type Deny = "deny" & {
        __Deny: void;
    };
    export type Permit = "permit" & {
        __Permit: void;
    };

    export interface _Visitor<Result> {
        deny: () => Result;
        permit: () => Result;
        _unknown: () => Result;
    }
}
