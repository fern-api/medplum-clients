import { code } from "./code";
import { CodeableConcept } from "./CodeableConcept";
import { Extension } from "./Extension";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Narrative } from "./Narrative";
import { ObservationdefinitionPermitteddatatypeItem } from "./ObservationdefinitionPermitteddatatypeItem";
import { ObservationDefinition_QualifiedInterval } from "./ObservationDefinition_QualifiedInterval";
import { ObservationDefinition_QuantitativeDetails } from "./ObservationDefinition_QuantitativeDetails";
import { Reference } from "./Reference";
import { ResourceList } from "./ResourceList";
import { uri } from "./uri";

export interface ObservationDefinition {
    resourceType: string;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    text: Narrative | null | undefined;
    contained: ResourceList[] | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    category: CodeableConcept[] | null | undefined;
    code: CodeableConcept;
    identifier: Identifier[] | null | undefined;
    permittedDataType:
        | ObservationdefinitionPermitteddatatypeItem[]
        | null
        | undefined;
    multipleResultsAllowed: boolean | null | undefined;
    method: CodeableConcept | null | undefined;
    preferredReportName: string | null | undefined;
    quantitativeDetails:
        | ObservationDefinition_QuantitativeDetails
        | null
        | undefined;
    qualifiedInterval:
        | ObservationDefinition_QualifiedInterval[]
        | null
        | undefined;
    validCodedValueSet: Reference | null | undefined;
    normalCodedValueSet: Reference | null | undefined;
    abnormalCodedValueSet: Reference | null | undefined;
    criticalCodedValueSet: Reference | null | undefined;
}
