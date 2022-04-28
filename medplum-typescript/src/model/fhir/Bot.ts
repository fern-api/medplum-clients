import { Attachment } from "./Attachment";
import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { uri } from "./uri";

export interface Bot {
    resourceType: string | null | undefined;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    name: string | null | undefined;
    description: string | null | undefined;
    runtimeVersion: string | null | undefined;
    photo: Attachment | null | undefined;
    code: string | null | undefined;
    runAsUser: boolean | null | undefined;
}
