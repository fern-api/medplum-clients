package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTask_Input.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Task_Input {
  Optional<String> valueTime();

  Optional<String> valueUrl();

  Optional<String> valueUuid();

  Optional<SampledData> valueSampledData();

  Optional<String> id();

  Optional<String> valueDate();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<ContactDetail> valueContactDetail();

  Optional<Double> valueUnsignedInt();

  Optional<Attachment> valueAttachment();

  Optional<Expression> valueExpression();

  Optional<Ratio> valueRatio();

  Optional<Double> valueInteger();

  Optional<String> valueMarkdown();

  Optional<Money> valueMoney();

  Optional<Contributor> valueContributor();

  Optional<String> valueBase64Binary();

  Optional<Double> valueDecimal();

  Optional<Duration> valueDuration();

  Optional<Boolean> valueBoolean();

  Optional<Annotation> valueAnnotation();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueId();

  CodeableConcept type();

  Optional<Coding> valueCoding();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> valueCanonical();

  Optional<Reference> valueReference();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> valuePositiveInt();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<String> valueDateTime();

  Optional<String> valueUri();

  Optional<String> valueOid();

  Optional<HumanName> valueHumanName();

  Optional<Count> valueCount();

  Optional<Address> valueAddress();

  Optional<Identifier> valueIdentifier();

  Optional<UsageContext> valueUsageContext();

  Optional<Range> valueRange();

  Optional<String> valueCode();

  Optional<String> valueInstant();

  Optional<String> valueString();

  Optional<Quantity> valueQuantity();

  Optional<Dosage> valueDosage();

  Optional<Age> valueAge();

  Optional<List<Extension>> extension();

  Optional<Meta> valueMeta();

  Optional<Period> valuePeriod();

  Optional<Signature> valueSignature();

  Optional<Timing> valueTiming();

  Optional<Distance> valueDistance();

  Optional<ParameterDefinition> valueParameterDefinition();

  static ImmutableTask_Input.TypeBuildStage builder() {
    return ImmutableTask_Input.builder();
  }
}
