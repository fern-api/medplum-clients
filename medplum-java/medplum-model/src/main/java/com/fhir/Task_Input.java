package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> valueBase64Binary();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueUuid();

  Optional<Reference> valueReference();

  Optional<Identifier> valueIdentifier();

  Optional<String> valueCode();

  Optional<SampledData> valueSampledData();

  Optional<Duration> valueDuration();

  Optional<HumanName> valueHumanName();

  Optional<Expression> valueExpression();

  Optional<String> valueUri();

  Optional<ContactDetail> valueContactDetail();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<String> valueId();

  Optional<Contributor> valueContributor();

  Optional<String> valueDateTime();

  Optional<Signature> valueSignature();

  Optional<Annotation> valueAnnotation();

  Optional<Quantity> valueQuantity();

  Optional<String> valueCanonical();

  Optional<ContactPoint> valueContactPoint();

  Optional<Double> valuePositiveInt();

  Optional<Coding> valueCoding();

  Optional<UsageContext> valueUsageContext();

  Optional<Period> valuePeriod();

  Optional<Double> valueDecimal();

  Optional<Range> valueRange();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueUrl();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<Distance> valueDistance();

  Optional<Age> valueAge();

  Optional<Boolean> valueBoolean();

  Optional<String> valueInstant();

  Optional<String> valueTime();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Dosage> valueDosage();

  Optional<Attachment> valueAttachment();

  Optional<Double> valueUnsignedInt();

  Optional<Meta> valueMeta();

  Optional<String> id();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Money> valueMoney();

  Optional<String> valueDate();

  Optional<String> valueOid();

  Optional<Ratio> valueRatio();

  Optional<String> valueString();

  Optional<Address> valueAddress();

  Optional<Double> valueInteger();

  Optional<String> valueMarkdown();

  Optional<List<Extension>> extension();

  Optional<Timing> valueTiming();

  CodeableConcept type();

  Optional<Count> valueCount();

  static ImmutableTask_Input.TypeBuildStage builder() {
    return ImmutableTask_Input.builder();
  }
}
