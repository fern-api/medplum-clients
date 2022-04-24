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
    as = ImmutableTask_Output.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Task_Output {
  Optional<Double> valueDecimal();

  Optional<String> valueUuid();

  Optional<String> valueInstant();

  Optional<Range> valueRange();

  Optional<Annotation> valueAnnotation();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Double> valueInteger();

  Optional<String> valueMarkdown();

  Optional<Double> valuePositiveInt();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<List<Extension>> extension();

  Optional<ContactPoint> valueContactPoint();

  Optional<Signature> valueSignature();

  Optional<String> valueCode();

  Optional<Count> valueCount();

  Optional<String> valueBase64Binary();

  Optional<Double> valueUnsignedInt();

  Optional<Quantity> valueQuantity();

  Optional<Ratio> valueRatio();

  Optional<Dosage> valueDosage();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<ContactDetail> valueContactDetail();

  Optional<Contributor> valueContributor();

  Optional<String> valueOid();

  Optional<Money> valueMoney();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Reference> valueReference();

  Optional<Attachment> valueAttachment();

  Optional<Boolean> valueBoolean();

  Optional<String> valueCanonical();

  Optional<Distance> valueDistance();

  Optional<String> valueUri();

  Optional<Age> valueAge();

  Optional<Address> valueAddress();

  Optional<String> valueString();

  Optional<String> valueDateTime();

  Optional<Duration> valueDuration();

  Optional<Timing> valueTiming();

  Optional<DataRequirement> valueDataRequirement();

  Optional<Period> valuePeriod();

  Optional<HumanName> valueHumanName();

  Optional<Expression> valueExpression();

  Optional<UsageContext> valueUsageContext();

  CodeableConcept type();

  Optional<String> valueUrl();

  Optional<Coding> valueCoding();

  Optional<Meta> valueMeta();

  Optional<String> valueDate();

  Optional<String> valueId();

  Optional<String> valueTime();

  Optional<SampledData> valueSampledData();

  Optional<Identifier> valueIdentifier();

  static ImmutableTask_Output.TypeBuildStage builder() {
    return ImmutableTask_Output.builder();
  }
}
