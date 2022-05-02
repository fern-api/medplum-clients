import { Extension } from "./Extension";
import { Patient_linkType } from "./Patient_linkType";
import { Reference } from "./Reference";

export interface Patient_Link {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    other: Reference;
    type: Patient_linkType | null | undefined;
}
