import { Extension } from "./Extension";
import { TestReport_Assert } from "./TestReport_Assert";
import { TestReport_Operation } from "./TestReport_Operation";

export interface TestReport_Action1 {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    operation: TestReport_Operation | null | undefined;
    assert: TestReport_Assert | null | undefined;
}
