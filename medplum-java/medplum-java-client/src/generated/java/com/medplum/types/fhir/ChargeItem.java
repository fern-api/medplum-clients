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
  Optional<List<Reference>> supportingInformation();

  Optional<List<ResourceList>> contained();

  Optional<Reference> context();

  Optional<List<Annotation>> note();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<List<Canonical>> definitionCanonical();

  Optional<DateTime> enteredDate();

  Optional<List<CodeableConcept>> bodysite();

  Optional<Reference> enterer();

  Optional<Reference> productReference();

  Optional<Reference> requestingOrganization();

  Optional<Reference> costCenter();

  Optional<List<Reference>> service();

  Optional<Quantity> quantity();

  Optional<Id> id();

  Optional<List<ChargeItem_Performer>> performer();

  Optional<String> overrideReason();

  Optional<List<Reference>> partOf();

  Optional<CodeableConcept> productCodeableConcept();

  Optional<Money> priceOverride();

  Optional<Timing> occurrenceTiming();

  Optional<List<Extension>> modifierExtension();

  Optional<ChargeitemStatus> status();

  CodeableConcept code();

  String resourceType();

  Optional<List<Reference>> account();

  Optional<List<CodeableConcept>> reason();

  Reference subject();

  Optional<Narrative> text();

  Optional<String> occurrenceDateTime();

  Optional<Code> language();

  Optional<List<Uri>> definitionUri();

  Optional<Period> occurrencePeriod();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Reference> performingOrganization();

  Optional<Decimal> factorOverride();

  static ImmutableChargeItem.CodeBuildStage builder() {
    return ImmutableChargeItem.builder();
  }
}
