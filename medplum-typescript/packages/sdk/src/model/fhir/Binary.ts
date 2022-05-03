import { base64Binary } from "./base64Binary";
import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { Reference } from "./Reference";
import { uri } from "./uri";

export interface Binary {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    contentType: code | null | undefined;
    securityContext: Reference | null | undefined;
    data: base64Binary | null | undefined;
}
