import { AccessPolicy_Resource } from "./AccessPolicy_Resource";
import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { Reference } from "./Reference";
import { uri } from "./uri";

export interface AccessPolicy {
    resourceType: string | null | undefined;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    name: string | null | undefined;
    compartment: Reference | null | undefined;
    resource: AccessPolicy_Resource[] | null | undefined;
}
