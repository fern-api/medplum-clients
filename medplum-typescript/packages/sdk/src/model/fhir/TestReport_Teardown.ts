import { Extension } from "./Extension";
import { TestReport_Action2 } from "./TestReport_Action2";

export interface TestReport_Teardown {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    action: TestReport_Action2[];
}
