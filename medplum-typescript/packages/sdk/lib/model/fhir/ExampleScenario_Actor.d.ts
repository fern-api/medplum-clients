import { Examplescenario_actorType } from "./Examplescenario_actorType";
import { Extension } from "./Extension";
import { markdown } from "./markdown";
export interface ExampleScenario_Actor {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    actorId: string | null | undefined;
    type: Examplescenario_actorType | null | undefined;
    name: string | null | undefined;
    description: markdown | null | undefined;
}
