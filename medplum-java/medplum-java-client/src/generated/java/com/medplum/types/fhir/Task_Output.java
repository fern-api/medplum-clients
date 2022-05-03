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
  Optional<Money> valueMoney();

  Optional<Period> valuePeriod();

  Optional<String> valueUuid();

  Optional<List<Extension>> extension();

  Optional<Annotation> valueAnnotation();

  Optional<Distance> valueDistance();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> valueUri();

  Optional<String> valueCode();

  CodeableConcept type();

  Optional<Boolean> valueBoolean();

  Optional<String> valueUrl();

  Optional<Address> valueAddress();

  Optional<Count> valueCount();

  Optional<Contributor> valueContributor();

  Optional<Quantity> valueQuantity();

  Optional<Age> valueAge();

  Optional<Timing> valueTiming();

  Optional<Signature> valueSignature();

  Optional<String> valueDate();

  Optional<Ratio> valueRatio();

  Optional<Reference> valueReference();

  Optional<Expression> valueExpression();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Dosage> valueDosage();

  Optional<String> valueString();

  Optional<Double> valuePositiveInt();

  Optional<Double> valueUnsignedInt();

  Optional<String> valueTime();

  Optional<String> valueInstant();

  Optional<SampledData> valueSampledData();

  Optional<UsageContext> valueUsageContext();

  Optional<String> valueMarkdown();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<String> valueId();

  Optional<String> valueDateTime();

  Optional<Meta> valueMeta();

  Optional<Attachment> valueAttachment();

  Optional<Double> valueDecimal();

  Optional<String> valueOid();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Identifier> valueIdentifier();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueCanonical();

  Optional<Coding> valueCoding();

  Optional<Duration> valueDuration();

  Optional<String> valueBase64Binary();

  Optional<Double> valueInteger();

  Optional<ContactDetail> valueContactDetail();

  Optional<Range> valueRange();

  Optional<String> id();

  Optional<HumanName> valueHumanName();

  static ImmutableTask_Output.TypeBuildStage builder() {
    return ImmutableTask_Output.builder();
  }
}
