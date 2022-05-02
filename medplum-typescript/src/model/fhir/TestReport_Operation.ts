import { Extension } from "./Extension";
import { markdown } from "./markdown";
import { Testreport_operationResult } from "./Testreport_operationResult";
import { uri } from "./uri";

export interface TestReport_Operation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    result: Testreport_operationResult | null | undefined;
    message: markdown | null | undefined;
    detail: uri | null | undefined;
}
