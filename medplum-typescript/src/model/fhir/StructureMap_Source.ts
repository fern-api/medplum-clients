import { Address } from "./Address";
import { Age } from "./Age";
import { Annotation } from "./Annotation";
import { Attachment } from "./Attachment";
import { CodeableConcept } from "./CodeableConcept";
import { Coding } from "./Coding";
import { ContactDetail } from "./ContactDetail";
import { ContactPoint } from "./ContactPoint";
import { Contributor } from "./Contributor";
import { Count } from "./Count";
import { DataRequirement } from "./DataRequirement";
import { Distance } from "./Distance";
import { Dosage } from "./Dosage";
import { Duration } from "./Duration";
import { Expression } from "./Expression";
import { Extension } from "./Extension";
import { HumanName } from "./HumanName";
import { id } from "./id";
import { Identifier } from "./Identifier";
import { Meta } from "./Meta";
import { Money } from "./Money";
import { ParameterDefinition } from "./ParameterDefinition";
import { Period } from "./Period";
import { Quantity } from "./Quantity";
import { Range } from "./Range";
import { Ratio } from "./Ratio";
import { Reference } from "./Reference";
import { RelatedArtifact } from "./RelatedArtifact";
import { SampledData } from "./SampledData";
import { Signature } from "./Signature";
import { Structuremap_sourceListmode } from "./Structuremap_sourceListmode";
import { Timing } from "./Timing";
import { TriggerDefinition } from "./TriggerDefinition";
import { UsageContext } from "./UsageContext";

export interface StructureMap_Source {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    context: id | null | undefined;
    min: number | null | undefined;
    max: string | null | undefined;
    type: string | null | undefined;
    defaultValueBase64Binary: string | null | undefined;
    defaultValueBoolean: boolean | null | undefined;
    defaultValueCanonical: string | null | undefined;
    defaultValueCode: string | null | undefined;
    defaultValueDate: string | null | undefined;
    defaultValueDateTime: string | null | undefined;
    defaultValueDecimal: number | null | undefined;
    defaultValueId: string | null | undefined;
    defaultValueInstant: string | null | undefined;
    defaultValueInteger: number | null | undefined;
    defaultValueMarkdown: string | null | undefined;
    defaultValueOid: string | null | undefined;
    defaultValuePositiveInt: number | null | undefined;
    defaultValueString: string | null | undefined;
    defaultValueTime: string | null | undefined;
    defaultValueUnsignedInt: number | null | undefined;
    defaultValueUri: string | null | undefined;
    defaultValueUrl: string | null | undefined;
    defaultValueUuid: string | null | undefined;
    defaultValueAddress: Address | null | undefined;
    defaultValueAge: Age | null | undefined;
    defaultValueAnnotation: Annotation | null | undefined;
    defaultValueAttachment: Attachment | null | undefined;
    defaultValueCodeableConcept: CodeableConcept | null | undefined;
    defaultValueCoding: Coding | null | undefined;
    defaultValueContactPoint: ContactPoint | null | undefined;
    defaultValueCount: Count | null | undefined;
    defaultValueDistance: Distance | null | undefined;
    defaultValueDuration: Duration | null | undefined;
    defaultValueHumanName: HumanName | null | undefined;
    defaultValueIdentifier: Identifier | null | undefined;
    defaultValueMoney: Money | null | undefined;
    defaultValuePeriod: Period | null | undefined;
    defaultValueQuantity: Quantity | null | undefined;
    defaultValueRange: Range | null | undefined;
    defaultValueRatio: Ratio | null | undefined;
    defaultValueReference: Reference | null | undefined;
    defaultValueSampledData: SampledData | null | undefined;
    defaultValueSignature: Signature | null | undefined;
    defaultValueTiming: Timing | null | undefined;
    defaultValueContactDetail: ContactDetail | null | undefined;
    defaultValueContributor: Contributor | null | undefined;
    defaultValueDataRequirement: DataRequirement | null | undefined;
    defaultValueExpression: Expression | null | undefined;
    defaultValueParameterDefinition: ParameterDefinition | null | undefined;
    defaultValueRelatedArtifact: RelatedArtifact | null | undefined;
    defaultValueTriggerDefinition: TriggerDefinition | null | undefined;
    defaultValueUsageContext: UsageContext | null | undefined;
    defaultValueDosage: Dosage | null | undefined;
    defaultValueMeta: Meta | null | undefined;
    element: string | null | undefined;
    listMode: Structuremap_sourceListmode | null | undefined;
    variable: id | null | undefined;
    condition: string | null | undefined;
    check: string | null | undefined;
    logMessage: string | null | undefined;
}