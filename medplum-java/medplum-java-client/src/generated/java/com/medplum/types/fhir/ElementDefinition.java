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
  Optional<Period> defaultValuePeriod();

  Optional<Coding> fixedCoding();

  Optional<String> minValueDate();

  Optional<Money> fixedMoney();

  Optional<Money> patternMoney();

  Optional<CodeableConcept> defaultValueCodeableConcept();

  Optional<Expression> patternExpression();

  Optional<Quantity> maxValueQuantity();

  Optional<Double> maxValueInteger();

  Optional<String> patternUri();

  Optional<Boolean> isModifier();

  Optional<Double> defaultValuePositiveInt();

  Optional<Range> patternRange();

  Optional<CodeableConcept> fixedCodeableConcept();

  Optional<Double> minValuePositiveInt();

  Optional<Double> fixedUnsignedInt();

  Optional<Boolean> fixedBoolean();

  Optional<String> defaultValueId();

  Optional<String> defaultValueString();

  Optional<Ratio> fixedRatio();

  Optional<UsageContext> patternUsageContext();

  Optional<Boolean> sliceIsConstraining();

  Optional<Double> maxValueUnsignedInt();

  Optional<Double> minValueDecimal();

  Optional<List<ElementdefinitionRepresentationItem>> representation();

  Optional<UsageContext> fixedUsageContext();

  Optional<UsageContext> defaultValueUsageContext();

  Optional<Contributor> fixedContributor();

  Optional<List<ElementDefinition_Mapping>> mapping();

  Optional<Double> patternDecimal();

  Optional<Range> defaultValueRange();

  Optional<String> patternCode();

  Optional<Integer> maxLength();

  Optional<Identifier> patternIdentifier();

  Optional<Double> defaultValueDecimal();

  Optional<String> fixedUri();

  Optional<String> patternMarkdown();

  Optional<Quantity> fixedQuantity();

  Optional<Double> patternPositiveInt();

  Optional<Address> defaultValueAddress();

  Optional<Reference> fixedReference();

  Optional<Attachment> fixedAttachment();

  Optional<Expression> defaultValueExpression();

  Optional<Duration> fixedDuration();

  Optional<String> defaultValueDateTime();

  Optional<Double> fixedDecimal();

  Optional<Distance> fixedDistance();

  Optional<String> patternCanonical();

  @JsonProperty("short")
  Optional<String> _short();

  Optional<Markdown> comment();

  Optional<Attachment> defaultValueAttachment();

  Optional<String> patternTime();

  Optional<ParameterDefinition> patternParameterDefinition();

  Optional<Contributor> patternContributor();

  Optional<Markdown> definition();

  Optional<List<ElementDefinition_Type>> type();

  Optional<List<Id>> condition();

  Optional<String> fixedUrl();

  Optional<ContactDetail> defaultValueContactDetail();

  Optional<ContactPoint> defaultValueContactPoint();

  Optional<List<String>> alias();

  Optional<Annotation> defaultValueAnnotation();

  Optional<Markdown> requirements();

  Optional<Count> defaultValueCount();

  Optional<Duration> patternDuration();

  Optional<Dosage> patternDosage();

  Optional<Period> patternPeriod();

  Optional<Duration> defaultValueDuration();

  Optional<String> patternUuid();

  Optional<String> defaultValueUrl();

  Optional<String> defaultValueUri();

  Optional<String> defaultValueTime();

  Optional<String> patternInstant();

  Optional<TriggerDefinition> patternTriggerDefinition();

  Optional<Double> defaultValueInteger();

  Optional<Double> minValueUnsignedInt();

  Optional<String> maxValueTime();

  Optional<Double> maxValueDecimal();

  Optional<HumanName> defaultValueHumanName();

  Optional<String> fixedOid();

  Optional<TriggerDefinition> fixedTriggerDefinition();

  Optional<Period> fixedPeriod();

  Optional<Dosage> fixedDosage();

  Optional<Double> defaultValueUnsignedInt();

  Optional<HumanName> fixedHumanName();

  Optional<String> sliceName();

  Optional<DataRequirement> patternDataRequirement();

  Optional<Uri> contentReference();

  Optional<Count> patternCount();

  Optional<String> minValueInstant();

  Optional<String> defaultValueCode();

  Optional<String> maxValueInstant();

  Optional<Boolean> patternBoolean();

  Optional<List<ElementDefinition_Example>> example();

  Optional<String> fixedTime();

  Optional<String> patternDate();

  Optional<Money> defaultValueMoney();

  Optional<Attachment> patternAttachment();

  Optional<Meta> defaultValueMeta();

  Optional<String> fixedInstant();

  Optional<Double> minValueInteger();

  Optional<ElementDefinition_Base> base();

  Optional<RelatedArtifact> fixedRelatedArtifact();

  Optional<Annotation> fixedAnnotation();

  Optional<ElementDefinition_Slicing> slicing();

  Optional<String> patternString();

  Optional<RelatedArtifact> defaultValueRelatedArtifact();

  Optional<CodeableConcept> patternCodeableConcept();

  Optional<String> maxValueDateTime();

  Optional<String> orderMeaning();

  Optional<Double> patternUnsignedInt();

  Optional<Annotation> patternAnnotation();

  Optional<Reference> patternReference();

  Optional<Distance> defaultValueDistance();

  Optional<SampledData> patternSampledData();

  Optional<String> id();

  Optional<ContactPoint> fixedContactPoint();

  Optional<String> fixedDateTime();

  Optional<String> max();

  Optional<Meta> patternMeta();

  Optional<String> defaultValueCanonical();

  Optional<Boolean> mustSupport();

  Optional<String> minValueDateTime();

  Optional<Expression> fixedExpression();

  Optional<TriggerDefinition> defaultValueTriggerDefinition();

  Optional<Meta> fixedMeta();

  Optional<Age> fixedAge();

  Optional<Identifier> defaultValueIdentifier();

  Optional<Count> fixedCount();

  Optional<Quantity> patternQuantity();

  Optional<Contributor> defaultValueContributor();

  Optional<String> fixedBase64Binary();

  Optional<String> minValueTime();

  Optional<Range> fixedRange();

  Optional<String> defaultValueMarkdown();

  Optional<Timing> defaultValueTiming();

  Optional<ContactPoint> patternContactPoint();

  Optional<String> patternDateTime();

  Optional<Signature> defaultValueSignature();

  Optional<List<Extension>> extension();

  Optional<RelatedArtifact> patternRelatedArtifact();

  Optional<Quantity> minValueQuantity();

  Optional<Dosage> defaultValueDosage();

  Optional<String> fixedCanonical();

  Optional<ContactDetail> patternContactDetail();

  Optional<ElementDefinition_Binding> binding();

  Optional<String> fixedId();

  Optional<String> defaultValueOid();

  Optional<Address> fixedAddress();

  Optional<ParameterDefinition> defaultValueParameterDefinition();

  Optional<HumanName> patternHumanName();

  Optional<String> fixedDate();

  Optional<String> patternUrl();

  Optional<SampledData> defaultValueSampledData();

  Optional<ContactDetail> fixedContactDetail();

  Optional<String> defaultValueInstant();

  Optional<String> isModifierReason();

  Optional<List<Extension>> modifierExtension();

  Optional<Timing> patternTiming();

  Optional<DataRequirement> defaultValueDataRequirement();

  Optional<Age> defaultValueAge();

  Optional<ParameterDefinition> fixedParameterDefinition();

  Optional<String> patternId();

  Optional<Timing> fixedTiming();

  Optional<String> fixedMarkdown();

  Optional<Double> fixedInteger();

  Optional<Signature> fixedSignature();

  Optional<DataRequirement> fixedDataRequirement();

  Optional<UnsignedInt> min();

  Optional<Reference> defaultValueReference();

  Optional<Boolean> isSummary();

  Optional<String> path();

  Optional<Double> patternInteger();

  Optional<String> maxValueDate();

  Optional<Coding> patternCoding();

  Optional<Double> maxValuePositiveInt();

  Optional<String> defaultValueBase64Binary();

  Optional<Distance> patternDistance();

  Optional<Double> fixedPositiveInt();

  Optional<Markdown> meaningWhenMissing();

  Optional<Address> patternAddress();

  Optional<String> label();

  Optional<String> patternBase64Binary();

  Optional<Signature> patternSignature();

  Optional<List<Coding>> code();

  Optional<Identifier> fixedIdentifier();

  Optional<String> fixedCode();

  Optional<String> defaultValueUuid();

  Optional<SampledData> fixedSampledData();

  Optional<Coding> defaultValueCoding();

  Optional<Ratio> defaultValueRatio();

  Optional<String> fixedString();

  Optional<String> fixedUuid();

  Optional<Quantity> defaultValueQuantity();

  Optional<Ratio> patternRatio();

  Optional<Boolean> defaultValueBoolean();

  Optional<String> patternOid();

  Optional<Age> patternAge();

  Optional<List<ElementDefinition_Constraint>> constraint();

  Optional<String> defaultValueDate();

  static ImmutableElementDefinition.Builder builder() {
    return ImmutableElementDefinition.builder();
  }
}
