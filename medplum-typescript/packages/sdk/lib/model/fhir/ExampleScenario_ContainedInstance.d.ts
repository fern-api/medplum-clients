import { Extension } from "./Extension";
export interface ExampleScenario_ContainedInstance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    resourceId: string | null | undefined;
    versionId: string | null | undefined;
}
