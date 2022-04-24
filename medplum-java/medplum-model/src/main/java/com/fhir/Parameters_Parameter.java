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
    as = ImmutableParameters_Parameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Parameters_Parameter {
  Optional<String> valueOid();

  Optional<Period> valuePeriod();

  Optional<String> valueId();

  Optional<HumanName> valueHumanName();

  Optional<SampledData> valueSampledData();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> valueUnsignedInt();

  Optional<Signature> valueSignature();

  Optional<List<Parameters_Parameter>> part();

  Optional<String> valueTime();

  Optional<Contributor> valueContributor();

  Optional<Quantity> valueQuantity();

  Optional<Timing> valueTiming();

  Optional<List<Extension>> extension();

  Optional<Money> valueMoney();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<ResourceList> resource();

  Optional<Meta> valueMeta();

  Optional<Double> valuePositiveInt();

  Optional<Annotation> valueAnnotation();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Identifier> valueIdentifier();

  Optional<String> valueDate();

  Optional<UsageContext> valueUsageContext();

  Optional<Coding> valueCoding();

  Optional<String> valueBase64Binary();

  Optional<Double> valueDecimal();

  Optional<String> valueUuid();

  Optional<Distance> valueDistance();

  Optional<Duration> valueDuration();

  Optional<String> valueUrl();

  Optional<String> valueCode();

  Optional<String> name();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Expression> valueExpression();

  Optional<Attachment> valueAttachment();

  Optional<String> id();

  Optional<String> valueCanonical();

  Optional<String> valueInstant();

  Optional<ContactDetail> valueContactDetail();

  Optional<Range> valueRange();

  Optional<Dosage> valueDosage();

  Optional<Address> valueAddress();

  Optional<Reference> valueReference();

  Optional<String> valueString();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueDateTime();

  Optional<Ratio> valueRatio();

  Optional<Age> valueAge();

  Optional<Double> valueInteger();

  Optional<String> valueUri();

  Optional<String> valueMarkdown();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Boolean> valueBoolean();

  Optional<ContactPoint> valueContactPoint();

  Optional<Count> valueCount();

  static ImmutableParameters_Parameter.Builder builder() {
    return ImmutableParameters_Parameter.builder();
  }
}
