import { ContactPoint } from "./ContactPoint";
import { Extension } from "./Extension";

export interface ContactDetail {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    name: string | null | undefined;
    telecom: ContactPoint[] | null | undefined;
}
