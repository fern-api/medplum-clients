import { Extension } from "./Extension";
import { ImplementationGuide_Grouping } from "./ImplementationGuide_Grouping";
import { ImplementationGuide_Page } from "./ImplementationGuide_Page";
import { ImplementationGuide_Parameter } from "./ImplementationGuide_Parameter";
import { ImplementationGuide_Resource } from "./ImplementationGuide_Resource";
import { ImplementationGuide_Template } from "./ImplementationGuide_Template";
export interface ImplementationGuide_Definition {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    grouping: ImplementationGuide_Grouping[] | null | undefined;
    resource: ImplementationGuide_Resource[];
    page: ImplementationGuide_Page | null | undefined;
    parameter: ImplementationGuide_Parameter[] | null | undefined;
    template: ImplementationGuide_Template[] | null | undefined;
}
