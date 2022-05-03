import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { uri } from "./uri";
export interface Immunization_Education {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    documentType: string | null | undefined;
    reference: uri | null | undefined;
    publicationDate: dateTime | null | undefined;
    presentationDate: dateTime | null | undefined;
}
