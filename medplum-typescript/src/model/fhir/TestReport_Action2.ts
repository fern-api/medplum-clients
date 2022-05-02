import { Extension } from "./Extension";
import { TestReport_Operation } from "./TestReport_Operation";

export interface TestReport_Action2 {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    operation: TestReport_Operation;
}
