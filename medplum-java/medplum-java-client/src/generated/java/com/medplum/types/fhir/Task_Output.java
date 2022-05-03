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
  Optional<UsageContext> valueUsageContext();

  Optional<String> valueUuid();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Age> valueAge();

  Optional<Period> valuePeriod();

  Optional<Timing> valueTiming();

  Optional<String> valueString();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Identifier> valueIdentifier();

  Optional<SampledData> valueSampledData();

  Optional<Address> valueAddress();

  Optional<String> valueBase64Binary();

  Optional<String> valueUri();

  Optional<Distance> valueDistance();

  Optional<Duration> valueDuration();

  Optional<Meta> valueMeta();

  Optional<Coding> valueCoding();

  Optional<Quantity> valueQuantity();

  Optional<Double> valueInteger();

  Optional<List<Extension>> modifierExtension();

  Optional<HumanName> valueHumanName();

  Optional<String> valueDateTime();

  Optional<Double> valueUnsignedInt();

  Optional<TriggerDefinition> valueTriggerDefinition();

  CodeableConcept type();

  Optional<String> valueInstant();

  Optional<Double> valuePositiveInt();

  Optional<Contributor> valueContributor();

  Optional<Annotation> valueAnnotation();

  Optional<String> id();

  Optional<Expression> valueExpression();

  Optional<String> valueDate();

  Optional<DataRequirement> valueDataRequirement();

  Optional<Double> valueDecimal();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Signature> valueSignature();

  Optional<String> valueTime();

  Optional<Ratio> valueRatio();

  Optional<Money> valueMoney();

  Optional<String> valueMarkdown();

  Optional<Attachment> valueAttachment();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> valueUrl();

  Optional<String> valueOid();

  Optional<Boolean> valueBoolean();

  Optional<String> valueCode();

  Optional<ContactDetail> valueContactDetail();

  Optional<Count> valueCount();

  Optional<String> valueCanonical();

  Optional<String> valueId();

  Optional<Range> valueRange();

  Optional<Reference> valueReference();

  Optional<Dosage> valueDosage();

  Optional<List<Extension>> extension();

  static ImmutableTask_Output.TypeBuildStage builder() {
    return ImmutableTask_Output.builder();
  }
}
