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
  Optional<Coding> valueCoding();

  Optional<Signature> valueSignature();

  Optional<Count> valueCount();

  Optional<String> valueMarkdown();

  Optional<Double> valueDecimal();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<Meta> valueMeta();

  Optional<Dosage> valueDosage();

  Optional<UsageContext> valueUsageContext();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Attachment> valueAttachment();

  CodeableConcept type();

  Optional<String> valueUri();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> valueOid();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Contributor> valueContributor();

  Optional<HumanName> valueHumanName();

  Optional<Boolean> valueBoolean();

  Optional<String> valueTime();

  Optional<String> valueCanonical();

  Optional<Annotation> valueAnnotation();

  Optional<Identifier> valueIdentifier();

  Optional<Double> valuePositiveInt();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueBase64Binary();

  Optional<Duration> valueDuration();

  Optional<Money> valueMoney();

  Optional<Expression> valueExpression();

  Optional<Timing> valueTiming();

  Optional<Quantity> valueQuantity();

  Optional<ContactDetail> valueContactDetail();

  Optional<Double> valueUnsignedInt();

  Optional<String> valueId();

  Optional<String> valueString();

  Optional<Distance> valueDistance();

  Optional<Address> valueAddress();

  Optional<String> valueUrl();

  Optional<Double> valueInteger();

  Optional<Ratio> valueRatio();

  Optional<Range> valueRange();

  Optional<String> valueUuid();

  Optional<Age> valueAge();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Period> valuePeriod();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Reference> valueReference();

  Optional<SampledData> valueSampledData();

  Optional<String> valueDate();

  Optional<String> valueInstant();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueCode();

  Optional<String> valueDateTime();

  static ImmutableTask_Input.TypeBuildStage builder() {
    return ImmutableTask_Input.builder();
  }
}
