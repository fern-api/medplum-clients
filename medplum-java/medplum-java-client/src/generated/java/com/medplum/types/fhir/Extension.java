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
  Optional<Timing> valueTiming();

  Optional<Double> valueDecimal();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> valueCode();

  Optional<String> id();

  Optional<Address> valueAddress();

  Optional<Dosage> valueDosage();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<String> valueOid();

  Optional<Uri> url();

  Optional<Expression> valueExpression();

  Optional<String> valueCanonical();

  Optional<String> valueDateTime();

  Optional<String> valueUuid();

  Optional<Signature> valueSignature();

  Optional<Money> valueMoney();

  Optional<SampledData> valueSampledData();

  Optional<String> valueString();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<String> valueId();

  Optional<Count> valueCount();

  Optional<Contributor> valueContributor();

  Optional<Range> valueRange();

  Optional<Double> valueInteger();

  Optional<String> valueDate();

  Optional<Period> valuePeriod();

  Optional<UsageContext> valueUsageContext();

  Optional<String> valueInstant();

  Optional<Double> valuePositiveInt();

  Optional<Age> valueAge();

  Optional<Reference> valueReference();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Distance> valueDistance();

  Optional<DataRequirement> valueDataRequirement();

  Optional<Double> valueUnsignedInt();

  Optional<ContactDetail> valueContactDetail();

  Optional<List<Extension>> extension();

  Optional<Identifier> valueIdentifier();

  Optional<String> valueTime();

  Optional<String> valueUri();

  Optional<String> valueUrl();

  Optional<Boolean> valueBoolean();

  Optional<Annotation> valueAnnotation();

  Optional<Coding> valueCoding();

  Optional<Duration> valueDuration();

  Optional<Quantity> valueQuantity();

  Optional<String> valueBase64Binary();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Ratio> valueRatio();

  Optional<Attachment> valueAttachment();

  Optional<String> valueMarkdown();

  Optional<HumanName> valueHumanName();

  Optional<Meta> valueMeta();

  static ImmutableExtension.Builder builder() {
    return ImmutableExtension.builder();
  }
}
