import { Extension } from "./Extension";
import { TestScript_Action } from "./TestScript_Action";

export interface TestScript_Setup {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    action: TestScript_Action[];
}
