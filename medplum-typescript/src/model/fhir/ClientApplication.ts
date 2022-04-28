import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { uri } from "./uri";

export interface ClientApplication {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    name: string | null | undefined;
    description: string | null | undefined;
    secret: string;
    redirectUri: string | null | undefined;
}
