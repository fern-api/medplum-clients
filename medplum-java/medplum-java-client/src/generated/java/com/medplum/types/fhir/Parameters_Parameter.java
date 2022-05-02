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
  Optional<Signature> valueSignature();

  Optional<String> valueCode();

  Optional<String> valueDate();

  Optional<String> valueUuid();

  Optional<Reference> valueReference();

  Optional<Period> valuePeriod();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<String> valueBase64Binary();

  Optional<Meta> valueMeta();

  Optional<String> id();

  Optional<ContactPoint> valueContactPoint();

  Optional<HumanName> valueHumanName();

  Optional<ContactDetail> valueContactDetail();

  Optional<String> valueUri();

  Optional<Boolean> valueBoolean();

  Optional<Money> valueMoney();

  Optional<Identifier> valueIdentifier();

  Optional<Ratio> valueRatio();

  Optional<Double> valueUnsignedInt();

  Optional<Dosage> valueDosage();

  Optional<Range> valueRange();

  Optional<List<Parameters_Parameter>> part();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<String> valueDateTime();

  Optional<Double> valuePositiveInt();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Timing> valueTiming();

  Optional<Annotation> valueAnnotation();

  Optional<Double> valueDecimal();

  Optional<Contributor> valueContributor();

  Optional<UsageContext> valueUsageContext();

  Optional<Distance> valueDistance();

  Optional<List<Extension>> extension();

  Optional<Double> valueInteger();

  Optional<Expression> valueExpression();

  Optional<String> valueId();

  Optional<Attachment> valueAttachment();

  Optional<String> valueOid();

  Optional<String> name();

  Optional<SampledData> valueSampledData();

  Optional<Count> valueCount();

  Optional<String> valueCanonical();

  Optional<String> valueInstant();

  Optional<Duration> valueDuration();

  Optional<ResourceList> resource();

  Optional<Coding> valueCoding();

  Optional<List<Extension>> modifierExtension();

  Optional<DataRequirement> valueDataRequirement();

  Optional<Address> valueAddress();

  Optional<String> valueMarkdown();

  Optional<Quantity> valueQuantity();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Age> valueAge();

  Optional<String> valueUrl();

  Optional<String> valueString();

  Optional<String> valueTime();

  static ImmutableParameters_Parameter.Builder builder() {
    return ImmutableParameters_Parameter.builder();
  }
}
