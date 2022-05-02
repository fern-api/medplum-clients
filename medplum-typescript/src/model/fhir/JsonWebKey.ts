import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { uri } from "./uri";

export interface JsonWebKey {
    resourceType: string | null | undefined;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    active: boolean | null | undefined;
    alg: string | null | undefined;
    kty: string | null | undefined;
    use: string | null | undefined;
    key_ops: string[] | null | undefined;
    x5c: string[] | null | undefined;
    n: string | null | undefined;
    e: string | null | undefined;
    kid: string | null | undefined;
    x5t: string | null | undefined;
    d: string | null | undefined;
    p: string | null | undefined;
    q: string | null | undefined;
    dp: string | null | undefined;
    dq: string | null | undefined;
    qi: string | null | undefined;
}
