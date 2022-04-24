package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Expression> fixedExpression();

  Optional<Double> minValueUnsignedInt();

  Optional<Double> fixedPositiveInt();

  Optional<unsignedInt> min();

  Optional<markdown> meaningWhenMissing();

  Optional<String> patternCode();

  Optional<ParameterDefinition> patternParameterDefinition();

  Optional<List<Extension>> modifierExtension();

  Optional<Dosage> patternDosage();

  Optional<Double> defaultValueInteger();

  Optional<Double> defaultValueUnsignedInt();

  Optional<Count> patternCount();

  Optional<String> minValueInstant();

  Optional<Double> maxValueUnsignedInt();

  Optional<List<Extension>> extension();

  Optional<String> fixedUri();

  Optional<CodeableConcept> fixedCodeableConcept();

  Optional<Timing> fixedTiming();

  Optional<Attachment> defaultValueAttachment();

  Optional<Quantity> patternQuantity();

  Optional<DataRequirement> patternDataRequirement();

  Optional<Double> fixedDecimal();

  Optional<String> defaultValueId();

  Optional<Quantity> maxValueQuantity();

  Optional<ContactDetail> defaultValueContactDetail();

  Optional<String> defaultValueCode();

  Optional<String> patternOid();

  Optional<Double> minValueDecimal();

  Optional<Quantity> minValueQuantity();

  Optional<Reference> defaultValueReference();

  Optional<String> defaultValueOid();

  Optional<RelatedArtifact> fixedRelatedArtifact();

  Optional<Boolean> fixedBoolean();

  Optional<Contributor> fixedContributor();

  Optional<Double> minValueInteger();

  Optional<Double> patternDecimal();

  Optional<String> id();

  Optional<String> label();

  Optional<List<ElementDefinition_Example>> example();

  Optional<uri> contentReference();

  Optional<Signature> fixedSignature();

  Optional<Annotation> defaultValueAnnotation();

  Optional<String> patternDateTime();

  Optional<String> defaultValueMarkdown();

  Optional<HumanName> fixedHumanName();

  Optional<Ratio> fixedRatio();

  Optional<markdown> comment();

  Optional<Range> patternRange();

  Optional<String> fixedString();

  Optional<HumanName> defaultValueHumanName();

  Optional<String> defaultValueString();

  Optional<Range> fixedRange();

  Optional<Coding> defaultValueCoding();

  Optional<List<String>> alias();

  Optional<Double> defaultValueDecimal();

  Optional<String> fixedInstant();

  Optional<Address> patternAddress();

  Optional<Distance> defaultValueDistance();

  Optional<Duration> fixedDuration();

  Optional<Period> fixedPeriod();

  Optional<String> fixedMarkdown();

  Optional<Coding> fixedCoding();

  Optional<HumanName> patternHumanName();

  Optional<String> defaultValueUri();

  Optional<DataRequirement> fixedDataRequirement();

  Optional<String> max();

  Optional<List<Coding>> code();

  Optional<String> fixedId();

  Optional<Money> defaultValueMoney();

  Optional<Count> defaultValueCount();

  Optional<Dosage> fixedDosage();

  Optional<String> fixedOid();

  Optional<Period> patternPeriod();

  Optional<String> maxValueDateTime();

  Optional<ParameterDefinition> defaultValueParameterDefinition();

  Optional<Ratio> patternRatio();

  Optional<List<ElementDefinition_Constraint>> constraint();

  Optional<Double> fixedUnsignedInt();

  Optional<List<ElementdefinitionRepresentationItem>> representation();

  Optional<String> minValueDateTime();

  Optional<Boolean> defaultValueBoolean();

  Optional<String> patternBase64Binary();

  Optional<RelatedArtifact> patternRelatedArtifact();

  Optional<Period> defaultValuePeriod();

  Optional<Signature> defaultValueSignature();

  Optional<Meta> fixedMeta();

  Optional<String> patternDate();

  Optional<String> fixedBase64Binary();

  Optional<ContactDetail> patternContactDetail();

  Optional<List<ElementDefinition_Type>> type();

  Optional<SampledData> patternSampledData();

  Optional<Double> fixedInteger();

  Optional<String> defaultValueInstant();

  Optional<TriggerDefinition> defaultValueTriggerDefinition();

  Optional<SampledData> defaultValueSampledData();

  Optional<Attachment> fixedAttachment();

  Optional<Boolean> sliceIsConstraining();

  Optional<UsageContext> defaultValueUsageContext();

  Optional<SampledData> fixedSampledData();

  Optional<Meta> patternMeta();

  Optional<CodeableConcept> patternCodeableConcept();

  Optional<Identifier> patternIdentifier();

  Optional<Coding> patternCoding();

  Optional<Boolean> isSummary();

  Optional<Expression> defaultValueExpression();

  Optional<Double> patternPositiveInt();

  Optional<String> maxValueTime();

  Optional<String> patternUrl();

  Optional<Distance> patternDistance();

  Optional<Age> patternAge();

  Optional<Signature> patternSignature();

  Optional<Duration> patternDuration();

  Optional<Meta> defaultValueMeta();

  Optional<Annotation> patternAnnotation();

  Optional<String> maxValueInstant();

  Optional<String> defaultValueBase64Binary();

  Optional<Count> fixedCount();

  Optional<Dosage> defaultValueDosage();

  Optional<String> defaultValueDateTime();

  Optional<UsageContext> fixedUsageContext();

  Optional<String> minValueDate();

  Optional<String> fixedUuid();

  Optional<markdown> requirements();

  Optional<TriggerDefinition> fixedTriggerDefinition();

  Optional<Address> fixedAddress();

  Optional<String> orderMeaning();

  Optional<Contributor> patternContributor();

  Optional<String> defaultValueUrl();

  Optional<Identifier> fixedIdentifier();

  Optional<Timing> defaultValueTiming();

  Optional<String> minValueTime();

  Optional<DataRequirement> defaultValueDataRequirement();

  Optional<ParameterDefinition> fixedParameterDefinition();

  Optional<Double> defaultValuePositiveInt();

  Optional<Ratio> defaultValueRatio();

  Optional<Boolean> isModifier();

  Optional<Reference> patternReference();

  Optional<Age> fixedAge();

  Optional<Address> defaultValueAddress();

  Optional<String> patternMarkdown();

  Optional<Money> patternMoney();

  Optional<Range> defaultValueRange();

  Optional<markdown> definition();

  Optional<Double> patternInteger();

  Optional<String> defaultValueTime();

  Optional<UsageContext> patternUsageContext();

  Optional<String> patternUri();

  Optional<ContactDetail> fixedContactDetail();

  Optional<Integer> maxLength();

  Optional<String> patternTime();

  Optional<String> path();

  Optional<CodeableConcept> defaultValueCodeableConcept();

  Optional<String> defaultValueCanonical();

  Optional<String> defaultValueDate();

  Optional<Money> fixedMoney();

  Optional<Double> patternUnsignedInt();

  Optional<String> fixedCanonical();

  Optional<String> maxValueDate();

  Optional<ContactPoint> defaultValueContactPoint();

  Optional<Distance> fixedDistance();

  Optional<Double> maxValueDecimal();

  Optional<Quantity> defaultValueQuantity();

  Optional<Contributor> defaultValueContributor();

  Optional<RelatedArtifact> defaultValueRelatedArtifact();

  Optional<Boolean> mustSupport();

  Optional<String> isModifierReason();

  Optional<String> fixedCode();

  Optional<String> patternUuid();

  Optional<String> sliceName();

  Optional<List<id>> condition();

  Optional<String> defaultValueUuid();

  Optional<String> fixedUrl();

  Optional<ContactPoint> patternContactPoint();

  Optional<ContactPoint> fixedContactPoint();

  Optional<Boolean> patternBoolean();

  Optional<String> fixedDateTime();

  Optional<ElementDefinition_Binding> binding();

  Optional<String> patternId();

  Optional<String> fixedTime();

  Optional<Timing> patternTiming();

  Optional<Duration> defaultValueDuration();

  Optional<String> patternInstant();

  Optional<Attachment> patternAttachment();

  Optional<Age> defaultValueAge();

  Optional<Double> maxValuePositiveInt();

  Optional<Quantity> fixedQuantity();

  Optional<String> patternString();

  Optional<Double> minValuePositiveInt();

  Optional<String> patternCanonical();

  Optional<Reference> fixedReference();

  Optional<Annotation> fixedAnnotation();

  Optional<List<ElementDefinition_Mapping>> mapping();

  Optional<Expression> patternExpression();

  Optional<ElementDefinition_Slicing> slicing();

  Optional<Double> maxValueInteger();

  Optional<String> fixedDate();

  Optional<ElementDefinition_Base> base();

  Optional<TriggerDefinition> patternTriggerDefinition();

  Optional<Identifier> defaultValueIdentifier();

  @JsonProperty("short")
  Optional<String> _short();

  static ImmutableElementDefinition.Builder builder() {
    return ImmutableElementDefinition.builder();
  }
}
