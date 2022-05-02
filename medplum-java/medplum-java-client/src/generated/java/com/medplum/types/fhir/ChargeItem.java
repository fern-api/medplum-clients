package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableChargeItem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ChargeItem {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> definitionCanonical();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<String> occurrenceDateTime();

  Optional<List<CodeableConcept>> bodysite();

  Optional<Reference> requestingOrganization();

  Optional<Reference> context();

  Optional<Reference> costCenter();

  Optional<List<CodeableConcept>> reason();

  Optional<Reference> performingOrganization();

  Reference subject();

  Optional<Reference> productReference();

  Optional<Money> priceOverride();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> supportingInformation();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  CodeableConcept code();

  Optional<List<ChargeItem_Performer>> performer();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<List<Annotation>> note();

  Optional<Reference> enterer();

  String resourceType();

  Optional<ChargeitemStatus> status();

  Optional<Meta> meta();

  Optional<String> overrideReason();

  Optional<List<Reference>> service();

  Optional<Timing> occurrenceTiming();

  Optional<List<Reference>> account();

  Optional<Period> occurrencePeriod();

  Optional<List<Extension>> extension();

  Optional<DateTime> enteredDate();

  Optional<Decimal> factorOverride();

  Optional<List<Uri>> definitionUri();

  Optional<List<Reference>> partOf();

  Optional<Narrative> text();

  Optional<Quantity> quantity();

  static ImmutableChargeItem.SubjectBuildStage builder() {
    return ImmutableChargeItem.builder();
  }
}
