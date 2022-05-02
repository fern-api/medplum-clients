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
  Optional<Annotation> defaultValueAnnotation();

  Optional<String> logMessage();

  Optional<String> defaultValueUri();

  Optional<Reference> defaultValueReference();

  Optional<String> condition();

  Optional<Range> defaultValueRange();

  Optional<Age> defaultValueAge();

  Optional<String> defaultValueUrl();

  Optional<Double> defaultValuePositiveInt();

  Optional<Coding> defaultValueCoding();

  Optional<String> defaultValueOid();

  Optional<Double> defaultValueUnsignedInt();

  Optional<String> type();

  Optional<String> defaultValueString();

  Optional<Signature> defaultValueSignature();

  Optional<String> defaultValueUuid();

  Optional<TriggerDefinition> defaultValueTriggerDefinition();

  Optional<Timing> defaultValueTiming();

  Optional<DataRequirement> defaultValueDataRequirement();

  Optional<Quantity> defaultValueQuantity();

  Optional<String> defaultValueInstant();

  Optional<ParameterDefinition> defaultValueParameterDefinition();

  Optional<List<Extension>> modifierExtension();

  Optional<String> defaultValueMarkdown();

  Optional<List<Extension>> extension();

  Optional<Distance> defaultValueDistance();

  Optional<Id> context();

  Optional<Double> defaultValueInteger();

  Optional<String> max();

  Optional<Attachment> defaultValueAttachment();

  Optional<Integer> min();

  Optional<String> defaultValueTime();

  Optional<Duration> defaultValueDuration();

  Optional<String> check();

  Optional<String> defaultValueBase64Binary();

  Optional<Contributor> defaultValueContributor();

  Optional<Double> defaultValueDecimal();

  Optional<RelatedArtifact> defaultValueRelatedArtifact();

  Optional<UsageContext> defaultValueUsageContext();

  Optional<String> id();

  Optional<Money> defaultValueMoney();

  Optional<Identifier> defaultValueIdentifier();

  Optional<String> element();

  Optional<String> defaultValueCode();

  Optional<ContactDetail> defaultValueContactDetail();

  Optional<Dosage> defaultValueDosage();

  Optional<Meta> defaultValueMeta();

  Optional<Period> defaultValuePeriod();

  Optional<String> defaultValueCanonical();

  Optional<String> defaultValueId();

  Optional<HumanName> defaultValueHumanName();

  Optional<Ratio> defaultValueRatio();

  Optional<CodeableConcept> defaultValueCodeableConcept();

  Optional<Expression> defaultValueExpression();

  Optional<SampledData> defaultValueSampledData();

  Optional<String> defaultValueDateTime();

  Optional<Address> defaultValueAddress();

  Optional<ContactPoint> defaultValueContactPoint();

  Optional<Id> variable();

  Optional<Boolean> defaultValueBoolean();

  Optional<String> defaultValueDate();

  Optional<Count> defaultValueCount();

  Optional<Structuremap_sourceListmode> listMode();

  static ImmutableStructureMap_Source.Builder builder() {
    return ImmutableStructureMap_Source.builder();
  }
}
