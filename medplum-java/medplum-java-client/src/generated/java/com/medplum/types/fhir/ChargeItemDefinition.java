package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Canonical>> replaces();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<Date> approvalDate();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> title();

  Optional<Code> language();

  Optional<Uri> url();

  Optional<List<ContactDetail>> contact();

  Optional<CodeableConcept> code();

  Optional<Period> effectivePeriod();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<ChargeItemDefinition_PropertyGroup>> propertyGroup();

  Optional<Markdown> copyright();

  Optional<String> version();

  Optional<List<Canonical>> partOf();

  Optional<Date> lastReviewDate();

  Optional<List<ChargeItemDefinition_Applicability>> applicability();

  Optional<List<Extension>> extension();

  Optional<Markdown> description();

  String resourceType();

  Optional<Boolean> experimental();

  Optional<String> publisher();

  Optional<List<Uri>> derivedFromUri();

  Optional<Uri> implicitRules();

  Optional<DateTime> date();

  Optional<ChargeitemdefinitionStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<UsageContext>> useContext();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> instance();

  static ImmutableChargeItemDefinition.ResourceTypeBuildStage builder() {
    return ImmutableChargeItemDefinition.builder();
  }
}
