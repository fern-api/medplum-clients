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
  Optional<String> defaultValueCode();

  Optional<HumanName> defaultValueHumanName();

  Optional<Duration> defaultValueDuration();

  Optional<Money> defaultValueMoney();

  Optional<List<Extension>> extension();

  Optional<Timing> defaultValueTiming();

  Optional<String> type();

  Optional<String> defaultValueBase64Binary();

  Optional<String> defaultValueId();

  Optional<Id> variable();

  Optional<Double> defaultValueUnsignedInt();

  Optional<String> max();

  Optional<Quantity> defaultValueQuantity();

  Optional<String> defaultValueCanonical();

  Optional<Distance> defaultValueDistance();

  Optional<Identifier> defaultValueIdentifier();

  Optional<String> defaultValueUrl();

  Optional<String> element();

  Optional<String> condition();

  Optional<Address> defaultValueAddress();

  Optional<UsageContext> defaultValueUsageContext();

  Optional<String> defaultValueTime();

  Optional<ContactDetail> defaultValueContactDetail();

  Optional<String> defaultValueUuid();

  Optional<Double> defaultValueInteger();

  Optional<String> defaultValueUri();

  Optional<String> defaultValueInstant();

  Optional<RelatedArtifact> defaultValueRelatedArtifact();

  Optional<CodeableConcept> defaultValueCodeableConcept();

  Optional<Period> defaultValuePeriod();

  Optional<String> defaultValueMarkdown();

  Optional<String> defaultValueDate();

  Optional<Attachment> defaultValueAttachment();

  Optional<SampledData> defaultValueSampledData();

  Optional<Age> defaultValueAge();

  Optional<Range> defaultValueRange();

  Optional<Expression> defaultValueExpression();

  Optional<Ratio> defaultValueRatio();

  Optional<String> defaultValueOid();

  Optional<String> id();

  Optional<Reference> defaultValueReference();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> defaultValueBoolean();

  Optional<String> check();

  Optional<Annotation> defaultValueAnnotation();

  Optional<String> defaultValueString();

  Optional<String> defaultValueDateTime();

  Optional<Coding> defaultValueCoding();

  Optional<Signature> defaultValueSignature();

  Optional<Dosage> defaultValueDosage();

  Optional<Structuremap_sourceListmode> listMode();

  Optional<String> logMessage();

  Optional<Double> defaultValueDecimal();

  Optional<Count> defaultValueCount();

  Optional<Meta> defaultValueMeta();

  Optional<Id> context();

  Optional<Double> defaultValuePositiveInt();

  Optional<Integer> min();

  Optional<DataRequirement> defaultValueDataRequirement();

  Optional<ParameterDefinition> defaultValueParameterDefinition();

  Optional<ContactPoint> defaultValueContactPoint();

  Optional<Contributor> defaultValueContributor();

  Optional<TriggerDefinition> defaultValueTriggerDefinition();

  static ImmutableStructureMap_Source.Builder builder() {
    return ImmutableStructureMap_Source.builder();
  }
}
