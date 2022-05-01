import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { dateTime } from "./dateTime";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { MedicinalProductAuthorization_JurisdictionalAuthorization } from "./MedicinalProductAuthorization_JurisdictionalAuthorization";
import { MedicinalProductAuthorization_Procedure } from "./MedicinalProductAuthorization_Procedure";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { Period } from "./Period";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface MedicinalProductAuthorization {
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
    subject: Reference | null | undefined;
    country: CodeableConcept[] | null | undefined;
    jurisdiction: CodeableConcept[] | null | undefined;
    status: CodeableConcept | null | undefined;
    statusDate: dateTime | null | undefined;
    restoreDate: dateTime | null | undefined;
    validityPeriod: Period | null | undefined;
    dataExclusivityPeriod: Period | null | undefined;
    dateOfFirstAuthorization: dateTime | null | undefined;
    internationalBirthDate: dateTime | null | undefined;
    legalBasis: CodeableConcept | null | undefined;
    jurisdictionalAuthorization:
        | MedicinalProductAuthorization_JurisdictionalAuthorization[]
        | null
        | undefined;
    holder: Reference | null | undefined;
    regulator: Reference | null | undefined;
    procedure: MedicinalProductAuthorization_Procedure | null | undefined;
}
