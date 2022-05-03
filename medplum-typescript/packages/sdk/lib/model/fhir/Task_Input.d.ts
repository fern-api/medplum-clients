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
import { Timing } from "./Timing";
import { TriggerDefinition } from "./TriggerDefinition";
import { UsageContext } from "./UsageContext";
export interface Task_Input {
    id: string | null | undefined;
    extension: Extension[] | null | undefined;
    modifierExtension: Extension[] | null | undefined;
    type: CodeableConcept;
    valueBase64Binary: string | null | undefined;
    valueBoolean: boolean | null | undefined;
    valueCanonical: string | null | undefined;
    valueCode: string | null | undefined;
    valueDate: string | null | undefined;
    valueDateTime: string | null | undefined;
    valueDecimal: number | null | undefined;
    valueId: string | null | undefined;
    valueInstant: string | null | undefined;
    valueInteger: number | null | undefined;
    valueMarkdown: string | null | undefined;
    valueOid: string | null | undefined;
    valuePositiveInt: number | null | undefined;
    valueString: string | null | undefined;
    valueTime: string | null | undefined;
    valueUnsignedInt: number | null | undefined;
    valueUri: string | null | undefined;
    valueUrl: string | null | undefined;
    valueUuid: string | null | undefined;
    valueAddress: Address | null | undefined;
    valueAge: Age | null | undefined;
    valueAnnotation: Annotation | null | undefined;
    valueAttachment: Attachment | null | undefined;
    valueCodeableConcept: CodeableConcept | null | undefined;
    valueCoding: Coding | null | undefined;
    valueContactPoint: ContactPoint | null | undefined;
    valueCount: Count | null | undefined;
    valueDistance: Distance | null | undefined;
    valueDuration: Duration | null | undefined;
    valueHumanName: HumanName | null | undefined;
    valueIdentifier: Identifier | null | undefined;
    valueMoney: Money | null | undefined;
    valuePeriod: Period | null | undefined;
    valueQuantity: Quantity | null | undefined;
    valueRange: Range | null | undefined;
    valueRatio: Ratio | null | undefined;
    valueReference: Reference | null | undefined;
    valueSampledData: SampledData | null | undefined;
    valueSignature: Signature | null | undefined;
    valueTiming: Timing | null | undefined;
    valueContactDetail: ContactDetail | null | undefined;
    valueContributor: Contributor | null | undefined;
    valueDataRequirement: DataRequirement | null | undefined;
    valueExpression: Expression | null | undefined;
    valueParameterDefinition: ParameterDefinition | null | undefined;
    valueRelatedArtifact: RelatedArtifact | null | undefined;
    valueTriggerDefinition: TriggerDefinition | null | undefined;
    valueUsageContext: UsageContext | null | undefined;
    valueDosage: Dosage | null | undefined;
    valueMeta: Meta | null | undefined;
}
