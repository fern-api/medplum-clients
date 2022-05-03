import { canonical } from "./canonical";
import { Extension } from "./Extension";
import { id } from "./id";
export interface ImplementationGuide_DependsOn {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    uri: canonical;
    packageId: id | null | undefined;
    version: string | null | undefined;
}
