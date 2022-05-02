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
  Optional<String> valueDate();

  Optional<ParameterDefinition> valueParameterDefinition();

  Optional<Double> valueDecimal();

  Optional<HumanName> valueHumanName();

  Optional<String> valueMarkdown();

  Optional<String> valueString();

  Optional<Period> valuePeriod();

  Optional<String> valueUuid();

  Optional<Attachment> valueAttachment();

  Optional<Count> valueCount();

  Optional<Reference> valueReference();

  Optional<String> valueInstant();

  Optional<Contributor> valueContributor();

  Optional<Age> valueAge();

  CodeableConcept type();

  Optional<Double> valueInteger();

  Optional<Signature> valueSignature();

  Optional<String> valueUri();

  Optional<Boolean> valueBoolean();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueId();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<RelatedArtifact> valueRelatedArtifact();

  Optional<Double> valuePositiveInt();

  Optional<Double> valueUnsignedInt();

  Optional<Identifier> valueIdentifier();

  Optional<Meta> valueMeta();

  Optional<Timing> valueTiming();

  Optional<ContactPoint> valueContactPoint();

  Optional<String> valueUrl();

  Optional<String> valueTime();

  Optional<TriggerDefinition> valueTriggerDefinition();

  Optional<String> valueCode();

  Optional<Ratio> valueRatio();

  Optional<String> id();

  Optional<String> valueCanonical();

  Optional<String> valueDateTime();

  Optional<Quantity> valueQuantity();

  Optional<List<Extension>> extension();

  Optional<DataRequirement> valueDataRequirement();

  Optional<String> valueOid();

  Optional<Dosage> valueDosage();

  Optional<Annotation> valueAnnotation();

  Optional<Coding> valueCoding();

  Optional<String> valueBase64Binary();

  Optional<Duration> valueDuration();

  Optional<SampledData> valueSampledData();

  Optional<Money> valueMoney();

  Optional<ContactDetail> valueContactDetail();

  Optional<Distance> valueDistance();

  Optional<UsageContext> valueUsageContext();

  Optional<Range> valueRange();

  Optional<Address> valueAddress();

  Optional<Expression> valueExpression();

  static ImmutableTask_Output.TypeBuildStage builder() {
    return ImmutableTask_Output.builder();
  }
}
