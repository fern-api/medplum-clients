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
  Optional<Meta> fixedMeta();

  Optional<DataRequirement> defaultValueDataRequirement();

  Optional<Double> maxValueUnsignedInt();

  Optional<Reference> fixedReference();

  Optional<String> patternDate();

  Optional<Double> defaultValuePositiveInt();

  Optional<String> fixedUri();

  Optional<String> defaultValueCode();

  Optional<String> defaultValueDate();

  Optional<String> fixedUuid();

  Optional<String> maxValueInstant();

  Optional<Duration> patternDuration();

  Optional<Range> patternRange();

  Optional<String> fixedTime();

  Optional<Quantity> defaultValueQuantity();

  Optional<String> fixedUrl();

  Optional<Annotation> fixedAnnotation();

  Optional<String> fixedOid();

  Optional<CodeableConcept> defaultValueCodeableConcept();

  Optional<Identifier> defaultValueIdentifier();

  Optional<Integer> maxLength();

  Optional<UnsignedInt> min();

  Optional<List<ElementDefinition_Constraint>> constraint();

  Optional<String> defaultValueUrl();

  Optional<Expression> patternExpression();

  Optional<Markdown> requirements();

  Optional<Markdown> definition();

  Optional<String> patternId();

  Optional<Meta> patternMeta();

  Optional<String> patternTime();

  Optional<RelatedArtifact> defaultValueRelatedArtifact();

  Optional<String> sliceName();

  Optional<ElementDefinition_Slicing> slicing();

  Optional<String> defaultValueId();

  Optional<Double> fixedInteger();

  Optional<Address> fixedAddress();

  Optional<Signature> patternSignature();

  Optional<String> minValueDateTime();

  Optional<Markdown> comment();

  Optional<Duration> fixedDuration();

  Optional<Boolean> sliceIsConstraining();

  Optional<Double> maxValuePositiveInt();

  Optional<Range> defaultValueRange();

  Optional<String> defaultValueMarkdown();

  Optional<String> patternDateTime();

  Optional<Quantity> minValueQuantity();

  Optional<String> defaultValueDateTime();

  Optional<Quantity> patternQuantity();

  Optional<Period> defaultValuePeriod();

  Optional<String> fixedDate();

  Optional<ElementDefinition_Binding> binding();

  Optional<TriggerDefinition> fixedTriggerDefinition();

  Optional<String> patternCode();

  Optional<Ratio> patternRatio();

  Optional<Contributor> defaultValueContributor();

  Optional<String> maxValueTime();

  Optional<Double> fixedPositiveInt();

  Optional<List<ElementDefinition_Mapping>> mapping();

  Optional<Double> fixedDecimal();

  Optional<TriggerDefinition> defaultValueTriggerDefinition();

  Optional<CodeableConcept> patternCodeableConcept();

  Optional<Expression> fixedExpression();

  Optional<Double> fixedUnsignedInt();

  Optional<Count> fixedCount();

  Optional<Double> minValueUnsignedInt();

  Optional<HumanName> fixedHumanName();

  Optional<Age> patternAge();

  Optional<Duration> defaultValueDuration();

  Optional<String> defaultValueCanonical();

  Optional<Double> patternDecimal();

  Optional<Attachment> defaultValueAttachment();

  Optional<UsageContext> fixedUsageContext();

  Optional<Identifier> fixedIdentifier();

  Optional<ParameterDefinition> defaultValueParameterDefinition();

  Optional<String> defaultValueInstant();

  Optional<String> id();

  Optional<Double> minValueInteger();

  Optional<Money> defaultValueMoney();

  Optional<ContactDetail> defaultValueContactDetail();

  Optional<Boolean> fixedBoolean();

  Optional<String> patternBase64Binary();

  Optional<Meta> defaultValueMeta();

  Optional<Coding> fixedCoding();

  Optional<RelatedArtifact> patternRelatedArtifact();

  Optional<String> patternCanonical();

  Optional<HumanName> patternHumanName();

  Optional<List<Id>> condition();

  Optional<List<Coding>> code();

  Optional<Expression> defaultValueExpression();

  Optional<Boolean> patternBoolean();

  Optional<Double> patternPositiveInt();

  Optional<List<ElementdefinitionRepresentationItem>> representation();

  Optional<Timing> fixedTiming();

  Optional<DataRequirement> patternDataRequirement();

  Optional<String> patternUrl();

  Optional<Coding> defaultValueCoding();

  Optional<Timing> defaultValueTiming();

  Optional<Coding> patternCoding();

  Optional<Ratio> defaultValueRatio();

  Optional<Ratio> fixedRatio();

  Optional<String> fixedCode();

  Optional<String> isModifierReason();

  Optional<Reference> defaultValueReference();

  Optional<Quantity> maxValueQuantity();

  Optional<Double> maxValueDecimal();

  Optional<Double> maxValueInteger();

  Optional<String> maxValueDate();

  Optional<Contributor> fixedContributor();

  Optional<Reference> patternReference();

  Optional<String> patternUuid();

  Optional<Period> patternPeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> meaningWhenMissing();

  Optional<Address> patternAddress();

  Optional<ContactDetail> patternContactDetail();

  Optional<RelatedArtifact> fixedRelatedArtifact();

  Optional<String> label();

  Optional<Identifier> patternIdentifier();

  Optional<Age> defaultValueAge();

  Optional<ContactPoint> defaultValueContactPoint();

  Optional<Period> fixedPeriod();

  Optional<String> minValueDate();

  Optional<String> defaultValueTime();

  Optional<String> patternUri();

  Optional<Boolean> isModifier();

  Optional<DataRequirement> fixedDataRequirement();

  Optional<Range> fixedRange();

  Optional<Signature> defaultValueSignature();

  Optional<String> defaultValueString();

  Optional<String> patternMarkdown();

  Optional<Boolean> mustSupport();

  Optional<String> fixedCanonical();

  Optional<List<String>> alias();

  Optional<String> max();

  Optional<ParameterDefinition> patternParameterDefinition();

  Optional<List<Extension>> extension();

  Optional<Uri> contentReference();

  Optional<CodeableConcept> fixedCodeableConcept();

  Optional<Attachment> fixedAttachment();

  Optional<String> maxValueDateTime();

  Optional<SampledData> fixedSampledData();

  Optional<String> orderMeaning();

  Optional<String> fixedInstant();

  Optional<Double> patternUnsignedInt();

  Optional<String> defaultValueUri();

  Optional<String> patternOid();

  Optional<ParameterDefinition> fixedParameterDefinition();

  Optional<Double> minValuePositiveInt();

  Optional<Age> fixedAge();

  Optional<SampledData> defaultValueSampledData();

  Optional<Dosage> defaultValueDosage();

  Optional<String> defaultValueBase64Binary();

  Optional<SampledData> patternSampledData();

  Optional<Annotation> patternAnnotation();

  Optional<String> fixedDateTime();

  Optional<ContactDetail> fixedContactDetail();

  Optional<Annotation> defaultValueAnnotation();

  Optional<String> fixedString();

  Optional<Boolean> isSummary();

  Optional<Distance> fixedDistance();

  Optional<Money> fixedMoney();

  Optional<Count> patternCount();

  Optional<String> defaultValueUuid();

  Optional<Attachment> patternAttachment();

  Optional<ContactPoint> fixedContactPoint();

  Optional<Dosage> fixedDosage();

  Optional<Address> defaultValueAddress();

  Optional<String> patternString();

  Optional<String> patternInstant();

  Optional<UsageContext> patternUsageContext();

  Optional<String> minValueTime();

  Optional<String> path();

  Optional<HumanName> defaultValueHumanName();

  Optional<Signature> fixedSignature();

  Optional<TriggerDefinition> patternTriggerDefinition();

  Optional<String> fixedMarkdown();

  Optional<Double> defaultValueDecimal();

  Optional<Double> defaultValueUnsignedInt();

  Optional<Dosage> patternDosage();

  Optional<String> minValueInstant();

  Optional<Timing> patternTiming();

  Optional<String> defaultValueOid();

  Optional<Count> defaultValueCount();

  Optional<Double> patternInteger();

  Optional<Double> defaultValueInteger();

  Optional<Boolean> defaultValueBoolean();

  Optional<Money> patternMoney();

  Optional<ElementDefinition_Base> base();

  Optional<Contributor> patternContributor();

  @JsonProperty("short")
  Optional<String> _short();

  Optional<String> fixedBase64Binary();

  Optional<Double> minValueDecimal();

  Optional<Quantity> fixedQuantity();

  Optional<Distance> patternDistance();

  Optional<Distance> defaultValueDistance();

  Optional<UsageContext> defaultValueUsageContext();

  Optional<ContactPoint> patternContactPoint();

  Optional<String> fixedId();

  Optional<List<ElementDefinition_Type>> type();

  Optional<List<ElementDefinition_Example>> example();

  static ImmutableElementDefinition.Builder builder() {
    return ImmutableElementDefinition.builder();
  }
}
