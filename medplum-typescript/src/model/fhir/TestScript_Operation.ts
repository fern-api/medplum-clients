import { code } from "./code";
import { Coding } from "./Coding";
import { Extension } from "./Extension";
import { id } from "./id";
import { Testscript_operationMethod } from "./Testscript_operationMethod";
import { TestScript_RequestHeader } from "./TestScript_RequestHeader";

export interface TestScript_Operation {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: Coding | null | undefined;
    resource: code | null | undefined;
    label: string | null | undefined;
    description: string | null | undefined;
    accept: code | null | undefined;
    contentType: code | null | undefined;
    destination: number | null | undefined;
    encodeRequestUrl: boolean | null | undefined;
    method: Testscript_operationMethod | null | undefined;
    origin: number | null | undefined;
    params: string | null | undefined;
    requestHeader: TestScript_RequestHeader[] | null | undefined;
    requestId: id | null | undefined;
    responseId: id | null | undefined;
    sourceId: id | null | undefined;
    targetId: id | null | undefined;
    url: string | null | undefined;
}
