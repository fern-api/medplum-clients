import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { Reference } from "./Reference";

export interface List_Entry {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    flag: CodeableConcept | null | undefined;
    deleted: boolean | null | undefined;
    date: dateTime | null | undefined;
    item: Reference;
}
