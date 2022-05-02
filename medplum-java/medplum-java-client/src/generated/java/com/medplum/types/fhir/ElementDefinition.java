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
  Optional<Count> fixedCount();

  Optional<Distance> defaultValueDistance();

  Optional<Quantity> fixedQuantity();

  Optional<Attachment> patternAttachment();

  Optional<String> defaultValueString();

  Optional<Markdown> comment();

  Optional<Quantity> defaultValueQuantity();

  Optional<Reference> patternReference();

  Optional<Double> defaultValueDecimal();

  Optional<UsageContext> fixedUsageContext();

  Optional<Double> minValueInteger();

  Optional<Double> minValuePositiveInt();

  Optional<Reference> fixedReference();

  Optional<ContactPoint> defaultValueContactPoint();

  Optional<Address> patternAddress();

  Optional<TriggerDefinition> patternTriggerDefinition();

  Optional<String> defaultValueBase64Binary();

  Optional<Boolean> isModifier();

  Optional<Period> fixedPeriod();

  Optional<Attachment> defaultValueAttachment();

  Optional<Ratio> patternRatio();

  Optional<Annotation> defaultValueAnnotation();

  Optional<Identifier> defaultValueIdentifier();

  Optional<String> fixedTime();

  Optional<String> patternOid();

  Optional<String> sliceName();

  Optional<List<ElementDefinition_Type>> type();

  Optional<SampledData> patternSampledData();

  Optional<List<ElementDefinition_Constraint>> constraint();

  Optional<Money> fixedMoney();

  Optional<Markdown> definition();

  Optional<Double> patternDecimal();

  Optional<Boolean> isSummary();

  Optional<String> orderMeaning();

  Optional<String> patternInstant();

  Optional<Double> defaultValuePositiveInt();

  Optional<Signature> fixedSignature();

  Optional<List<ElementDefinition_Example>> example();

  Optional<List<Coding>> code();

  Optional<String> isModifierReason();

  Optional<Double> fixedUnsignedInt();

  Optional<String> defaultValueInstant();

  Optional<ContactPoint> fixedContactPoint();

  Optional<String> defaultValueId();

  Optional<Age> defaultValueAge();

  Optional<Attachment> fixedAttachment();

  Optional<Age> fixedAge();

  Optional<List<Extension>> extension();

  Optional<HumanName> fixedHumanName();

  Optional<String> patternMarkdown();

  Optional<Boolean> defaultValueBoolean();

  Optional<Integer> maxLength();

  Optional<String> patternString();

  Optional<ParameterDefinition> defaultValueParameterDefinition();

  Optional<TriggerDefinition> defaultValueTriggerDefinition();

  Optional<String> patternDate();

  Optional<String> defaultValueOid();

  Optional<String> fixedUri();

  Optional<String> defaultValueTime();

  Optional<Dosage> patternDosage();

  Optional<String> fixedUrl();

  Optional<Expression> defaultValueExpression();

  Optional<RelatedArtifact> fixedRelatedArtifact();

  Optional<Timing> patternTiming();

  Optional<String> maxValueTime();

  Optional<Meta> fixedMeta();

  Optional<ContactPoint> patternContactPoint();

  Optional<RelatedArtifact> patternRelatedArtifact();

  Optional<String> defaultValueUrl();

  Optional<String> patternBase64Binary();

  Optional<HumanName> defaultValueHumanName();

  Optional<Boolean> patternBoolean();

  Optional<List<Extension>> modifierExtension();

  Optional<Duration> defaultValueDuration();

  Optional<ContactDetail> defaultValueContactDetail();

  Optional<String> path();

  Optional<Timing> fixedTiming();

  Optional<Expression> fixedExpression();

  Optional<String> defaultValueUuid();

  Optional<DataRequirement> patternDataRequirement();

  Optional<Timing> defaultValueTiming();

  Optional<String> fixedInstant();

  Optional<String> fixedDateTime();

  Optional<UsageContext> defaultValueUsageContext();

  Optional<String> fixedBase64Binary();

  @JsonProperty("short")
  Optional<String> _short();

  Optional<Quantity> minValueQuantity();

  Optional<Boolean> fixedBoolean();

  Optional<HumanName> patternHumanName();

  Optional<Double> patternUnsignedInt();

  Optional<List<ElementDefinition_Mapping>> mapping();

  Optional<String> defaultValueCode();

  Optional<String> patternDateTime();

  Optional<String> fixedId();

  Optional<Identifier> fixedIdentifier();

  Optional<Period> defaultValuePeriod();

  Optional<String> id();

  Optional<Double> fixedDecimal();

  Optional<Boolean> sliceIsConstraining();

  Optional<Duration> fixedDuration();

  Optional<String> defaultValueCanonical();

  Optional<Reference> defaultValueReference();

  Optional<Count> defaultValueCount();

  Optional<Contributor> defaultValueContributor();

  Optional<String> label();

  Optional<ElementDefinition_Slicing> slicing();

  Optional<String> defaultValueMarkdown();

  Optional<Dosage> defaultValueDosage();

  Optional<Count> patternCount();

  Optional<Uri> contentReference();

  Optional<String> maxValueDate();

  Optional<RelatedArtifact> defaultValueRelatedArtifact();

  Optional<ContactDetail> fixedContactDetail();

  Optional<Double> maxValueUnsignedInt();

  Optional<String> fixedCanonical();

  Optional<SampledData> fixedSampledData();

  Optional<String> patternUrl();

  Optional<Duration> patternDuration();

  Optional<Double> minValueUnsignedInt();

  Optional<Quantity> maxValueQuantity();

  Optional<Annotation> patternAnnotation();

  Optional<DataRequirement> fixedDataRequirement();

  Optional<CodeableConcept> defaultValueCodeableConcept();

  Optional<String> patternCanonical();

  Optional<String> fixedUuid();

  Optional<Double> defaultValueInteger();

  Optional<Range> defaultValueRange();

  Optional<ElementDefinition_Binding> binding();

  Optional<CodeableConcept> patternCodeableConcept();

  Optional<String> defaultValueUri();

  Optional<Coding> defaultValueCoding();

  Optional<Double> maxValueInteger();

  Optional<Signature> defaultValueSignature();

  Optional<String> minValueDateTime();

  Optional<Address> fixedAddress();

  Optional<String> maxValueDateTime();

  Optional<Double> fixedPositiveInt();

  Optional<Markdown> meaningWhenMissing();

  Optional<Expression> patternExpression();

  Optional<Money> patternMoney();

  Optional<String> minValueTime();

  Optional<Meta> defaultValueMeta();

  Optional<Distance> patternDistance();

  Optional<String> minValueInstant();

  Optional<String> max();

  Optional<ElementDefinition_Base> base();

  Optional<List<ElementdefinitionRepresentationItem>> representation();

  Optional<String> patternCode();

  Optional<Signature> patternSignature();

  Optional<Meta> patternMeta();

  Optional<Double> patternPositiveInt();

  Optional<List<String>> alias();

  Optional<Double> fixedInteger();

  Optional<Identifier> patternIdentifier();

  Optional<SampledData> defaultValueSampledData();

  Optional<Double> defaultValueUnsignedInt();

  Optional<String> patternUri();

  Optional<Dosage> fixedDosage();

  Optional<String> fixedOid();

  Optional<Double> patternInteger();

  Optional<Ratio> fixedRatio();

  Optional<CodeableConcept> fixedCodeableConcept();

  Optional<Money> defaultValueMoney();

  Optional<ContactDetail> patternContactDetail();

  Optional<String> fixedCode();

  Optional<Double> minValueDecimal();

  Optional<String> defaultValueDateTime();

  Optional<Age> patternAge();

  Optional<String> fixedString();

  Optional<UsageContext> patternUsageContext();

  Optional<String> patternTime();

  Optional<Range> patternRange();

  Optional<Contributor> fixedContributor();

  Optional<Coding> fixedCoding();

  Optional<Period> patternPeriod();

  Optional<List<Id>> condition();

  Optional<Range> fixedRange();

  Optional<Ratio> defaultValueRatio();

  Optional<DataRequirement> defaultValueDataRequirement();

  Optional<Coding> patternCoding();

  Optional<String> fixedMarkdown();

  Optional<TriggerDefinition> fixedTriggerDefinition();

  Optional<Boolean> mustSupport();

  Optional<ParameterDefinition> fixedParameterDefinition();

  Optional<Double> maxValueDecimal();

  Optional<String> patternId();

  Optional<Markdown> requirements();

  Optional<Address> defaultValueAddress();

  Optional<Distance> fixedDistance();

  Optional<Annotation> fixedAnnotation();

  Optional<Double> maxValuePositiveInt();

  Optional<String> defaultValueDate();

  Optional<ParameterDefinition> patternParameterDefinition();

  Optional<String> maxValueInstant();

  Optional<UnsignedInt> min();

  Optional<Contributor> patternContributor();

  Optional<String> minValueDate();

  Optional<String> fixedDate();

  Optional<Quantity> patternQuantity();

  Optional<String> patternUuid();

  static ImmutableElementDefinition.Builder builder() {
    return ImmutableElementDefinition.builder();
  }
}
