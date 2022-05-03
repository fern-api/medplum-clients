import { Extension } from "./Extension";
import { TestReport_Action1 } from "./TestReport_Action1";
export interface TestReport_Test {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    name: string | null | undefined;
    description: string | null | undefined;
    action: TestReport_Action1[];
}
