package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    as = ImmutableStructureMap_Source.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Source {
  Optional<String> defaultValueUrl();

  Optional<String> defaultValueMarkdown();

  Optional<Double> defaultValuePositiveInt();

  Optional<String> element();

  Optional<String> condition();

  Optional<String> id();

  Optional<String> defaultValueCanonical();

  Optional<Period> defaultValuePeriod();

  Optional<UsageContext> defaultValueUsageContext();

  Optional<String> defaultValueDate();

  Optional<Address> defaultValueAddress();

  Optional<Double> defaultValueDecimal();

  Optional<Identifier> defaultValueIdentifier();

  Optional<Structuremap_sourceListmode> listMode();

  Optional<Distance> defaultValueDistance();

  Optional<String> defaultValueDateTime();

  Optional<ContactPoint> defaultValueContactPoint();

  Optional<Age> defaultValueAge();

  Optional<Range> defaultValueRange();

  Optional<Count> defaultValueCount();

  Optional<DataRequirement> defaultValueDataRequirement();

  Optional<Integer> min();

  Optional<ParameterDefinition> defaultValueParameterDefinition();

  Optional<String> type();

  Optional<Duration> defaultValueDuration();

  Optional<Attachment> defaultValueAttachment();

  Optional<Quantity> defaultValueQuantity();

  Optional<id> variable();

  Optional<Double> defaultValueInteger();

  Optional<String> defaultValueUri();

  Optional<CodeableConcept> defaultValueCodeableConcept();

  Optional<String> logMessage();

  Optional<Coding> defaultValueCoding();

  Optional<HumanName> defaultValueHumanName();

  Optional<String> max();

  Optional<String> defaultValueInstant();

  Optional<RelatedArtifact> defaultValueRelatedArtifact();

  Optional<String> defaultValueId();

  Optional<TriggerDefinition> defaultValueTriggerDefinition();

  Optional<Contributor> defaultValueContributor();

  Optional<Dosage> defaultValueDosage();

  Optional<Meta> defaultValueMeta();

  Optional<Ratio> defaultValueRatio();

  Optional<SampledData> defaultValueSampledData();

  Optional<String> defaultValueString();

  Optional<id> context();

  Optional<Double> defaultValueUnsignedInt();

  Optional<Boolean> defaultValueBoolean();

  Optional<Annotation> defaultValueAnnotation();

  Optional<String> defaultValueBase64Binary();

  Optional<String> defaultValueUuid();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> check();

  Optional<String> defaultValueTime();

  Optional<String> defaultValueCode();

  Optional<ContactDetail> defaultValueContactDetail();

  Optional<Expression> defaultValueExpression();

  Optional<Money> defaultValueMoney();

  Optional<Signature> defaultValueSignature();

  Optional<Timing> defaultValueTiming();

  Optional<Reference> defaultValueReference();

  Optional<String> defaultValueOid();

  static ImmutableStructureMap_Source.Builder builder() {
    return ImmutableStructureMap_Source.builder();
  }
}
