import { code } from "./code";
import { id } from "./id";
import { instant } from "./instant";
import { Meta } from "./Meta";
import { Reference } from "./Reference";
import { uri } from "./uri";

export interface Login {
    resourceType: string | null | undefined;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    client: Reference | null | undefined;
    user: Reference | null | undefined;
    membership: Reference | null | undefined;
    scope: string | null | undefined;
    authMethod: string | null | undefined;
    authTime: instant | null | undefined;
    cookie: string | null | undefined;
    code: string | null | undefined;
    codeChallenge: string | null | undefined;
    codeChallengeMethod: string | null | undefined;
    refreshSecret: string | null | undefined;
    nonce: string | null | undefined;
    granted: boolean | null | undefined;
    revoked: boolean | null | undefined;
    compartments: Reference[] | null | undefined;
    admin: boolean | null | undefined;
    remoteAddress: string | null | undefined;
    userAgent: string | null | undefined;
}
