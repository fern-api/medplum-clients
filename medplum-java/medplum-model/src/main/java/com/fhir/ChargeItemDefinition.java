package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableChargeItemDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ChargeItemDefinition {
  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<dateTime> date();

  Optional<uri> url();

  Optional<List<canonical>> replaces();

  Optional<List<ChargeItemDefinition_PropertyGroup>> propertyGroup();

  Optional<markdown> copyright();

  Optional<CodeableConcept> code();

  Optional<String> publisher();

  Optional<List<Identifier>> identifier();

  Optional<date> approvalDate();

  Optional<date> lastReviewDate();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<Period> effectivePeriod();

  Optional<String> version();

  Optional<String> title();

  Optional<List<ContactDetail>> contact();

  Optional<id> id();

  Optional<List<canonical>> partOf();

  Optional<Boolean> experimental();

  Optional<Narrative> text();

  Optional<List<Reference>> instance();

  Optional<uri> implicitRules();

  Optional<code> language();

  Optional<List<UsageContext>> useContext();

  Optional<List<uri>> derivedFromUri();

  Optional<ChargeitemdefinitionStatus> status();

  Optional<markdown> description();

  Optional<List<ChargeItemDefinition_Applicability>> applicability();

  static ImmutableChargeItemDefinition.ResourceTypeBuildStage builder() {
    return ImmutableChargeItemDefinition.builder();
  }
}
