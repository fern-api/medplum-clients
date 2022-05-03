import { Extension } from "./Extension";
import { TestScript_Assert } from "./TestScript_Assert";
import { TestScript_Operation } from "./TestScript_Operation";

export interface TestScript_Action {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    operation: TestScript_Operation | null | undefined;
    assert: TestScript_Assert | null | undefined;
}
