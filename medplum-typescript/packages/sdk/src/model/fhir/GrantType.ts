export type GrantType = GrantType.ClientCredentials;

export const GrantType = {
    ClientCredentials: "CLIENT_CREDENTIALS" as GrantType.ClientCredentials,

    _visit: <Result>(
        value: GrantType,
        visitor: GrantType._Visitor<Result>
    ): Result => {
        switch (value) {
            case GrantType.ClientCredentials:
                return visitor.clientCredentials();
            default:
                return visitor._unknown();
        }
    },
};

export declare namespace GrantType {
    export type ClientCredentials = "CLIENT_CREDENTIALS" & {
        __ClientCredentials: void;
    };

    export interface _Visitor<Result> {
        clientCredentials: () => Result;
        _unknown: () => Result;
    }
}
