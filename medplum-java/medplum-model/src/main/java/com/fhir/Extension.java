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
    as = ImmutableExtension.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Extension {
  Optional<Annotation> valueAnnotation();

  Optional<Count> valueCount();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<Signature> valueSignature();

  Optional<String> valueDate();

  Optional<Attachment> valueAttachment();

  Optional<String> valueUri();

  Optional<Identifier> valueIdentifier();

  Optional<uri> url();

  Optional<String> valueOid();

  Optional<Timing> valueTiming();

  Optional<UsageContext> valueUsageContext();

  Optional<String> valueTime();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Double> valueDecimal();

  Optional<ContactDetail> valueContactDetail();

  Optional<Reference> valueReference();

  Optional<Quantity> valueQuantity();

  Optional<Dosage> valueDosage();

  Optional<Coding> valueCoding();

  Optional<String> valueId();

  Optional<Double> valueUnsignedInt();

  Optional<Double> valuePositiveInt();

  Optional<ContactPoint> valueContactPoint();

  Optional<Ratio> valueRatio();

  Optional<String> valueDateTime();

  Optional<String> valueCode();

  Optional<Range> valueRange();

  Optional<Contributor> valueContributor();

  Optional<Boolean> valueBoolean();

  Optional<String> valueMarkdown();

  Optional<Period> valuePeriod();

  Optional<String> valueCanonical();

  Optional<String> valueBase64Binary();

  Optional<Age> valueAge();

  Optional<Address> valueAddress();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Money> valueMoney();

  Optional<SampledData> valueSampledData();

  Optional<String> valueInstant();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<String> valueString();

  Optional<Duration> valueDuration();

  Optional<Distance> valueDistance();

  Optional<HumanName> valueHumanName();

  Optional<String> id();

  Optional<String> valueUuid();

  Optional<Meta> valueMeta();

  Optional<List<Extension>> extension();

  Optional<String> valueUrl();

  Optional<Double> valueInteger();

  Optional<DataRequirement> valueDataRequirement();

  Optional<Expression> valueExpression();

  static ImmutableExtension.Builder builder() {
    return ImmutableExtension.builder();
  }
}
