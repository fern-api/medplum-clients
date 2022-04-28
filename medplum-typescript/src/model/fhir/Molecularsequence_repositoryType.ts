export type Molecularsequence_repositoryType =
    | Molecularsequence_repositoryType.Directlink
    | Molecularsequence_repositoryType.Openapi
    | Molecularsequence_repositoryType.Login
    | Molecularsequence_repositoryType.Oauth
    | Molecularsequence_repositoryType.Other;

export const Molecularsequence_repositoryType = {
    Directlink: "directlink" as Molecularsequence_repositoryType.Directlink,
    Openapi: "openapi" as Molecularsequence_repositoryType.Openapi,
    Login: "login" as Molecularsequence_repositoryType.Login,
    Oauth: "oauth" as Molecularsequence_repositoryType.Oauth,
    Other: "other" as Molecularsequence_repositoryType.Other,

    _visit: <Result>(value: Molecularsequence_repositoryType, visitor: Molecularsequence_repositoryType._Visitor<Result>): Result => {
        switch (value) {
            case Molecularsequence_repositoryType.Directlink: return visitor.directlink();
            case Molecularsequence_repositoryType.Openapi: return visitor.openapi();
            case Molecularsequence_repositoryType.Login: return visitor.login();
            case Molecularsequence_repositoryType.Oauth: return visitor.oauth();
            case Molecularsequence_repositoryType.Other: return visitor.other();
            default: return visitor._unknown();
        }
    },
};

export declare namespace Molecularsequence_repositoryType {
    export type Directlink = "directlink" & {
        __Directlink: void,
    };
    export type Openapi = "openapi" & {
        __Openapi: void,
    };
    export type Login = "login" & {
        __Login: void,
    };
    export type Oauth = "oauth" & {
        __Oauth: void,
    };
    export type Other = "other" & {
        __Other: void,
    };

    export interface _Visitor<Result> {
        directlink: () => Result;
        openapi: () => Result;
        login: () => Result;
        oauth: () => Result;
        other: () => Result;
        _unknown: () => Result;
    }
}
