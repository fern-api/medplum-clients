import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Coverage_Class } from "./Coverage_Class";
import { Coverage_CostToBeneficiary } from "./Coverage_CostToBeneficiary";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { positiveInt } from "./positiveInt";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface Coverage {
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
    status: code | null | undefined;
    type: CodeableConcept | null | undefined;
    policyHolder: Reference | null | undefined;
    subscriber: Reference | null | undefined;
    subscriberId: string | null | undefined;
    beneficiary: Reference;
    dependent: string | null | undefined;
    relationship: CodeableConcept | null | undefined;
    period: Period | null | undefined;
    payor: Reference[];
    class: Coverage_Class[] | null | undefined;
    order: positiveInt | null | undefined;
    network: string | null | undefined;
    costToBeneficiary: Coverage_CostToBeneficiary[] | null | undefined;
    subrogation: boolean | null | undefined;
    contract: Reference[] | null | undefined;
}
