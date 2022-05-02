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
  Optional<Timing> valueTiming();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Range> valueRange();

  Optional<String> valueDateTime();

  Optional<String> valueCode();

  Optional<String> valueTime();

  Optional<String> valueCanonical();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Expression> valueExpression();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Reference> valueReference();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<String> valueUri();

  Optional<ContactPoint> valueContactPoint();

  Optional<Period> valuePeriod();

  Optional<String> valueBase64Binary();

  Optional<UsageContext> valueUsageContext();

  Optional<Signature> valueSignature();

  Optional<SampledData> valueSampledData();

  Optional<Coding> valueCoding();

  Optional<Duration> valueDuration();

  Optional<HumanName> valueHumanName();

  Optional<String> valueOid();

  Optional<Age> valueAge();

  Optional<String> valueDate();

  Optional<String> valueInstant();

  Optional<Identifier> valueIdentifier();

  Optional<String> valueId();

  Optional<Contributor> valueContributor();

  Optional<String> valueString();

  Optional<Annotation> valueAnnotation();

  Optional<Ratio> valueRatio();

  Optional<Double> valueInteger();

  CodeableConcept type();

  Optional<String> valueMarkdown();

  Optional<Double> valueUnsignedInt();

  Optional<Double> valueDecimal();

  Optional<Money> valueMoney();

  Optional<String> valueUuid();

  Optional<DataRequirement> valueDataRequirement();

  Optional<Distance> valueDistance();

  Optional<List<Extension>> modifierExtension();

  Optional<Dosage> valueDosage();

  Optional<Double> valuePositiveInt();

  Optional<String> valueUrl();

  Optional<Count> valueCount();

  Optional<Meta> valueMeta();

  Optional<Address> valueAddress();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<Attachment> valueAttachment();

  Optional<Quantity> valueQuantity();

  Optional<Boolean> valueBoolean();

  Optional<ContactDetail> valueContactDetail();

  static ImmutableTask_Input.TypeBuildStage builder() {
    return ImmutableTask_Input.builder();
  }
}
