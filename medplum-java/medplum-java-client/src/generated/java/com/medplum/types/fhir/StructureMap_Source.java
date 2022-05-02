package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    as = ImmutableStructureMap_Source.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Source {
  Optional<Reference> defaultValueReference();

  Optional<Duration> defaultValueDuration();

  Optional<String> defaultValueString();

  Optional<String> check();

  Optional<String> logMessage();

  Optional<String> defaultValueCanonical();

  Optional<String> defaultValueUrl();

  Optional<Range> defaultValueRange();

  Optional<Structuremap_sourceListmode> listMode();

  Optional<ContactPoint> defaultValueContactPoint();

  Optional<String> id();

  Optional<DataRequirement> defaultValueDataRequirement();

  Optional<Ratio> defaultValueRatio();

  Optional<String> element();

  Optional<Money> defaultValueMoney();

  Optional<List<Extension>> extension();

  Optional<Distance> defaultValueDistance();

  Optional<Identifier> defaultValueIdentifier();

  Optional<ParameterDefinition> defaultValueParameterDefinition();

  Optional<String> defaultValueBase64Binary();

  Optional<SampledData> defaultValueSampledData();

  Optional<Annotation> defaultValueAnnotation();

  Optional<Signature> defaultValueSignature();

  Optional<Integer> min();

  Optional<Quantity> defaultValueQuantity();

  Optional<String> defaultValueDateTime();

  Optional<ContactDetail> defaultValueContactDetail();

  Optional<Double> defaultValueDecimal();

  Optional<HumanName> defaultValueHumanName();

  Optional<Age> defaultValueAge();

  Optional<String> max();

  Optional<String> defaultValueTime();

  Optional<RelatedArtifact> defaultValueRelatedArtifact();

  Optional<String> defaultValueCode();

  Optional<Double> defaultValueUnsignedInt();

  Optional<Expression> defaultValueExpression();

  Optional<Coding> defaultValueCoding();

  Optional<Timing> defaultValueTiming();

  Optional<String> defaultValueDate();

  Optional<Period> defaultValuePeriod();

  Optional<String> defaultValueId();

  Optional<String> defaultValueUri();

  Optional<Meta> defaultValueMeta();

  Optional<String> defaultValueMarkdown();

  Optional<String> defaultValueOid();

  Optional<String> defaultValueUuid();

  Optional<String> condition();

  Optional<Address> defaultValueAddress();

  Optional<Attachment> defaultValueAttachment();

  Optional<Double> defaultValuePositiveInt();

  Optional<Id> context();

  Optional<Dosage> defaultValueDosage();

  Optional<Contributor> defaultValueContributor();

  Optional<Double> defaultValueInteger();

  Optional<UsageContext> defaultValueUsageContext();

  Optional<Count> defaultValueCount();

  Optional<List<Extension>> modifierExtension();

  Optional<String> defaultValueInstant();

  Optional<String> type();

  Optional<CodeableConcept> defaultValueCodeableConcept();

  Optional<TriggerDefinition> defaultValueTriggerDefinition();

  Optional<Id> variable();

  Optional<Boolean> defaultValueBoolean();

  static ImmutableStructureMap_Source.Builder builder() {
    return ImmutableStructureMap_Source.builder();
  }
}
