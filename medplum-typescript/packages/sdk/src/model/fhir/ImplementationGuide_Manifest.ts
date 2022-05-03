import { Extension } from "./Extension";
import { ImplementationGuide_Page1 } from "./ImplementationGuide_Page1";
import { ImplementationGuide_Resource1 } from "./ImplementationGuide_Resource1";
import { url } from "./url";

export interface ImplementationGuide_Manifest {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    rendering: url | null | undefined;
    resource: ImplementationGuide_Resource1[];
    page: ImplementationGuide_Page1[] | null | undefined;
    image: string[] | null | undefined;
    other: string[] | null | undefined;
}
