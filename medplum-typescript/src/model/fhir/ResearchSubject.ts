import { code } from "./code";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResearchsubjectStatus } from "./ResearchsubjectStatus";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface ResearchSubject {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    identifier: Identifier[] | null | undefined;
    status: ResearchsubjectStatus | null | undefined;
    period: Period | null | undefined;
    study: Reference;
    individual: Reference;
    assignedArm: string | null | undefined;
    actualArm: string | null | undefined;
    consent: Reference | null | undefined;
}
