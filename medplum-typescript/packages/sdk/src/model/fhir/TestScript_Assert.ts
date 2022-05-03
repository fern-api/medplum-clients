import { code } from "./code";
import { Extension } from "./Extension";
import { id } from "./id";
import { Testscript_assertDirection } from "./Testscript_assertDirection";
import { Testscript_assertOperator } from "./Testscript_assertOperator";
import { Testscript_assertRequestmethod } from "./Testscript_assertRequestmethod";
import { Testscript_assertResponse } from "./Testscript_assertResponse";

export interface TestScript_Assert {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    label: string | null | undefined;
    description: string | null | undefined;
    direction: Testscript_assertDirection | null | undefined;
    compareToSourceId: string | null | undefined;
    compareToSourceExpression: string | null | undefined;
    compareToSourcePath: string | null | undefined;
    contentType: code | null | undefined;
    expression: string | null | undefined;
    headerField: string | null | undefined;
    minimumId: string | null | undefined;
    navigationLinks: boolean | null | undefined;
    operator: Testscript_assertOperator | null | undefined;
    path: string | null | undefined;
    requestMethod: Testscript_assertRequestmethod | null | undefined;
    requestURL: string | null | undefined;
    resource: code | null | undefined;
    response: Testscript_assertResponse | null | undefined;
    responseCode: string | null | undefined;
    sourceId: id | null | undefined;
    validateProfileId: id | null | undefined;
    value: string | null | undefined;
    warningOnly: boolean | null | undefined;
}
