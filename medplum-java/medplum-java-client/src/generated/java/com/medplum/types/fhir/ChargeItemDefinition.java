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
  Optional<Markdown> description();

  Optional<Id> id();

  Optional<Date> approvalDate();

  Optional<List<ChargeItemDefinition_PropertyGroup>> propertyGroup();

  Optional<String> publisher();

  Optional<Markdown> copyright();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ContactDetail>> contact();

  Optional<Date> lastReviewDate();

  Optional<List<ChargeItemDefinition_Applicability>> applicability();

  Optional<String> title();

  Optional<List<Reference>> instance();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<List<Canonical>> partOf();

  Optional<Boolean> experimental();

  Optional<Period> effectivePeriod();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<String> version();

  Optional<DateTime> date();

  Optional<ChargeitemdefinitionStatus> status();

  Optional<List<Uri>> derivedFromUri();

  Optional<Code> language();

  Optional<Uri> url();

  Optional<List<Canonical>> replaces();

  Optional<Narrative> text();

  Optional<List<UsageContext>> useContext();

  static ImmutableChargeItemDefinition.ResourceTypeBuildStage builder() {
    return ImmutableChargeItemDefinition.builder();
  }
}
