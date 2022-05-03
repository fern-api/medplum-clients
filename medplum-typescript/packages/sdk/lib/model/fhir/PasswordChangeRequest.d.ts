import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { Reference } from "./Reference";
import { uri } from "./uri";
export interface PasswordChangeRequest {
    resourceType: string | null | undefined;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    user: Reference | null | undefined;
    secret: string | null | undefined;
    used: boolean | null | undefined;
    redirectUri: string | null | undefined;
}
