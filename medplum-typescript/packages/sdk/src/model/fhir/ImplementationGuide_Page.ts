import { Extension } from "./Extension";
import { Implementationguide_pageGeneration } from "./Implementationguide_pageGeneration";
import { Reference } from "./Reference";

export interface ImplementationGuide_Page {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    nameUrl: string | null | undefined;
    nameReference: Reference | null | undefined;
    title: string | null | undefined;
    generation: Implementationguide_pageGeneration | null | undefined;
    page: ImplementationGuide_Page[] | null | undefined;
}
