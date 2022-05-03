import { Extension } from "./Extension";
import { markdown } from "./markdown";

export interface ExampleScenario_Version {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    versionId: string | null | undefined;
    description: markdown | null | undefined;
}
