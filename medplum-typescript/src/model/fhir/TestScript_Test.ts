import { Extension } from "./Extension";
import { TestScript_Action1 } from "./TestScript_Action1";

export interface TestScript_Test {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    description: string | null | undefined;
    action: TestScript_Action1[];
}
