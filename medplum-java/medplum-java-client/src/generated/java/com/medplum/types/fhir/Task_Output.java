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
    as = ImmutableTask_Output.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Task_Output {
  Optional<DataRequirement> valueDataRequirement();

  Optional<Meta> valueMeta();

  Optional<Contributor> valueContributor();

  Optional<String> valueDate();

  Optional<String> valueDateTime();

  Optional<Double> valueUnsignedInt();

  Optional<String> valueUri();

  Optional<Money> valueMoney();

  Optional<Quantity> valueQuantity();

  Optional<List<Extension>> extension();

  Optional<Age> valueAge();

  Optional<UsageContext> valueUsageContext();

  Optional<List<Extension>> modifierExtension();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<String> valueMarkdown();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Dosage> valueDosage();

  Optional<Coding> valueCoding();

  Optional<String> valueUuid();

  Optional<String> valueId();

  Optional<Boolean> valueBoolean();

  Optional<Count> valueCount();

  Optional<Period> valuePeriod();

  Optional<String> valueCanonical();

  Optional<Range> valueRange();

  Optional<String> valueUrl();

  Optional<Distance> valueDistance();

  Optional<Duration> valueDuration();

  Optional<Annotation> valueAnnotation();

  Optional<String> valueOid();

  Optional<Double> valuePositiveInt();

  Optional<String> valueTime();

  Optional<String> valueCode();

  Optional<SampledData> valueSampledData();

  Optional<Expression> valueExpression();

  CodeableConcept type();

  Optional<Reference> valueReference();

  Optional<ContactDetail> valueContactDetail();

  Optional<String> valueString();

  Optional<Timing> valueTiming();

  Optional<Signature> valueSignature();

  Optional<Attachment> valueAttachment();

  Optional<Identifier> valueIdentifier();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Double> valueInteger();

  Optional<String> valueInstant();

  Optional<HumanName> valueHumanName();

  Optional<Double> valueDecimal();

  Optional<String> valueBase64Binary();

  Optional<ContactPoint> valueContactPoint();

  Optional<Ratio> valueRatio();

  Optional<Address> valueAddress();

  Optional<String> id();

  Optional<CodeableConcept> valueCodeableConcept();

  static ImmutableTask_Output.TypeBuildStage builder() {
    return ImmutableTask_Output.builder();
  }
}
