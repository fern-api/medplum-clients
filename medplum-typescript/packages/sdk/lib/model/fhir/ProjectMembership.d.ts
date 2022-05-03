import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { Reference } from "./Reference";
import { uri } from "./uri";
export interface ProjectMembership {
    resourceType: string | null | undefined;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    project: Reference;
    user: Reference;
    profile: Reference;
    accessPolicy: Reference | null | undefined;
    userConfiguration: Reference | null | undefined;
    admin: boolean | null | undefined;
}
