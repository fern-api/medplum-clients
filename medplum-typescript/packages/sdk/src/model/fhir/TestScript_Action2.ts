import { Extension } from "./Extension";
import { TestScript_Operation } from "./TestScript_Operation";

export interface TestScript_Action2 {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    operation: TestScript_Operation;
}
