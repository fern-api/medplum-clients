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
  Optional<Coding> valueCoding();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<String> valueMarkdown();

  Optional<Boolean> valueBoolean();

  Optional<String> valueOid();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Attachment> valueAttachment();

  Optional<Distance> valueDistance();

  Optional<Period> valuePeriod();

  Optional<String> valueDateTime();

  Optional<String> label();

  Optional<String> valueBase64Binary();

  Optional<Meta> valueMeta();

  Optional<Double> valueInteger();

  Optional<Age> valueAge();

  Optional<Ratio> valueRatio();

  Optional<Expression> valueExpression();

  Optional<Double> valuePositiveInt();

  Optional<Dosage> valueDosage();

  Optional<List<Extension>> extension();

  Optional<UsageContext> valueUsageContext();

  Optional<String> valueUri();

  Optional<Timing> valueTiming();

  Optional<Count> valueCount();

  Optional<String> valueString();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueCode();

  Optional<String> valueTime();

  Optional<Reference> valueReference();

  Optional<Double> valueDecimal();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<Identifier> valueIdentifier();

  Optional<Address> valueAddress();

  Optional<Quantity> valueQuantity();

  Optional<Money> valueMoney();

  Optional<Duration> valueDuration();

  Optional<SampledData> valueSampledData();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<String> valueCanonical();

  Optional<String> valueId();

  Optional<HumanName> valueHumanName();

  Optional<ContactDetail> valueContactDetail();

  Optional<Double> valueUnsignedInt();

  Optional<String> id();

  Optional<String> valueInstant();

  Optional<String> valueUrl();

  Optional<Annotation> valueAnnotation();

  Optional<List<Extension>> modifierExtension();

  Optional<Contributor> valueContributor();

  Optional<String> valueDate();

  Optional<String> valueUuid();

  Optional<Range> valueRange();

  Optional<ContactPoint> valueContactPoint();

  Optional<Signature> valueSignature();

  static ImmutableElementDefinition_Example.Builder builder() {
    return ImmutableElementDefinition_Example.builder();
  }
}
