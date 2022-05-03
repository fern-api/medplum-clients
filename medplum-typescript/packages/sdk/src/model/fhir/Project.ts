import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { Reference } from "./Reference";
import { uri } from "./uri";

export interface Project {
    resourceType: string | null | undefined;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    name: string;
    description: string | null | undefined;
    owner: Reference;
    features: code[] | null | undefined;
    defaultPatientAccessPolicy: Reference | null | undefined;
}
