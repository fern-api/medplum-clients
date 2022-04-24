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
    as = ImmutableElementDefinition_Example.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Example {
  Optional<String> valueUrl();

  Optional<List<Extension>> modifierExtension();

  Optional<Duration> valueDuration();

  Optional<Contributor> valueContributor();

  Optional<Identifier> valueIdentifier();

  Optional<Expression> valueExpression();

  Optional<String> label();

  Optional<List<Extension>> extension();

  Optional<Coding> valueCoding();

  Optional<HumanName> valueHumanName();

  Optional<Signature> valueSignature();

  Optional<String> valueId();

  Optional<String> valueBase64Binary();

  Optional<Distance> valueDistance();

  Optional<String> valueMarkdown();

  Optional<Double> valueInteger();

  Optional<SampledData> valueSampledData();

  Optional<Count> valueCount();

  Optional<String> valueDate();

  Optional<String> valueString();

  Optional<String> valueDateTime();

  Optional<Period> valuePeriod();

  Optional<DataRequirement> valueDataRequirement();

  Optional<Double> valueDecimal();

  Optional<Quantity> valueQuantity();

  Optional<Reference> valueReference();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> valueUri();

  Optional<String> valueCanonical();

  Optional<Money> valueMoney();

  Optional<ContactDetail> valueContactDetail();

  Optional<String> valueUuid();

  Optional<Double> valuePositiveInt();

  Optional<Timing> valueTiming();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<String> id();

  Optional<Range> valueRange();

  Optional<Age> valueAge();

  Optional<String> valueInstant();

  Optional<Double> valueUnsignedInt();

  Optional<Annotation> valueAnnotation();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Ratio> valueRatio();

  Optional<Dosage> valueDosage();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<String> valueOid();

  Optional<Boolean> valueBoolean();

  Optional<Attachment> valueAttachment();

  Optional<UsageContext> valueUsageContext();

  Optional<Meta> valueMeta();

  Optional<String> valueCode();

  Optional<String> valueTime();

  Optional<Address> valueAddress();

  static ImmutableElementDefinition_Example.Builder builder() {
    return ImmutableElementDefinition_Example.builder();
  }
}
