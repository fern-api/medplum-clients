import { code } from "./code";
import { Extension } from "./Extension";
import { id } from "./id";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { OperationOutcome_Issue } from "./OperationOutcome_Issue";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface OperationOutcome {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    issue: OperationOutcome_Issue[];
    status: number | null | undefined;
    resource: ResourceList | null | undefined;
}
