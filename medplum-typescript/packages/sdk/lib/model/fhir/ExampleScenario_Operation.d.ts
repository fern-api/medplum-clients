import { ExampleScenario_ContainedInstance } from "./ExampleScenario_ContainedInstance";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
export interface ExampleScenario_Operation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    number: string | null | undefined;
    type: string | null | undefined;
    name: string | null | undefined;
    initiator: string | null | undefined;
    receiver: string | null | undefined;
    description: markdown | null | undefined;
    initiatorActive: boolean | null | undefined;
    receiverActive: boolean | null | undefined;
    request: ExampleScenario_ContainedInstance | null | undefined;
    response: ExampleScenario_ContainedInstance | null | undefined;
}
