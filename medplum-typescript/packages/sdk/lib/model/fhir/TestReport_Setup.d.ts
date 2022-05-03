import { Extension } from "./Extension";
import { TestReport_Action } from "./TestReport_Action";
export interface TestReport_Setup {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    action: TestReport_Action[];
}
