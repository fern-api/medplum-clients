import { Extension } from "./Extension";
import { markdown } from "./markdown";
import { Testreport_assertResult } from "./Testreport_assertResult";

export interface TestReport_Assert {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    result: Testreport_assertResult | null | undefined;
    message: markdown | null | undefined;
    detail: string | null | undefined;
}
