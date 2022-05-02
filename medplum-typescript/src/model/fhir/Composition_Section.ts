import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Composition_Section } from "./Composition_Section";
import { Extension } from "./Extension";
import { Narrative } from "./Narrative";
import { Reference } from "./Reference";

export interface Composition_Section {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    title: string | null | undefined;
    code: CodeableConcept | null | undefined;
    author: Reference[] | null | undefined;
    focus: Reference | null | undefined;
    text: Narrative | null | undefined;
    mode: code | null | undefined;
    orderedBy: CodeableConcept | null | undefined;
    entry: Reference[] | null | undefined;
    emptyReason: CodeableConcept | null | undefined;
    section: Composition_Section[] | null | undefined;
}
