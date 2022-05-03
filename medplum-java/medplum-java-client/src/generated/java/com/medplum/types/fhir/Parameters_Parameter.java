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
  Optional<Dosage> valueDosage();

  Optional<String> id();

  Optional<Coding> valueCoding();

  Optional<SampledData> valueSampledData();

  Optional<Double> valueDecimal();

  Optional<Reference> valueReference();

  Optional<Attachment> valueAttachment();

  Optional<Distance> valueDistance();

  Optional<UsageContext> valueUsageContext();

  Optional<Signature> valueSignature();

  Optional<String> valueOid();

  Optional<HumanName> valueHumanName();

  Optional<String> valueUrl();

  Optional<Address> valueAddress();

  Optional<String> valueDate();

  Optional<Expression> valueExpression();

  Optional<Boolean> valueBoolean();

  Optional<Double> valuePositiveInt();

  Optional<String> valueUuid();

  Optional<Annotation> valueAnnotation();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Double> valueInteger();

  Optional<Range> valueRange();

  Optional<Identifier> valueIdentifier();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<ResourceList> resource();

  Optional<Money> valueMoney();

  Optional<Age> valueAge();

  Optional<String> valueDateTime();

  Optional<String> valueString();

  Optional<String> valueCode();

  Optional<List<Parameters_Parameter>> part();

  Optional<String> valueUri();

  Optional<String> valueId();

  Optional<String> valueInstant();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> valueCanonical();

  Optional<Double> valueUnsignedInt();

  Optional<Count> valueCount();

  Optional<List<Extension>> extension();

  Optional<Meta> valueMeta();

  Optional<Quantity> valueQuantity();

  Optional<Period> valuePeriod();

  Optional<String> valueTime();

  Optional<Ratio> valueRatio();

  Optional<String> valueBase64Binary();

  Optional<ContactDetail> valueContactDetail();

  Optional<String> name();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Contributor> valueContributor();

  Optional<List<Extension>> modifierExtension();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueMarkdown();

  Optional<Duration> valueDuration();

  Optional<Timing> valueTiming();

  static ImmutableParameters_Parameter.Builder builder() {
    return ImmutableParameters_Parameter.builder();
  }
}
