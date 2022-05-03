import { ExampleScenario_Alternative } from "./ExampleScenario_Alternative";
import { ExampleScenario_Operation } from "./ExampleScenario_Operation";
import { ExampleScenario_Process } from "./ExampleScenario_Process";
import { Extension } from "./Extension";
export interface ExampleScenario_Step {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    process: ExampleScenario_Process[] | null | undefined;
    pause: boolean | null | undefined;
    operation: ExampleScenario_Operation | null | undefined;
    alternative: ExampleScenario_Alternative[] | null | undefined;
}
