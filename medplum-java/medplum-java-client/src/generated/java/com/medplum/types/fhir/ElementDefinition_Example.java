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
    as = ImmutableElementDefinition_Example.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Example {
  Optional<String> valueCode();

  Optional<String> label();

  Optional<Boolean> valueBoolean();

  Optional<String> id();

  Optional<Timing> valueTiming();

  Optional<String> valueBase64Binary();

  Optional<Reference> valueReference();

  Optional<String> valueDateTime();

  Optional<Double> valueDecimal();

  Optional<HumanName> valueHumanName();

  Optional<ContactDetail> valueContactDetail();

  Optional<Contributor> valueContributor();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Address> valueAddress();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Range> valueRange();

  Optional<String> valueDate();

  Optional<Expression> valueExpression();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<String> valueCanonical();

  Optional<Attachment> valueAttachment();

  Optional<String> valueMarkdown();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> valueId();

  Optional<Annotation> valueAnnotation();

  Optional<String> valueString();

  Optional<Signature> valueSignature();

  Optional<Identifier> valueIdentifier();

  Optional<Dosage> valueDosage();

  Optional<Ratio> valueRatio();

  Optional<Coding> valueCoding();

  Optional<Double> valueInteger();

  Optional<String> valueUri();

  Optional<String> valueTime();

  Optional<String> valueUuid();

  Optional<Distance> valueDistance();

  Optional<Period> valuePeriod();

  Optional<String> valueOid();

  Optional<String> valueInstant();

  Optional<Quantity> valueQuantity();

  Optional<Money> valueMoney();

  Optional<String> valueUrl();

  Optional<Double> valuePositiveInt();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Double> valueUnsignedInt();

  Optional<SampledData> valueSampledData();

  Optional<UsageContext> valueUsageContext();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Age> valueAge();

  Optional<Count> valueCount();

  Optional<Meta> valueMeta();

  Optional<Duration> valueDuration();

  Optional<DataRequirement> valueDataRequirement();

  static ImmutableElementDefinition_Example.Builder builder() {
    return ImmutableElementDefinition_Example.builder();
  }
}
