import { AccountStatus } from "./AccountStatus";
import { Account_Coverage } from "./Account_Coverage";
import { Account_Guarantor } from "./Account_Guarantor";
import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface Account {
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
    status: AccountStatus | null | undefined;
    type: CodeableConcept | null | undefined;
    name: string | null | undefined;
    subject: Reference[] | null | undefined;
    servicePeriod: Period | null | undefined;
    coverage: Account_Coverage[] | null | undefined;
    owner: Reference | null | undefined;
    description: string | null | undefined;
    guarantor: Account_Guarantor[] | null | undefined;
    partOf: Reference | null | undefined;
}
