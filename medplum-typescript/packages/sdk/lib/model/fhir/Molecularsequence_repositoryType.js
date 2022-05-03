"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Molecularsequence_repositoryType = void 0;
exports.Molecularsequence_repositoryType = {
    Directlink: "directlink",
    Openapi: "openapi",
    Login: "login",
    Oauth: "oauth",
    Other: "other",
    _visit: (value, visitor) => {
        switch (value) {
            case exports.Molecularsequence_repositoryType.Directlink:
                return visitor.directlink();
            case exports.Molecularsequence_repositoryType.Openapi:
                return visitor.openapi();
            case exports.Molecularsequence_repositoryType.Login:
                return visitor.login();
            case exports.Molecularsequence_repositoryType.Oauth:
                return visitor.oauth();
            case exports.Molecularsequence_repositoryType.Other:
                return visitor.other();
            default:
                return visitor._unknown();
        }
    },
};
//# sourceMappingURL=Molecularsequence_repositoryType.js.map