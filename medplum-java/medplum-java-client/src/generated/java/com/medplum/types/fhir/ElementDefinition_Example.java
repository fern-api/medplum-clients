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
  Optional<Age> valueAge();

  Optional<String> valueString();

  Optional<String> valueUri();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Boolean> valueBoolean();

  Optional<String> valueMarkdown();

  Optional<String> valueCanonical();

  Optional<Ratio> valueRatio();

  Optional<UsageContext> valueUsageContext();

  Optional<Double> valueDecimal();

  Optional<Range> valueRange();

  Optional<Double> valuePositiveInt();

  Optional<String> valueUuid();

  Optional<Contributor> valueContributor();

  Optional<String> id();

  Optional<Meta> valueMeta();

  Optional<String> valueInstant();

  Optional<String> valueDate();

  Optional<Dosage> valueDosage();

  Optional<String> label();

  Optional<List<Extension>> extension();

  Optional<String> valueOid();

  Optional<Timing> valueTiming();

  Optional<Period> valuePeriod();

  Optional<Duration> valueDuration();

  Optional<String> valueDateTime();

  Optional<Attachment> valueAttachment();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Signature> valueSignature();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueId();

  Optional<String> valueCode();

  Optional<ContactDetail> valueContactDetail();

  Optional<Annotation> valueAnnotation();

  Optional<String> valueUrl();

  Optional<Distance> valueDistance();

  Optional<Expression> valueExpression();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<SampledData> valueSampledData();

  Optional<Money> valueMoney();

  Optional<Quantity> valueQuantity();

  Optional<Address> valueAddress();

  Optional<Double> valueUnsignedInt();

  Optional<Identifier> valueIdentifier();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> valueTime();

  Optional<Double> valueInteger();

  Optional<Reference> valueReference();

  Optional<HumanName> valueHumanName();

  Optional<String> valueBase64Binary();

  Optional<Count> valueCount();

  Optional<Coding> valueCoding();

  static ImmutableElementDefinition_Example.Builder builder() {
    return ImmutableElementDefinition_Example.builder();
  }
}
