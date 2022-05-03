export declare type Molecularsequence_repositoryType = Molecularsequence_repositoryType.Directlink | Molecularsequence_repositoryType.Openapi | Molecularsequence_repositoryType.Login | Molecularsequence_repositoryType.Oauth | Molecularsequence_repositoryType.Other;
export declare const Molecularsequence_repositoryType: {
    Directlink: Molecularsequence_repositoryType.Directlink;
    Openapi: Molecularsequence_repositoryType.Openapi;
    Login: Molecularsequence_repositoryType.Login;
    Oauth: Molecularsequence_repositoryType.Oauth;
    Other: Molecularsequence_repositoryType.Other;
    _visit: <Result>(value: Molecularsequence_repositoryType, visitor: Molecularsequence_repositoryType._Visitor<Result>) => Result;
};
export declare namespace Molecularsequence_repositoryType {
    type Directlink = "directlink" & {
        __Directlink: void;
    };
    type Openapi = "openapi" & {
        __Openapi: void;
    };
    type Login = "login" & {
        __Login: void;
    };
    type Oauth = "oauth" & {
        __Oauth: void;
    };
    type Other = "other" & {
        __Other: void;
    };
    interface _Visitor<Result> {
        directlink: () => Result;
        openapi: () => Result;
        login: () => Result;
        oauth: () => Result;
        other: () => Result;
        _unknown: () => Result;
    }
}
