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
  Optional<DataRequirement> defaultValueDataRequirement();

  Optional<ParameterDefinition> defaultValueParameterDefinition();

  Optional<Contributor> defaultValueContributor();

  Optional<TriggerDefinition> defaultValueTriggerDefinition();

  Optional<Expression> defaultValueExpression();

  Optional<String> defaultValueCanonical();

  Optional<Id> variable();

  Optional<SampledData> defaultValueSampledData();

  Optional<String> condition();

  Optional<Double> defaultValueDecimal();

  Optional<String> defaultValueBase64Binary();

  Optional<String> defaultValueString();

  Optional<String> defaultValueDateTime();

  Optional<String> defaultValueMarkdown();

  Optional<List<Extension>> extension();

  Optional<HumanName> defaultValueHumanName();

  Optional<Signature> defaultValueSignature();

  Optional<Count> defaultValueCount();

  Optional<Coding> defaultValueCoding();

  Optional<ContactDetail> defaultValueContactDetail();

  Optional<Timing> defaultValueTiming();

  Optional<UsageContext> defaultValueUsageContext();

  Optional<Money> defaultValueMoney();

  Optional<Distance> defaultValueDistance();

  Optional<String> defaultValueUrl();

  Optional<String> element();

  Optional<String> logMessage();

  Optional<String> defaultValueCode();

  Optional<Annotation> defaultValueAnnotation();

  Optional<Boolean> defaultValueBoolean();

  Optional<Duration> defaultValueDuration();

  Optional<Reference> defaultValueReference();

  Optional<Address> defaultValueAddress();

  Optional<Quantity> defaultValueQuantity();

  Optional<String> defaultValueOid();

  Optional<CodeableConcept> defaultValueCodeableConcept();

  Optional<Double> defaultValuePositiveInt();

  Optional<Age> defaultValueAge();

  Optional<Double> defaultValueInteger();

  Optional<String> defaultValueUuid();

  Optional<Structuremap_sourceListmode> listMode();

  Optional<Double> defaultValueUnsignedInt();

  Optional<String> defaultValueDate();

  Optional<Ratio> defaultValueRatio();

  Optional<String> defaultValueUri();

  Optional<Id> context();

  Optional<Period> defaultValuePeriod();

  Optional<RelatedArtifact> defaultValueRelatedArtifact();

  Optional<String> id();

  Optional<Meta> defaultValueMeta();

  Optional<String> defaultValueId();

  Optional<List<Extension>> modifierExtension();

  Optional<String> max();

  Optional<String> defaultValueTime();

  Optional<Attachment> defaultValueAttachment();

  Optional<Identifier> defaultValueIdentifier();

  Optional<String> check();

  Optional<Range> defaultValueRange();

  Optional<Dosage> defaultValueDosage();

  Optional<String> type();

  Optional<String> defaultValueInstant();

  Optional<Integer> min();

  Optional<ContactPoint> defaultValueContactPoint();

  static ImmutableStructureMap_Source.Builder builder() {
    return ImmutableStructureMap_Source.builder();
  }
}
