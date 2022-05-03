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
  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<Date> approvalDate();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> experimental();

  Optional<Meta> meta();

  Optional<List<Canonical>> replaces();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Markdown> copyright();

  Optional<List<UsageContext>> useContext();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Uri> url();

  Optional<Markdown> description();

  Optional<List<Uri>> derivedFromUri();

  Optional<String> publisher();

  Optional<Date> lastReviewDate();

  Optional<String> title();

  Optional<DateTime> date();

  Optional<List<ContactDetail>> contact();

  Optional<List<ChargeItemDefinition_Applicability>> applicability();

  Optional<Id> id();

  Optional<List<Canonical>> partOf();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> code();

  Optional<List<Reference>> instance();

  Optional<String> version();

  Optional<List<ChargeItemDefinition_PropertyGroup>> propertyGroup();

  Optional<ChargeitemdefinitionStatus> status();

  Optional<Period> effectivePeriod();

  static ImmutableChargeItemDefinition.ResourceTypeBuildStage builder() {
    return ImmutableChargeItemDefinition.builder();
  }
}
