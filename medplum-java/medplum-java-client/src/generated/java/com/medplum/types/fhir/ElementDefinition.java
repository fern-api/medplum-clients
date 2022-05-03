package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableElementDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition {
  Optional<ElementDefinition_Base> base();

  Optional<String> defaultValueUri();

  Optional<String> fixedUri();

  Optional<Quantity> fixedQuantity();

  Optional<CodeableConcept> defaultValueCodeableConcept();

  Optional<Duration> defaultValueDuration();

  Optional<List<Extension>> extension();

  Optional<String> fixedCanonical();

  Optional<Double> maxValueInteger();

  Optional<ElementDefinition_Slicing> slicing();

  Optional<Timing> fixedTiming();

  Optional<Boolean> mustSupport();

  Optional<String> patternDate();

  Optional<String> defaultValueDateTime();

  Optional<Period> fixedPeriod();

  Optional<String> defaultValueId();

  Optional<SampledData> defaultValueSampledData();

  Optional<UsageContext> patternUsageContext();

  Optional<String> patternMarkdown();

  Optional<Ratio> patternRatio();

  Optional<String> minValueDateTime();

  Optional<DataRequirement> fixedDataRequirement();

  Optional<String> defaultValueInstant();

  Optional<Period> patternPeriod();

  Optional<String> maxValueTime();

  Optional<Contributor> patternContributor();

  Optional<Annotation> patternAnnotation();

  Optional<List<ElementDefinition_Mapping>> mapping();

  Optional<ParameterDefinition> defaultValueParameterDefinition();

  Optional<String> fixedString();

  Optional<Dosage> patternDosage();

  Optional<List<Id>> condition();

  Optional<Meta> patternMeta();

  Optional<String> maxValueInstant();

  Optional<Double> maxValuePositiveInt();

  Optional<String> patternUri();

  Optional<Annotation> fixedAnnotation();

  Optional<String> patternId();

  Optional<Ratio> fixedRatio();

  Optional<String> patternUuid();

  Optional<Boolean> fixedBoolean();

  Optional<Count> fixedCount();

  Optional<Distance> patternDistance();

  Optional<String> patternBase64Binary();

  Optional<HumanName> patternHumanName();

  Optional<HumanName> defaultValueHumanName();

  Optional<Double> fixedDecimal();

  Optional<String> fixedOid();

  Optional<Distance> fixedDistance();

  Optional<Distance> defaultValueDistance();

  Optional<Money> patternMoney();

  Optional<String> fixedTime();

  Optional<RelatedArtifact> defaultValueRelatedArtifact();

  Optional<TriggerDefinition> defaultValueTriggerDefinition();

  Optional<Annotation> defaultValueAnnotation();

  Optional<String> maxValueDate();

  Optional<Attachment> patternAttachment();

  Optional<String> patternString();

  Optional<Address> defaultValueAddress();

  Optional<Quantity> minValueQuantity();

  Optional<Identifier> fixedIdentifier();

  Optional<Coding> defaultValueCoding();

  Optional<Count> defaultValueCount();

  Optional<String> id();

  Optional<Expression> fixedExpression();

  Optional<String> patternCode();

  Optional<SampledData> fixedSampledData();

  Optional<Double> maxValueDecimal();

  Optional<String> defaultValueString();

  Optional<Contributor> defaultValueContributor();

  Optional<RelatedArtifact> patternRelatedArtifact();

  Optional<Double> defaultValueInteger();

  Optional<DataRequirement> patternDataRequirement();

  Optional<Identifier> defaultValueIdentifier();

  Optional<Meta> defaultValueMeta();

  @JsonProperty("short")
  Optional<String> _short();

  Optional<Boolean> defaultValueBoolean();

  Optional<String> fixedUuid();

  Optional<List<ElementDefinition_Example>> example();

  Optional<UnsignedInt> min();

  Optional<String> defaultValueOid();

  Optional<Range> defaultValueRange();

  Optional<Age> defaultValueAge();

  Optional<UsageContext> defaultValueUsageContext();

  Optional<Double> defaultValuePositiveInt();

  Optional<Quantity> maxValueQuantity();

  Optional<Signature> fixedSignature();

  Optional<String> defaultValueBase64Binary();

  Optional<String> fixedDate();

  Optional<Address> patternAddress();

  Optional<Double> minValueInteger();

  Optional<String> sliceName();

  Optional<Markdown> meaningWhenMissing();

  Optional<Double> minValuePositiveInt();

  Optional<Period> defaultValuePeriod();

  Optional<Quantity> defaultValueQuantity();

  Optional<Double> minValueUnsignedInt();

  Optional<Reference> defaultValueReference();

  Optional<String> fixedUrl();

  Optional<String> patternUrl();

  Optional<ParameterDefinition> fixedParameterDefinition();

  Optional<TriggerDefinition> patternTriggerDefinition();

  Optional<Timing> defaultValueTiming();

  Optional<Signature> defaultValueSignature();

  Optional<CodeableConcept> patternCodeableConcept();

  Optional<String> defaultValueTime();

  Optional<List<Extension>> modifierExtension();

  Optional<String> defaultValueDate();

  Optional<Markdown> requirements();

  Optional<List<ElementDefinition_Type>> type();

  Optional<Double> patternPositiveInt();

  Optional<Ratio> defaultValueRatio();

  Optional<Dosage> defaultValueDosage();

  Optional<String> minValueTime();

  Optional<Double> defaultValueDecimal();

  Optional<Integer> maxLength();

  Optional<String> label();

  Optional<List<Coding>> code();

  Optional<Boolean> isModifier();

  Optional<String> fixedInstant();

  Optional<Range> fixedRange();

  Optional<String> defaultValueMarkdown();

  Optional<String> fixedBase64Binary();

  Optional<HumanName> fixedHumanName();

  Optional<Address> fixedAddress();

  Optional<String> defaultValueUuid();

  Optional<Markdown> comment();

  Optional<String> max();

  Optional<Quantity> patternQuantity();

  Optional<Uri> contentReference();

  Optional<String> patternInstant();

  Optional<Double> patternInteger();

  Optional<String> path();

  Optional<ContactDetail> defaultValueContactDetail();

  Optional<Reference> fixedReference();

  Optional<ContactDetail> fixedContactDetail();

  Optional<Reference> patternReference();

  Optional<ElementDefinition_Binding> binding();

  Optional<Age> patternAge();

  Optional<Double> patternUnsignedInt();

  Optional<String> defaultValueCanonical();

  Optional<UsageContext> fixedUsageContext();

  Optional<Contributor> fixedContributor();

  Optional<ParameterDefinition> patternParameterDefinition();

  Optional<Timing> patternTiming();

  Optional<String> minValueDate();

  Optional<Count> patternCount();

  Optional<Double> fixedPositiveInt();

  Optional<Duration> patternDuration();

  Optional<Money> defaultValueMoney();

  Optional<DataRequirement> defaultValueDataRequirement();

  Optional<Double> fixedUnsignedInt();

  Optional<String> minValueInstant();

  Optional<Meta> fixedMeta();

  Optional<Double> fixedInteger();

  Optional<Markdown> definition();

  Optional<String> fixedId();

  Optional<String> isModifierReason();

  Optional<Range> patternRange();

  Optional<Boolean> isSummary();

  Optional<ContactDetail> patternContactDetail();

  Optional<ContactPoint> fixedContactPoint();

  Optional<TriggerDefinition> fixedTriggerDefinition();

  Optional<String> patternOid();

  Optional<Expression> defaultValueExpression();

  Optional<CodeableConcept> fixedCodeableConcept();

  Optional<Coding> fixedCoding();

  Optional<String> defaultValueCode();

  Optional<Double> defaultValueUnsignedInt();

  Optional<ContactPoint> patternContactPoint();

  Optional<Age> fixedAge();

  Optional<List<String>> alias();

  Optional<Duration> fixedDuration();

  Optional<Coding> patternCoding();

  Optional<String> maxValueDateTime();

  Optional<Attachment> defaultValueAttachment();

  Optional<RelatedArtifact> fixedRelatedArtifact();

  Optional<Boolean> patternBoolean();

  Optional<String> fixedDateTime();

  Optional<Expression> patternExpression();

  Optional<ContactPoint> defaultValueContactPoint();

  Optional<SampledData> patternSampledData();

  Optional<String> fixedCode();

  Optional<Signature> patternSignature();

  Optional<String> patternTime();

  Optional<String> defaultValueUrl();

  Optional<Boolean> sliceIsConstraining();

  Optional<String> fixedMarkdown();

  Optional<String> patternDateTime();

  Optional<Dosage> fixedDosage();

  Optional<String> patternCanonical();

  Optional<Identifier> patternIdentifier();

  Optional<Attachment> fixedAttachment();

  Optional<Double> minValueDecimal();

  Optional<List<ElementdefinitionRepresentationItem>> representation();

  Optional<Double> patternDecimal();

  Optional<Money> fixedMoney();

  Optional<String> orderMeaning();

  Optional<List<ElementDefinition_Constraint>> constraint();

  Optional<Double> maxValueUnsignedInt();

  static ImmutableElementDefinition.Builder builder() {
    return ImmutableElementDefinition.builder();
  }
}
