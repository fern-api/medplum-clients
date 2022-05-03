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
    as = ImmutableParameters_Parameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Parameters_Parameter {
  Optional<List<Extension>> extension();

  Optional<Reference> valueReference();

  Optional<String> valueDateTime();

  Optional<List<Parameters_Parameter>> part();

  Optional<Attachment> valueAttachment();

  Optional<HumanName> valueHumanName();

  Optional<Double> valuePositiveInt();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<String> valueCode();

  Optional<Count> valueCount();

  Optional<Duration> valueDuration();

  Optional<Address> valueAddress();

  Optional<Timing> valueTiming();

  Optional<String> valueCanonical();

  Optional<String> valueUri();

  Optional<Period> valuePeriod();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueMarkdown();

  Optional<String> valueInstant();

  Optional<String> valueString();

  Optional<Expression> valueExpression();

  Optional<Money> valueMoney();

  Optional<SampledData> valueSampledData();

  Optional<String> valueDate();

  Optional<Meta> valueMeta();

  Optional<String> id();

  Optional<String> valueUuid();

  Optional<String> valueUrl();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<String> valueId();

  Optional<Ratio> valueRatio();

  Optional<ResourceList> resource();

  Optional<Annotation> valueAnnotation();

  Optional<ContactDetail> valueContactDetail();

  Optional<String> valueTime();

  Optional<String> name();

  Optional<Quantity> valueQuantity();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<String> valueOid();

  Optional<Age> valueAge();

  Optional<Identifier> valueIdentifier();

  Optional<Double> valueInteger();

  Optional<Double> valueDecimal();

  Optional<Double> valueUnsignedInt();

  Optional<List<Extension>> modifierExtension();

  Optional<Dosage> valueDosage();

  Optional<Range> valueRange();

  Optional<Distance> valueDistance();

  Optional<String> valueBase64Binary();

  Optional<Signature> valueSignature();

  Optional<Boolean> valueBoolean();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<UsageContext> valueUsageContext();

  Optional<Contributor> valueContributor();

  Optional<Coding> valueCoding();

  Optional<ContactPoint> valueContactPoint();

  static ImmutableParameters_Parameter.Builder builder() {
    return ImmutableParameters_Parameter.builder();
  }
}
