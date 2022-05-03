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

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Canonical>> partOf();

  Optional<List<Extension>> modifierExtension();

  Optional<String> version();

  Optional<List<Uri>> derivedFromUri();

  Optional<List<UsageContext>> useContext();

  Optional<Code> language();

  Optional<List<ContactDetail>> contact();

  Optional<DateTime> date();

  Optional<Markdown> copyright();

  Optional<CodeableConcept> code();

  Optional<Period> effectivePeriod();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<Date> approvalDate();

  Optional<ChargeitemdefinitionStatus> status();

  Optional<List<Canonical>> replaces();

  Optional<List<ChargeItemDefinition_Applicability>> applicability();

  Optional<Date> lastReviewDate();

  String resourceType();

  Optional<Meta> meta();

  Optional<Boolean> experimental();

  Optional<String> publisher();

  Optional<Uri> url();

  Optional<Markdown> description();

  Optional<List<Reference>> instance();

  Optional<List<Identifier>> identifier();

  Optional<String> title();

  Optional<List<ChargeItemDefinition_PropertyGroup>> propertyGroup();

  static ImmutableChargeItemDefinition.ResourceTypeBuildStage builder() {
    return ImmutableChargeItemDefinition.builder();
  }
}
