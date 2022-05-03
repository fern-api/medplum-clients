import { code } from "./code";
import { ExampleScenario_ContainedInstance } from "./ExampleScenario_ContainedInstance";
import { ExampleScenario_Version } from "./ExampleScenario_Version";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
export interface ExampleScenario_Instance {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    resourceId: string | null | undefined;
    resourceType: code | null | undefined;
    name: string | null | undefined;
    description: markdown | null | undefined;
    version: ExampleScenario_Version[] | null | undefined;
    containedInstance: ExampleScenario_ContainedInstance[] | null | undefined;
}
