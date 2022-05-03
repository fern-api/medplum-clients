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
  Optional<List<Reference>> service();

  Optional<List<Canonical>> definitionCanonical();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<List<ChargeItem_Performer>> performer();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<ChargeitemStatus> status();

  Optional<Quantity> quantity();

  Optional<Decimal> factorOverride();

  Optional<Uri> implicitRules();

  Optional<List<Annotation>> note();

  Optional<String> occurrenceDateTime();

  Optional<Money> priceOverride();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> enteredDate();

  Optional<List<Reference>> partOf();

  Optional<Reference> requestingOrganization();

  Optional<List<Uri>> definitionUri();

  Optional<Reference> performingOrganization();

  Optional<Reference> context();

  Optional<Reference> costCenter();

  Reference subject();

  Optional<Timing> occurrenceTiming();

  Optional<List<CodeableConcept>> reason();

  Optional<Code> language();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<String> overrideReason();

  CodeableConcept code();

  Optional<List<Reference>> supportingInformation();

  Optional<List<CodeableConcept>> bodysite();

  Optional<Reference> enterer();

  Optional<Reference> productReference();

  Optional<List<Reference>> account();

  Optional<Period> occurrencePeriod();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  static ImmutableChargeItem.SubjectBuildStage builder() {
    return ImmutableChargeItem.builder();
  }
}
