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
  Optional<String> valueBase64Binary();

  Optional<List<Extension>> extension();

  Optional<Distance> valueDistance();

  Optional<Range> valueRange();

  Optional<Identifier> valueIdentifier();

  Optional<UsageContext> valueUsageContext();

  Optional<String> valueOid();

  Optional<Duration> valueDuration();

  Optional<Double> valuePositiveInt();

  Optional<Reference> valueReference();

  Optional<String> valueCanonical();

  Optional<Signature> valueSignature();

  Optional<String> valueCode();

  Optional<Age> valueAge();

  Optional<HumanName> valueHumanName();

  Optional<Double> valueDecimal();

  Optional<String> id();

  Optional<Double> valueInteger();

  Optional<String> valueId();

  Optional<Address> valueAddress();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Boolean> valueBoolean();

  Optional<String> valueInstant();

  Optional<Ratio> valueRatio();

  Optional<String> valueDate();

  Optional<String> valueTime();

  Optional<Attachment> valueAttachment();

  Optional<Annotation> valueAnnotation();

  Optional<Expression> valueExpression();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueString();

  Optional<String> valueUri();

  Optional<Count> valueCount();

  Optional<Quantity> valueQuantity();

  Optional<Dosage> valueDosage();

  Optional<Double> valueUnsignedInt();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Period> valuePeriod();

  Optional<Contributor> valueContributor();

  Optional<SampledData> valueSampledData();

  Optional<String> valueMarkdown();

  Optional<String> valueDateTime();

  Optional<Timing> valueTiming();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<ContactPoint> valueContactPoint();

  Optional<Meta> valueMeta();

  Optional<String> valueUuid();

  Optional<Coding> valueCoding();

  Optional<Uri> url();

  Optional<ContactDetail> valueContactDetail();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<String> valueUrl();

  Optional<Money> valueMoney();

  static ImmutableExtension.Builder builder() {
    return ImmutableExtension.builder();
  }
}
