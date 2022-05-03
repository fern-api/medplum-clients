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
  Optional<Distance> valueDistance();

  Optional<Quantity> valueQuantity();

  Optional<Address> valueAddress();

  Optional<HumanName> valueHumanName();

  Optional<Double> valueDecimal();

  Optional<String> valueCanonical();

  Optional<ContactDetail> valueContactDetail();

  Optional<Money> valueMoney();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> valueReference();

  CodeableConcept type();

  Optional<DataRequirement> valueDataRequirement();

  Optional<Double> valuePositiveInt();

  Optional<SampledData> valueSampledData();

  Optional<Ratio> valueRatio();

  Optional<Timing> valueTiming();

  Optional<Coding> valueCoding();

  Optional<Signature> valueSignature();

  Optional<String> valueCode();

  Optional<Boolean> valueBoolean();

  Optional<String> valueDate();

  Optional<Identifier> valueIdentifier();

  Optional<Expression> valueExpression();

  Optional<String> valueUrl();

  Optional<String> valueId();

  Optional<String> valueUuid();

  Optional<Range> valueRange();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<Duration> valueDuration();

  Optional<String> valueTime();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<String> valueOid();

  Optional<String> valueString();

  Optional<Age> valueAge();

  Optional<String> valueMarkdown();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Period> valuePeriod();

  Optional<UsageContext> valueUsageContext();

  Optional<Double> valueInteger();

  Optional<List<Extension>> extension();

  Optional<String> valueInstant();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> id();

  Optional<String> valueDateTime();

  Optional<Attachment> valueAttachment();

  Optional<Dosage> valueDosage();

  Optional<String> valueBase64Binary();

  Optional<Contributor> valueContributor();

  Optional<Meta> valueMeta();

  Optional<Annotation> valueAnnotation();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<String> valueUri();

  Optional<Count> valueCount();

  Optional<Double> valueUnsignedInt();

  static ImmutableTask_Input.TypeBuildStage builder() {
    return ImmutableTask_Input.builder();
  }
}
