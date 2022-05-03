import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { uri } from "./uri";
export interface User {
    resourceType: string | null | undefined;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    email: string;
    passwordHash: string;
    admin: boolean | null | undefined;
}
