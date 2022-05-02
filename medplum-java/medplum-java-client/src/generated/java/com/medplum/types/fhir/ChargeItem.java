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
  Optional<Decimal> factorOverride();

  Optional<List<CodeableConcept>> reason();

  Optional<List<Canonical>> definitionCanonical();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> account();

  Optional<DateTime> enteredDate();

  Optional<Uri> implicitRules();

  Optional<Money> priceOverride();

  Optional<List<ChargeItem_Performer>> performer();

  Optional<Reference> costCenter();

  Optional<Quantity> quantity();

  Reference subject();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Reference>> service();

  CodeableConcept code();

  Optional<List<Uri>> definitionUri();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> bodysite();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Reference> requestingOrganization();

  Optional<Reference> enterer();

  Optional<String> overrideReason();

  Optional<List<Reference>> supportingInformation();

  Optional<String> occurrenceDateTime();

  Optional<Reference> performingOrganization();

  Optional<ChargeitemStatus> status();

  Optional<Reference> productReference();

  Optional<List<Annotation>> note();

  Optional<Code> language();

  Optional<Reference> context();

  Optional<List<Reference>> partOf();

  Optional<Period> occurrencePeriod();

  Optional<Timing> occurrenceTiming();

  static ImmutableChargeItem.SubjectBuildStage builder() {
    return ImmutableChargeItem.builder();
  }
}
