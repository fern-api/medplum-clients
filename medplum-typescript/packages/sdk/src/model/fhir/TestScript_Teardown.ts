import { Extension } from "./Extension";
import { TestScript_Action2 } from "./TestScript_Action2";

export interface TestScript_Teardown {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    action: TestScript_Action2[];
}
