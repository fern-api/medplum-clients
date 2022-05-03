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
  Optional<Double> valueDecimal();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<Signature> valueSignature();

  Optional<Period> valuePeriod();

  Optional<String> valueId();

  Optional<List<Extension>> extension();

  Optional<String> valueInstant();

  Optional<UsageContext> valueUsageContext();

  Optional<String> valueBase64Binary();

  Optional<String> valueUrl();

  Optional<Double> valuePositiveInt();

  Optional<String> valueDate();

  Optional<String> valueMarkdown();

  Optional<String> valueTime();

  Optional<SampledData> valueSampledData();

  Optional<Coding> valueCoding();

  Optional<String> valueString();

  Optional<Quantity> valueQuantity();

  Optional<Timing> valueTiming();

  Optional<String> id();

  Optional<String> valueUri();

  Optional<Identifier> valueIdentifier();

  Optional<Ratio> valueRatio();

  Optional<Double> valueUnsignedInt();

  Optional<Money> valueMoney();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> valueBoolean();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Attachment> valueAttachment();

  Optional<Annotation> valueAnnotation();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> label();

  Optional<String> valueDateTime();

  Optional<Range> valueRange();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<String> valueCode();

  Optional<Meta> valueMeta();

  Optional<HumanName> valueHumanName();

  Optional<String> valueOid();

  Optional<String> valueUuid();

  Optional<ContactDetail> valueContactDetail();

  Optional<Dosage> valueDosage();

  Optional<Expression> valueExpression();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Double> valueInteger();

  Optional<String> valueCanonical();

  Optional<Reference> valueReference();

  Optional<Contributor> valueContributor();

  Optional<Age> valueAge();

  Optional<Count> valueCount();

  Optional<Distance> valueDistance();

  Optional<Address> valueAddress();

  Optional<ContactPoint> valueContactPoint();

  Optional<Duration> valueDuration();

  static ImmutableElementDefinition_Example.Builder builder() {
    return ImmutableElementDefinition_Example.builder();
  }
}
