import { ExampleScenario_Step } from "./ExampleScenario_Step";
import { Extension } from "./Extension";
import { markdown } from "./markdown";

export interface ExampleScenario_Alternative {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    title: string | null | undefined;
    description: markdown | null | undefined;
    step: ExampleScenario_Step[] | null | undefined;
}
