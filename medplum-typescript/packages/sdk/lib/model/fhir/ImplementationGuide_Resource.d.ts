import { Extension } from "./Extension";
import { id } from "./id";
import { Implementationguide_resourceFhirversionItem } from "./Implementationguide_resourceFhirversionItem";
import { Reference } from "./Reference";
export interface ImplementationGuide_Resource {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    reference: Reference;
    fhirVersion: Implementationguide_resourceFhirversionItem[] | null | undefined;
    name: string | null | undefined;
    description: string | null | undefined;
    exampleBoolean: boolean | null | undefined;
    exampleCanonical: string | null | undefined;
    groupingId: id | null | undefined;
}
