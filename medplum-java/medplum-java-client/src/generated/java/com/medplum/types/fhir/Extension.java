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
    as = ImmutableExtension.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Extension {
  Optional<Reference> valueReference();

  Optional<String> valueOid();

  Optional<String> valueUrl();

  Optional<Coding> valueCoding();

  Optional<Address> valueAddress();

  Optional<String> valueMarkdown();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<String> valueDateTime();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<String> valueDate();

  Optional<UsageContext> valueUsageContext();

  Optional<DataRequirement> valueDataRequirement();

  Optional<Double> valueInteger();

  Optional<Annotation> valueAnnotation();

  Optional<Period> valuePeriod();

  Optional<String> valueString();

  Optional<Double> valuePositiveInt();

  Optional<ContactPoint> valueContactPoint();

  Optional<Money> valueMoney();

  Optional<Timing> valueTiming();

  Optional<SampledData> valueSampledData();

  Optional<Signature> valueSignature();

  Optional<String> valueTime();

  Optional<String> id();

  Optional<Uri> url();

  Optional<Double> valueUnsignedInt();

  Optional<Duration> valueDuration();

  Optional<Attachment> valueAttachment();

  Optional<Double> valueDecimal();

  Optional<Expression> valueExpression();

  Optional<String> valueInstant();

  Optional<Count> valueCount();

  Optional<String> valueCanonical();

  Optional<String> valueUri();

  Optional<Dosage> valueDosage();

  Optional<String> valueCode();

  Optional<String> valueUuid();

  Optional<String> valueId();

  Optional<Ratio> valueRatio();

  Optional<HumanName> valueHumanName();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<String> valueBase64Binary();

  Optional<Identifier> valueIdentifier();

  Optional<Contributor> valueContributor();

  Optional<List<Extension>> extension();

  Optional<ContactDetail> valueContactDetail();

  Optional<Boolean> valueBoolean();

  Optional<Meta> valueMeta();

  Optional<Range> valueRange();

  Optional<Age> valueAge();

  Optional<Quantity> valueQuantity();

  Optional<Distance> valueDistance();

  static ImmutableExtension.Builder builder() {
    return ImmutableExtension.builder();
  }
}
