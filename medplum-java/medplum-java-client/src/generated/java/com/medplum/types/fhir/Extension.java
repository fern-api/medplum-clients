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

  Optional<DataRequirement> valueDataRequirement();

  Optional<ContactDetail> valueContactDetail();

  Optional<String> valueTime();

  Optional<Quantity> valueQuantity();

  Optional<Meta> valueMeta();

  Optional<SampledData> valueSampledData();

  Optional<Uri> url();

  Optional<UsageContext> valueUsageContext();

  Optional<Money> valueMoney();

  Optional<Double> valueUnsignedInt();

  Optional<Distance> valueDistance();

  Optional<ContactPoint> valueContactPoint();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Range> valueRange();

  Optional<String> valueInstant();

  Optional<Signature> valueSignature();

  Optional<Contributor> valueContributor();

  Optional<Boolean> valueBoolean();

  Optional<String> valueId();

  Optional<Double> valueInteger();

  Optional<Reference> valueReference();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<String> id();

  Optional<Age> valueAge();

  Optional<Double> valuePositiveInt();

  Optional<Ratio> valueRatio();

  Optional<String> valueCanonical();

  Optional<Period> valuePeriod();

  Optional<String> valueOid();

  Optional<String> valueUuid();

  Optional<Coding> valueCoding();

  Optional<String> valueDateTime();

  Optional<String> valueUri();

  Optional<List<Extension>> extension();

  Optional<String> valueDate();

  Optional<Dosage> valueDosage();

  Optional<Expression> valueExpression();

  Optional<String> valueCode();

  Optional<Annotation> valueAnnotation();

  Optional<Duration> valueDuration();

  Optional<Count> valueCount();

  Optional<HumanName> valueHumanName();

  Optional<Identifier> valueIdentifier();

  Optional<Attachment> valueAttachment();

  Optional<Timing> valueTiming();

  Optional<String> valueMarkdown();

  Optional<Address> valueAddress();

  Optional<Double> valueDecimal();

  Optional<String> valueString();

  Optional<String> valueUrl();

  Optional<ParameterDefinition> valueParameterDefinition();

  static ImmutableExtension.Builder builder() {
    return ImmutableExtension.builder();
  }
}
