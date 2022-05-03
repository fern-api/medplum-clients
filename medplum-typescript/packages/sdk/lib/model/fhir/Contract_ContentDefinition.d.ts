import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
import { Reference } from "./Reference";
export interface Contract_ContentDefinition {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    subType: CodeableConcept | null | undefined;
    publisher: Reference | null | undefined;
    publicationDate: dateTime | null | undefined;
    publicationStatus: code | null | undefined;
    copyright: markdown | null | undefined;
}
