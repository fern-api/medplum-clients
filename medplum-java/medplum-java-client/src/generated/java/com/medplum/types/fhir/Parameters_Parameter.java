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
  Optional<String> valueCode();

  Optional<String> valueString();

  Optional<UsageContext> valueUsageContext();

  Optional<Age> valueAge();

  Optional<SampledData> valueSampledData();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<Double> valuePositiveInt();

  Optional<Distance> valueDistance();

  Optional<String> valueBase64Binary();

  Optional<Duration> valueDuration();

  Optional<String> name();

  Optional<Double> valueUnsignedInt();

  Optional<String> valueDateTime();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<String> valueDate();

  Optional<Count> valueCount();

  Optional<Signature> valueSignature();

  Optional<String> valueId();

  Optional<List<Extension>> extension();

  Optional<String> valueUrl();

  Optional<Boolean> valueBoolean();

  Optional<Ratio> valueRatio();

  Optional<Address> valueAddress();

  Optional<String> valueTime();

  Optional<Attachment> valueAttachment();

  Optional<ContactPoint> valueContactPoint();

  Optional<Timing> valueTiming();

  Optional<ContactDetail> valueContactDetail();

  Optional<String> valueCanonical();

  Optional<Meta> valueMeta();

  Optional<Double> valueDecimal();

  Optional<Range> valueRange();

  Optional<DataRequirement> valueDataRequirement();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<String> valueInstant();

  Optional<Quantity> valueQuantity();

  Optional<Dosage> valueDosage();

  Optional<String> valueMarkdown();

  Optional<Money> valueMoney();

  Optional<String> valueUri();

  Optional<Identifier> valueIdentifier();

  Optional<Period> valuePeriod();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Reference> valueReference();

  Optional<String> valueUuid();

  Optional<Annotation> valueAnnotation();

  Optional<List<Parameters_Parameter>> part();

  Optional<ResourceList> resource();

  Optional<Coding> valueCoding();

  Optional<String> valueOid();

  Optional<Contributor> valueContributor();

  Optional<Double> valueInteger();

  Optional<HumanName> valueHumanName();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Expression> valueExpression();

  static ImmutableParameters_Parameter.Builder builder() {
    return ImmutableParameters_Parameter.builder();
  }
}
